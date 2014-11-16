package com.techdhoom.socialstudent.captcha.servicebean;

import com.octo.captcha.service.CaptchaServiceException;
import com.octo.captcha.service.image.ImageCaptchaService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * 
 * This Class(Servlet) is used create JCaptcha image at run time and put that image
 * at client side. 
 * @author 
 *
 */
public class JCaptchaImageServlet extends HttpServlet {
    @Override
	public void init(ServletConfig servletConfig) throws ServletException {
		super.init(servletConfig);
	}
	/**
	 * This method called by servlet container on every request of a page that having JCaptcha image.
	 */
    @Override
	protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
		ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
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
}
