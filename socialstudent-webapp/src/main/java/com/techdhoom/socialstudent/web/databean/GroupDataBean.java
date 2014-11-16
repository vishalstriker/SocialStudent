/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.web.databean;

import com.techdhoom.socialstudent.model.Groupmaster;
import com.techdhoom.socialstudent.model.Usermain;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author krunal
 */
@ManagedBean
@RequestScoped
public class GroupDataBean {
    private Long groupId;
      private String groupname;
       private Usermain createdBy;
         private Groupmaster groupType;

    public GroupDataBean() {
    }

    public GroupDataBean(Long groupId, String groupname, Usermain createdBy, Groupmaster groupType) {
        this.groupId = groupId;
        this.groupname = groupname;
        this.createdBy = createdBy;
        this.groupType = groupType;
    }

    public Usermain getCreatedBy() {
        return createdBy;
    }

    public Long getGroupId() {
        return groupId;
    }

    public Groupmaster getGroupType() {
        return groupType;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setCreatedBy(Usermain createdBy) {
        this.createdBy = createdBy;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public void setGroupType(Groupmaster groupType) {
        this.groupType = groupType;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }
         
}
