/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.web.databean;

import com.techdhoom.socialstudent.model.Groups;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.persistence.*;
import org.springframework.jmx.export.annotation.ManagedAttribute;

/**
 *
 * @author SONY
 */
@ManagedBean
public class UsersDataBean {
   
    private Long userid;
    private String mNo;
    private String firstname;
   
   

    public UsersDataBean() {
    }

    public UsersDataBean(Long userid, String firstname) {
        this.userid = userid;
        this.firstname = firstname;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

}
