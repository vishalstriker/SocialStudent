/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.captchavalidator;

import com.octo.captcha.service.CaptchaServiceException;
import com.octo.captcha.service.image.ImageCaptchaService;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techdhoom.socialstudent.captcha.servicebean.JCaptchaServiceProxyImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import java.util.logging.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * 
 */
public class CaptchaValidatorBean extends HttpServlet {

    final static Logger logger = Logger.getLogger(CaptchaValidatorBean.class.getName());
    ApplicationContext applicationContext;
    protected int captchaFlag = 0;

    public void validateCaptcha(FacesContext context,
            UIComponent toValidate, Object value) {
        logger.info("********************CAPTCHA VALIDATOR *********************** Captcha");
        HttpServletRequest httpServletRequest = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        HttpServletResponse httpServletResponse = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
        String captchaId = httpServletRequest.getSession().getId();

        if (applicationContext == null) {
            logger.info("*******************Application Context is NULL *********************** Application Context is NULL");
            ServletContext servletContext = (ServletContext) context.getExternalContext().getContext();
            applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
            logger.info("*******************New Application Context*********************** " + applicationContext.getDisplayName());
            logger.info("*******************New Application Context*********************** " + applicationContext.getId());
        }
        JCaptchaServiceProxyImpl captchaService = (JCaptchaServiceProxyImpl) applicationContext.getBean("captchaService");
        System.out.println("CaptchService is " + captchaService);
        if (captchaService.validateReponseForId(captchaId, value) == false) {
            setCaptchaFlag(0);
            try {
                //   doGet(httpServletRequest, httpServletResponse);
                throw new ValidatorException(new FacesMessage("The characters you entered did not match. Please try again"));
            } catch (Exception e) {
                throw new ValidatorException(new FacesMessage(e.getMessage()));
            }
        } else {
            setCaptchaFlag(1);
        }
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        super.init(servletConfig);
    }

    /**
     * This method called by servlet container on every request of a page that having JCaptcha image.
     */
    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(httpServletRequest.getSession().getServletContext());
        ImageCaptchaService imageCaptchaService = (ImageCaptchaService) applicationContext.getBean("jcaptchaService");
        byte[] captchaChallengeAsJpeg = null;
        /**
         * the output stream to render the captcha image as jpeg into
         */
        ByteArrayOutputStream jpegOutputStream = new ByteArrayOutputStream();
        try {
            /**
             * get the session id that will identify the generated captcha.
             * the same id must be used to validate the response, the session id
             * is a good candidate!
             * 
             */
            String captchaId = httpServletRequest.getSession().getId();
            /**
             * call the ImageCaptchaService getChallenge method
             */
            BufferedImage challenge = imageCaptchaService.getImageChallengeForID(captchaId, httpServletRequest.getLocale());
            javax.imageio.ImageIO.write(challenge, "jpg", jpegOutputStream);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            httpServletResponse.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        } catch (CaptchaServiceException e) {
            e.printStackTrace();
            httpServletResponse.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            return;
        }
        captchaChallengeAsJpeg = jpegOutputStream.toByteArray();
        /**
         * flush it in the response
         */
        httpServletResponse.setHeader("Cache-Control", "no-store");
        httpServletResponse.setHeader("Pragma", "no-cache");
        httpServletResponse.setDateHeader("Expires", 0);
        httpServletResponse.setContentType("image/jpeg");
        ServletOutputStream responseOutputStream = httpServletResponse.getOutputStream();
        responseOutputStream.write(captchaChallengeAsJpeg);
        responseOutputStream.flush();
        responseOutputStream.close();
    }

    public int getCaptchaFlag() {
        return captchaFlag;
    }

    public void setCaptchaFlag(int captchaFlag) {
        this.captchaFlag = captchaFlag;
    }
}
