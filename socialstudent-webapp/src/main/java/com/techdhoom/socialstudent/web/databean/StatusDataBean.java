/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.web.databean;

import com.techdhoom.socialstudent.model.Usermain;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author krunal
 */
@ManagedBean
@RequestScoped
public class StatusDataBean {
    private Long statusid;
    private String yourstatus;
     private Usermain userid;

    public StatusDataBean() {
    }

    public StatusDataBean(Long statusid, String yourstatus, Usermain userid) {
        this.statusid = statusid;
        this.yourstatus = yourstatus;
        this.userid = userid;
    }

    public Long getStatusid() {
        return statusid;
    }

    public Usermain getUserid() {
        return userid;
    }

    public String getYourstatus() {
        return yourstatus;
    }

    public void setStatusid(Long statusid) {
        this.statusid = statusid;
    }

    public void setUserid(Usermain userid) {
        this.userid = userid;
    }

    public void setYourstatus(String yourstatus) {
        this.yourstatus = yourstatus;
    }
     
}
