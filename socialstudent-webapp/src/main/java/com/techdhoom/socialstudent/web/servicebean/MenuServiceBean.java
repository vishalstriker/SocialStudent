/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.web.servicebean;

import com.techdhoom.socialstudent.web.databean.LoginDataBean;
import com.techdhoom.socialstudent.web.util.SystemConstantUtil;
import com.techdhoom.socialstudent.web.util.SystemResultSessionUtil;
import com.techdhoom.socialstudent.web.util.SystemResultViewUtil;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import org.springframework.util.StringUtils;

/**
 *
 * @author ncontractor
 */
@ManagedBean(name = "menuServiceBean")
@RequestScoped
public class MenuServiceBean {

    //  DataBean properties
    @ManagedProperty("#{loginDataBean}")
    private LoginDataBean loginDataBean;
    //  Other properties
    @ManagedProperty("#{systemResultSessionUtil}")
    private SystemResultSessionUtil systemResultSessionUtil;
    @ManagedProperty("#{systemResultViewUtil}")
    private SystemResultViewUtil systemResultViewUtil;

    public SystemResultViewUtil getSystemResultViewUtil() {
        return systemResultViewUtil;
    }

    public void setSystemResultViewUtil(SystemResultViewUtil systemResultViewUtil) {
        this.systemResultViewUtil = systemResultViewUtil;
    }

    public SystemResultSessionUtil getSystemResultSessionUtil() {
        return systemResultSessionUtil;
    }

    public void setSystemResultSessionUtil(SystemResultSessionUtil systemResultSessionUtil) {
        this.systemResultSessionUtil = systemResultSessionUtil;
    }

    public LoginDataBean getLoginDataBean() {
        return loginDataBean;
    }

    public void setLoginDataBean(LoginDataBean loginDataBean) {
        this.loginDataBean = loginDataBean;
    }

    public String loginNavigate() {
        FacesContext context = FacesContext.getCurrentInstance();
        String id = context.getExternalContext().getRequestParameterMap().get("id").toString();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(true);
        if (StringUtils.hasText(id)) {
            loginDataBean.setLoginMenuId(id);
            if (!loginDataBean.getIsLoggedin()) {
                session.setAttribute(SystemConstantUtil.AUTHENTICATED_MENU_ID, loginDataBean.getLoginMenuId());
                id = "authentication?faces-redirect=true";
            } else {
                id = "pretty:" + id;
            }
        } else {
            session.setAttribute(SystemConstantUtil.AUTHENTICATED_MENU_ID, null);
            id = "authentication?faces-redirect=true";
            loginDataBean.setLoginMenuId(id);
        }
        System.out.println("###Menu " + id);
        return id;
    }

    public String menuNavigate() {
        FacesContext context = FacesContext.getCurrentInstance();
        String id = context.getExternalContext().getRequestParameterMap().get("id").toString();
        if (StringUtils.hasText(id)) {
            if (id.trim().equalsIgnoreCase("pbstudio")) {
//                if (loginDataBean.getRole().equalsIgnoreCase(SystemConstantUtil.ROLE_SUPER_ADMIN)) {
//                    id = SystemConstantUtil.ROLE_SUPER_ADMIN_PAGE;
//                } else if (loginDataBean.getRole().equalsIgnoreCase(SystemConstantUtil.ROLE_ADMIN)) {
//                    id = SystemConstantUtil.ROLE_ADMIN_PAGE;
//                } else if (loginDataBean.getRole().equalsIgnoreCase(SystemConstantUtil.ROLE_CHIEF_TRAINER)) {
//                    id = SystemConstantUtil.ROLE_CHIEF_TRAINER_PAGE;
//                } else if (loginDataBean.getRole().equalsIgnoreCase(SystemConstantUtil.ROLE_TRAINER)) {
//                    id = SystemConstantUtil.ROLE_TRAINER_PAGE;
//                } else if (loginDataBean.getRole().equalsIgnoreCase(SystemConstantUtil.ROLE_STUDIO_MEMBER)) {
//                    id = SystemConstantUtil.ROLE_STUDIO_MEMBER_PAGE;
//                } else if (loginDataBean.getRole().equalsIgnoreCase(SystemConstantUtil.ROLE_MEMBER)) {
//                    id = SystemConstantUtil.ROLE_MEMBER_PAGE;
//                }
            }
            if (!id.contains("pretty:")) {
                id = "pretty:" + id;
            }
            loginDataBean.setLoginMenuId(id);
        } else {
            id = "login";
            loginDataBean.setLoginMenuId(id);
        }

        System.out.println("in menu navigate method... ###Menu " + id);
        return id;
    }
}
