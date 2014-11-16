/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.web.databean;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author mpritmani
 */
@ManagedBean(name = "loginDataBean")
@SessionScoped
public class LoginDataBean {

    private String name;
    private String userId;
    private String password;
    private Date lastLoginDateTime;
    private String timezone;
    private String role;
    private boolean rememberMe;
    private String preferredLanguage;
    private boolean allowRxpadKeys;
    private boolean allowRxpadShortcuts;
    private boolean isLoggedin;
    private String loginMenuId;
    private String profilePicture;
    private long id;
    private boolean hasActiveSubscription;
    private String lendingPage;

    public String getLendingPage() {
        return lendingPage;
    }

    public void setLendingPage(String lendingPage) {
        this.lendingPage = lendingPage;
    }        

    public boolean isHasActiveSubscription() {
        return hasActiveSubscription;
    }

    public void setHasActiveSubscription(boolean hasActiveSubscription) {
        this.hasActiveSubscription = hasActiveSubscription;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLoginMenuId() {
        return loginMenuId;
    }

    public void setLoginMenuId(String loginMenuId) {
        this.loginMenuId = loginMenuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getLastLoginDateTime() {
        return lastLoginDateTime;
    }

    public void setLastLoginDateTime(Date lastLoginDateTime) {
        this.lastLoginDateTime = lastLoginDateTime;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    public boolean isAllowRxpadKeys() {
        return allowRxpadKeys;
    }

    public void setAllowRxpadKeys(boolean allowRxpadKeys) {
        this.allowRxpadKeys = allowRxpadKeys;
    }

    public boolean isAllowRxpadShortcuts() {
        return allowRxpadShortcuts;
    }

    public void setAllowRxpadShortcuts(boolean allowRxpadShortcuts) {
        this.allowRxpadShortcuts = allowRxpadShortcuts;
    }

    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public boolean getIsLoggedin() {
        return isLoggedin;
    }

    public void setIsLoggedin(boolean isLoggedin) {
        this.isLoggedin = isLoggedin;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }
    
}
