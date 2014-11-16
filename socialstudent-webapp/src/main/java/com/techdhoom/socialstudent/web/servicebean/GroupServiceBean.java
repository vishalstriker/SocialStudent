/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.web.servicebean;

import com.techdhoom.socialstudent.core.GroupCore;
import com.techdhoom.socialstudent.model.Group1;
import com.techdhoom.socialstudent.web.databean.GroupDataBean;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author krunal
 */
@ManagedBean
public class GroupServiceBean {
    @ManagedProperty(value="#{groupDataBean}")
    private GroupDataBean groupDataBean;
    @ManagedProperty(value="#{groupCore}")
    private GroupCore groupCore;
    public GroupServiceBean() {
    }

    public GroupServiceBean(GroupDataBean groupDataBean) {
        this.groupDataBean = groupDataBean;
    }

    public GroupDataBean getGroupDataBean() {
        return groupDataBean;
    }

    public void setGroupDataBean(GroupDataBean groupDataBean) {
        this.groupDataBean = groupDataBean;
    }

    public GroupCore getGroupCore() {
        return groupCore;
    }

    public void setGroupCore(GroupCore groupCore) {
        this.groupCore = groupCore;
    }
    public List<Group1> retriveAllGroup(){
        return groupCore.retrieveAllGroup();
    }
    
    
     public void createGroup(){
    Group1 group=new Group1();
         group.setGroupname(groupDataBean.getGroupname());
         groupCore.createGroup(group);
}
}