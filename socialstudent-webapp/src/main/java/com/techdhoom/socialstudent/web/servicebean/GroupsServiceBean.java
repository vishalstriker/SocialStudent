/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.web.servicebean;

import com.techdhoom.socialstudent.core.GroupMasterCore;
import com.techdhoom.socialstudent.core.UserCore;
import com.techdhoom.socialstudent.model.Groupmaster;
import com.techdhoom.socialstudent.web.databean.GroupsDataBean;
import com.techdhoom.socialstudent.web.databean.UsersDataBean;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author SONY
 */
@ManagedBean
@RequestScoped
public class GroupsServiceBean {
 @ManagedProperty(value = "#{groupsDataBean}")
       private GroupsDataBean groupsDataBean;
 @ManagedProperty(value = "#{groupMasterCore}")
    public GroupMasterCore groupMasterCore;
    List<GroupsDataBean> groupsDataBeanList;

    public GroupsServiceBean() {
    }

    public GroupsServiceBean(GroupsDataBean groupsDataBean) {
        this.groupsDataBean = groupsDataBean;
    }

    public void setGroupsDataBean(GroupsDataBean groupsDataBean) {
        this.groupsDataBean = groupsDataBean;
    }

    public GroupsDataBean getGroupsDataBean() {
        return groupsDataBean;
    }

    public List<GroupsDataBean> getGroupsDataBeanList() {
        return groupsDataBeanList;
    }

    public GroupMasterCore getGroupMasterCore() {
        return groupMasterCore;
    }

    public void setGroupMasterCore(GroupMasterCore groupMasterCore) {
        this.groupMasterCore = groupMasterCore;
    }

    public void setGroupsDataBeanList(List<GroupsDataBean> groupsDataBeanList) {
        this.groupsDataBeanList = groupsDataBeanList;
    }
 
    
    public void retriveAllGroupMaster(){
         this.setGroupsDataBeanList(new ArrayList<GroupsDataBean>());
        for (Groupmaster groupMaster : groupMasterCore.retrieveAllGroupmasters()) {
//            Users u = userContact.get(users.getUserid());
            GroupsDataBean bean = new GroupsDataBean(groupMaster.getGroupmasterId(),groupMaster.getGroupType(),null,null);
            this.groupsDataBeanList.add(bean);
        }
    }
    
    
}
