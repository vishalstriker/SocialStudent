/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.web.servicebean;

import com.techdhoom.socialstudent.web.databean.LoginDataBean;
import com.techdhoom.socialstudent.web.util.SystemConstantUtil;
import com.techdhoom.socialstudent.web.util.UserAppUtil;
import java.io.IOException;
import java.util.logging.Level;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.jasypt.util.password.BasicPasswordEncryptor;

/**
 * This class is service bean for Login which contains the methods for Login functionality.
 * @author mpritmani
 */
@ManagedBean(name = "loginServiceBean")
@RequestScoped
public class LoginServiceBean {

    //  DataBean properties
    @ManagedProperty("#{loginDataBean}")
    private LoginDataBean loginDataBean;
    //  Transformer properties
//    @ManagedProperty("#{loginTransformerBean}")
//    private LoginTransformerBean loginTransformerBean;
    //  User defined objects
    @ManagedProperty("#{userAppUtil}")
    private UserAppUtil userAppUtil;
    @ManagedProperty("#{userTransformerBean}")
//    private UserTransformerBean userTransformerBean;
//    @ManagedProperty("#{userDataBean}")
//    private UserDataBean userDataBean;
//    @ManagedProperty(value = "#{basicPasswordEncryptor}")
    private BasicPasswordEncryptor basicPasswordEncryptor;
    //  Other properties
    private static final Logger logger = Logger.getLogger(LoginServiceBean.class);

//    public UserDataBean getUserDataBean() {
//        return userDataBean;
//    }
//
//    public void setUserDataBean(UserDataBean userDataBean) {
//        this.userDataBean = userDataBean;
//    }
//
//    public UserTransformerBean getUserTransformerBean() {
//        return userTransformerBean;
//    }
//
//    public void setUserTransformerBean(UserTransformerBean userTransformerBean) {
//        this.userTransformerBean = userTransformerBean;
//    }

    public UserAppUtil getUserAppUtil() {
        return userAppUtil;
    }

    public void setUserAppUtil(UserAppUtil userAppUtil) {
        this.userAppUtil = userAppUtil;
    }

    public LoginDataBean getLoginDataBean() {
        return loginDataBean;
    }

    public void setLoginDataBean(LoginDataBean loginDataBean) {
        this.loginDataBean = loginDataBean;
    }

//    public LoginTransformerBean getLoginTransformerBean() {
//        return loginTransformerBean;
//    }
//
//    public void setLoginTransformerBean(LoginTransformerBean loginTransformerBean) {
//        this.loginTransformerBean = loginTransformerBean;
//    }

    public BasicPasswordEncryptor getBasicPasswordEncryptor() {
        return basicPasswordEncryptor;
    }

    public void setBasicPasswordEncryptor(BasicPasswordEncryptor basicPasswordEncryptor) {
        this.basicPasswordEncryptor = basicPasswordEncryptor;
    }

    /**
     * Method checks for user authentication. If the user is authenticated, he's redirected to the default page of the role which user owns
     * @throws ServletException
     * @throws IOException 
     */
    public void doLogin() throws ServletException, IOException {

        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();

        FacesContext facesContext = FacesContext.getCurrentInstance();

        loginDataBean.setUserId(loginDataBean.getUserId().toLowerCase());
        String userId = this.loginDataBean.getUserId();
        System.out.println("User id in dologin method : " + userId);
        System.out.println("User password dologin method : " + loginDataBean.getPassword());
//        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        if (userId != null && !userId.trim().equalsIgnoreCase("")) {
            RequestDispatcher dispatcher = ((ServletRequest) context.getRequest()).getRequestDispatcher("/j_spring_security_check?j_username=" + loginDataBean.getUserId() + "&j_password=" + loginDataBean.getPassword());
            dispatcher.forward((ServletRequest) context.getRequest(), (ServletResponse) context.getResponse());
            FacesContext.getCurrentInstance().responseComplete();
        }

        //  code for successful authenticated users
        try {
            HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);

            String sessionAuthentication = (String) session.getAttribute(SystemConstantUtil.AUTHENTICATED_SESSION);

            if (sessionAuthentication != null && sessionAuthentication.trim().equalsIgnoreCase("true")) {

                if (userId == null) {
                    userId = (String) session.getAttribute("SPRING_SECURITY_LAST_USERNAME");
                }

                if (userId != null) {
                    userId = userId.trim();
                }
                //  update user's last login information
//                this.loginTransformerBean.updateLoginData(userId);

                if (this.userAppUtil.isUserInList(userId) && !this.userAppUtil.isSameUserSession(userId, session.getId())) {
                    this.userAppUtil.removeUser(userId);
                }

                if (!this.userAppUtil.isUserInList(userId)) {
                    this.userAppUtil.addUser(userId, this.loginDataBean.getRole(), session);
                }

                this.loginDataBean.setIsLoggedin(true);
               
            }

        } catch (Exception e) {
            logger.error(e);
            e.printStackTrace();
        }


    }

    /**
     * Method for logging out the user
     */
    public void doLogout() {
        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
        RequestDispatcher dispatcher = ((ServletRequest) context.getRequest()).getRequestDispatcher("/j_spring_security_logout");
        try {
            dispatcher.forward((ServletRequest) context.getRequest(), (ServletResponse) context.getResponse());
        } catch (ServletException ex) {
            logger.error(ex);
        } catch (IOException ex) {
            logger.error(ex);
        }
        FacesContext.getCurrentInstance().responseComplete();
        this.loginDataBean.setIsLoggedin(false);
        String userId = this.loginDataBean.getUserId();
        if (userId != null && !userId.trim().equalsIgnoreCase("") && this.userAppUtil.isUserInList(userId)) {
            this.userAppUtil.removeUser(userId);
        }

    }

    public void checkCookie() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        String cookieName = null;
        Cookie cookie[] = ((HttpServletRequest) facesContext.getExternalContext().getRequest()).getCookies();

        if (cookie != null && cookie.length > 0) {
            for (int i = 0; i < cookie.length; i++) {
                cookieName = cookie[i].getName();
                if (cookieName.equals("USERID")) {
                    this.loginDataBean.setUserId(cookie[i].getValue());
                } else if (cookieName.equals("PASSWORD")) {
                    this.loginDataBean.setPassword(cookie[i].getValue());
                } else if (cookieName.equals("REMEMBERME")) {
                    this.loginDataBean.setRememberMe(Boolean.parseBoolean(cookie[i].getValue()));
                }
            }
            logger.info("Cookie Found");
        } else {
            logger.info("Cannot find any cookie");
        }
    }

//    public void facebookLogin() {
//        if (this.loginDataBean.getUserId() != null) {
//            this.userDataBean.setUserId(this.loginDataBean.getUserId());
//            Boolean isUserExist = this.userTransformerBean.isUserExist(this.userDataBean.getUserId());
//            if (!isUserExist) {
//                this.userDataBean.setPassword("yummy1231");
//                this.userDataBean.setStatus(SystemConstantUtil.ACTIVE);
////                loginDataBean.setUserId(this.userDataBean.getUserId());
//                String response = this.userTransformerBean.registerUser(userDataBean, true);
//                System.out.println("Response to facebook user register  : " + response);
//                if (response.equalsIgnoreCase(SystemConstantUtil.SUCCESS)) {
//                    System.out.println("Created user via fb..................");
//                }
//            }
//            loginDataBean.setUserId(this.userDataBean.getUserId());
//            String password = "yummy1231";
//            loginDataBean.setPassword(password);
//            userDataBean.setUserId(null);
//            try {
//                if (userTransformerBean.isUserExist(this.loginDataBean.getUserId())) {
//                    System.out.println("User reflected successfully in database.");
//                    this.doLogin();
//                } else {
//                    System.out.println("User still not reflected to database.");
//                }
//            } catch (ServletException ex) {
//                java.util.logging.Logger.getLogger(LoginServiceBean.class.getName()).log(Level.SEVERE, null, ex);
//                ex.printStackTrace();
//            } catch (IOException ex) {
//                java.util.logging.Logger.getLogger(LoginServiceBean.class.getName()).log(Level.SEVERE, null, ex);
//                ex.printStackTrace();
//            }
//
//
//        }

//    }

    public void redirectToUserHome() {
//        FacesContext fc = FacesContext.getCurrentInstance();
//        String contextPath = fc.getExternalContext().getRequestContextPath();
//        UserRightsDataBean userRightsDataBean = this.getLoginTransformerBean().getUserRightsDataBean();
//        try {
//            String result = contextPath + "/myProfile";
//            if (userRightsDataBean.isHaveManageRosterRights()) {
//                result = contextPath + "/manageShift";
//            } else if (userRightsDataBean.isHaveSessionRoster()) {
//                result = contextPath + "/currentSession";
//            } else if (userRightsDataBean.isHaveManageProgramsRights()) {
//                result = contextPath + "/searchProgram";
//            }
//            this.loginDataBean.setLendingPage(result);
//            fc.getExternalContext().redirect(result);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
    }
}

