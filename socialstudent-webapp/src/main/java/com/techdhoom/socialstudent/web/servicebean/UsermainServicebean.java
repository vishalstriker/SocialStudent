/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.web.servicebean;

import com.techdhoom.socialstudent.core.StatusCore;
import com.techdhoom.socialstudent.core.UsermainCore;
import com.techdhoom.socialstudent.model.Group1;
import com.techdhoom.socialstudent.model.Status;
import com.techdhoom.socialstudent.model.Usermain;
import com.techdhoom.socialstudent.web.databean.StatusDataBean;
import com.techdhoom.socialstudent.web.databean.UsermainDatabean;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author krunal
 */
@ManagedBean
@SessionScoped
public class UsermainServicebean {

    @ManagedProperty(value = "#{usermainDatabean}")
    private UsermainDatabean usermainDatabean;
    @ManagedProperty(value = "#{usermainCore}")
    public UsermainCore usermainCore;
    @ManagedProperty(value = "#{statusCore}")
    public StatusCore statusCore;
    List<UsermainDatabean> usermainDatabeanlist;
    List<StatusDataBean> statusDataBeanList;
    List<UsermainDatabean> usermainDatabeanlist1;
    private String userName;
    private String imagePath;

    public UsermainServicebean() {
    }

    public void setStatusCore(StatusCore statusCore) {
        this.statusCore = statusCore;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return "C:\\image\\" + userName + ".jpg";
    }

    public StatusCore getStatusCore() {
        return statusCore;
    }

    public UsermainCore getUsermainCore() {
        return usermainCore;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUsermainCore(UsermainCore usermainCore) {
        this.usermainCore = usermainCore;
    }

    public UsermainDatabean getUsermainDatabean() {
        return usermainDatabean;
    }

    public void setUsermainDatabean(UsermainDatabean usermainDatabean) {
        this.usermainDatabean = usermainDatabean;
    }

    public List<UsermainDatabean> getUsermainDatabeanlist() {

        return usermainDatabeanlist;
    }

    public void setStatusDataBeanList(List<StatusDataBean> statusDataBeanList) {
        this.statusDataBeanList = statusDataBeanList;
    }

    public List<StatusDataBean> getStatusDataBeanList() {
        return statusDataBeanList;
    }

    public List<UsermainDatabean> getUsermainDatabeanlist1() {
        return usermainDatabeanlist1;
    }

    public void setUsermainDatabeanlist1(List<UsermainDatabean> usermainDatabeanlist1) {
        this.usermainDatabeanlist1 = usermainDatabeanlist1;
    }

    public void setUsermainDatabeanlist(List<UsermainDatabean> usermainDatabeanlist) {
        this.usermainDatabeanlist = usermainDatabeanlist;
    }

    public void retriveAllUsermain() {

        this.setUsermainDatabeanlist(new ArrayList<UsermainDatabean>());
        for (Usermain usermain : usermainCore.retrieveAllUsermain()) {
            UsermainDatabean usermainData = new UsermainDatabean(null, null, null, null, usermain.getUsername(), null, null, null, null);
            this.usermainDatabeanlist.add(usermainData);
        }

    }
//   public void retriveUsermainByEmailId(){
//        this.setUsermainDatabeanlist(new ArrayList<UsermainDatabean>());
//        System.out.println(this.userName);
//         for(Usermain  usermain:usermainCore.retriveUsernameByEmailId("manankhh@gmail.com")){
//             UsermainDatabean usermainData=new  UsermainDatabean(usermain.getUsername());
//            this.usermainDatabeanlist1.add(usermainData);
//         }
//   }

    public List<Usermain> retriveUsermainByEmailId() {
        return usermainCore.retriveUsernameByEmailId(userName);
    }

    public void retriveStatusByEmailId() {
        this.setStatusDataBeanList(new ArrayList<StatusDataBean>());
//         Usermain usermain=new Usermain(4l);

        for (Status status : statusCore.retriveStatusByUserName(userName)) {
            StatusDataBean statusData = new StatusDataBean(status.getStatusid(), status.getYourstatus(), null);
            this.statusDataBeanList.add(statusData);
        }
    }

    public List<Group1> retriveGroupByUsermainEmailId() {
        return usermainCore.retriveGruopByUsermainEmailId(userName);
    }
}
