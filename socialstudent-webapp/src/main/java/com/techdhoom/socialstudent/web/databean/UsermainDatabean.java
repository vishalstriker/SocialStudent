/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.web.databean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author krunal
 */
@ManagedBean
@RequestScoped
public class UsermainDatabean {
    
    private String branch;
    
    private Integer enrollNo;
    //@Column(name = "user_type")
    private String userType;
    //@Column(name = "userlastname")
    private String userlastname;
    //@Column(name = "username")
    private String username;
    //@Column(name = "year")
    private Integer year;
    //@Column(name = "email_id")
    private String emailId;
    //@Column(name = "password")
    private String password;
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Basic(optional = false)
    //@Column(name = "user_id")
    private Long userId;

    public UsermainDatabean() {
    }

    public UsermainDatabean(String branch, Integer enrollNo, String userType, String userlastname, String username, Integer year, String emailId, String password, Long userId) {
        this.branch = branch;
        this.enrollNo = enrollNo;
        this.userType = userType;
        this.userlastname = userlastname;
        this.username = username;
        this.year = year;
        this.emailId = emailId;
        this.password = password;
        this.userId = userId;
    }

    public String getBranch() {
        return branch;
    }

    public String getEmailId() {
        return emailId;
    }

    public Integer getEnrollNo() {
        return enrollNo;
    }

    public String getPassword() {
        return password;
    }

    public Long getUserId() {
        return userId;
    }

    public String getUserType() {
        return userType;
    }

    public String getUserlastname() {
        return userlastname;
    }

    public String getUsername() {
        return username;
    }

    public Integer getYear() {
        return year;
    }

    
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setEnrollNo(Integer enrollNo) {
        this.enrollNo = enrollNo;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setUserlastname(String userlastname) {
        this.userlastname = userlastname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    
}
