/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.web.servicebean;

import com.techdhoom.socialstudent.core.StatusCore;
import com.techdhoom.socialstudent.core.impl.StatusCoreImpl;
import com.techdhoom.socialstudent.model.Status;
import com.techdhoom.socialstudent.web.databean.StatusDataBean;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author kprunal
 */
@ManagedBean
public class StatusServiceBean {
    @ManagedProperty(value="#{statusDataBean}")
    private StatusDataBean statusDataBean;
    private String StatusCreate;
    @ManagedProperty(value="#{statusCore}")
    private StatusCore statusCore;
    List<StatusDataBean> statusDataBeanList;
    public StatusServiceBean() {
    }

    public StatusServiceBean(StatusDataBean statusDataBean) {
        this.statusDataBean = statusDataBean;
    }

    public StatusCore getStatusCore() {
        return statusCore;
    }

    public void setStatusCore(StatusCore statusCore) {
        this.statusCore = statusCore;
    }

    public void setStatusDataBeanList(List<StatusDataBean> statusDataBeanList) {
        this.statusDataBeanList = statusDataBeanList;
    }

    public List<StatusDataBean> getStatusDataBeanList() {
        return statusDataBeanList;
    }

    public StatusDataBean getStatusDataBean() {
        return statusDataBean;
    }

    public void setStatusDataBean(StatusDataBean statusDataBean) {
        this.statusDataBean = statusDataBean;
    }

    public void setStatusCreate(String StatusCreate) {
        this.StatusCreate = StatusCreate;
    }

    public String getStatusCreate() {
        return StatusCreate;
    }
     public void statusCreate(){
         Status status=new Status();
         status.setYourstatus(statusDataBean.getYourstatus());
         //status.setUserid(statusDataBean.getUserid());
         //StatusCore  statusCore=new StatusCoreImpl();
         statusCore.createStatus(status);
     }
     public void retriveAllStatus(){
         this.setStatusDataBeanList(new ArrayList<StatusDataBean>());
         for(Status status:statusCore.retrieveallStatus()){
             StatusDataBean statusData=new StatusDataBean(status.getStatusid(),status.getYourstatus(), null);
            this.statusDataBeanList.add(statusData);
         }
     }
}
