/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.web.databean;

import com.techdhoom.socialstudent.model.Groups;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author SONY
 */
@ManagedBean

public class GroupsDataBean {
      private Long groupmasterId;
private String groupType;

        private Long groupid;
        private String groupname;

    public GroupsDataBean() {
    }

    public GroupsDataBean(Long groupmasterId, String groupType, Long groupid, String groupname) {
        this.groupmasterId = groupmasterId;
        this.groupType = groupType;
        this.groupid = groupid;
        this.groupname = groupname;
    }

    public String getGroupType() {
        return groupType;
    }

    public Long getGroupmasterId() {
        return groupmasterId;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public void setGroupmasterId(Long groupmasterId) {
        this.groupmasterId = groupmasterId;
    }

   
    public Long getGroupid() {
        return groupid;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupid(Long groupid) {
        this.groupid = groupid;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }
        

   
}
