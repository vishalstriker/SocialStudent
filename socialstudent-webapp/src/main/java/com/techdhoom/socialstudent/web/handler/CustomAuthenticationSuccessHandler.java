/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.web.handler;

import com.techdhoom.socialstudent.web.util.SystemConstantUtil;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.util.StringUtils;

/**
 * This is the class to handle the event for successful authentication.
 * @author ncontractor
 */
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    //  Other properties
    private static final Logger logger = Logger.getLogger(CustomAuthenticationSuccessHandler.class);

    /**
     * Method is called when successful authentication done
     * @param request
     * @param response
     * @param authentication
     * @throws IOException
     * @throws ServletException 
     */
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        logger.info("---------------Custom Authentication Success Handler----------------");

        //        Setting Cookies to the user browser if remember me is enabled else removing existing cookies
        Cookie userIdCookie;
        Cookie passwordCookie;
        Cookie rememberMeCookie;

        if (request.getParameter("_spring_security_remember_me") != null) {
            userIdCookie = new Cookie("USERID", authentication.getName());
            passwordCookie = new Cookie("PASSWORD", request.getParameter("j_password"));
            rememberMeCookie = new Cookie("REMEMBERME", "true");

            int age=3600*24*14;
            userIdCookie.setMaxAge(age);
            passwordCookie.setMaxAge(age);
            rememberMeCookie.setMaxAge(age);

            userIdCookie.setPath("/");
            passwordCookie.setPath("/");
            rememberMeCookie.setPath("/");
        } else {
            userIdCookie = new Cookie("USERID", "");
            passwordCookie = new Cookie("PASSWORD", "");
            rememberMeCookie = new Cookie("REMEMBERME", "false");

            userIdCookie.setMaxAge(0);
            passwordCookie.setMaxAge(0);
            rememberMeCookie.setMaxAge(0);

            userIdCookie.setPath("/");
            passwordCookie.setPath("/");
            rememberMeCookie.setPath("/");
        }
        response.addCookie(userIdCookie);
        response.addCookie(passwordCookie);
        response.addCookie(rememberMeCookie);

        String menuId = (String) request.getSession(true).getAttribute(SystemConstantUtil.AUTHENTICATED_MENU_ID);
//        Redirection of the page according to the role of user
        if(StringUtils.hasText(menuId)) {
            response.sendRedirect(menuId);
        } else {
            if (request.isUserInRole(SystemConstantUtil.ROLE_SUPER_ADMIN)) {
                response.sendRedirect(SystemConstantUtil.ROLE_SUPER_ADMIN_PAGE);
//            } else if (request.isUserInRole(SystemConstantUtil.ROLE_ADMIN)) {
//                response.sendRedirect(SystemConstantUtil.ROLE_ADMIN_PAGE);
//            } 
//            else if (request.isUserInRole(SystemConstantUtil.ROLE_CHIEF_TRAINER)) {
//                response.sendRedirect(SystemConstantUtil.ROLE_CHIEF_TRAINER_PAGE);
//            } else if (request.isUserInRole(SystemConstantUtil.ROLE_TRAINER)) {
//                response.sendRedirect(SystemConstantUtil.ROLE_TRAINER_PAGE);
//            } 
//            else if (request.isUserInRole(SystemConstantUtil.ROLE_STUDIO_MEMBER)) {
//                response.sendRedirect(SystemConstantUtil.ROLE_STUDIO_MEMBER_PAGE);
//            } else if (request.isUserInRole(SystemConstantUtil.ROLE_MEMBER)) {
//                response.sendRedirect(SystemConstantUtil.ROLE_MEMBER_PAGE);
            }
        }


//        Setting the authenticated session flag
        request.getSession(true).setAttribute(SystemConstantUtil.AUTHENTICATED_SESSION, "true");
    }
}
