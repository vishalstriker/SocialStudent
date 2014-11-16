/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tapan
 */
@Entity
@Table(name = "groupmember")
public class Groupmember implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "groupmember_id")
    private Long groupmemberId;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne
    private Usermain userId;
    @JoinColumn(name = "group_id", referencedColumnName = "group_id")
    @ManyToOne
    private Group1 groupId;

    public Groupmember() {
    }

    public Groupmember(Long groupmemberId) {
        this.groupmemberId = groupmemberId;
    }

    public Long getGroupmemberId() {
        return groupmemberId;
    }

    public void setGroupmemberId(Long groupmemberId) {
        this.groupmemberId = groupmemberId;
    }

    public Usermain getUserId() {
        return userId;
    }

    public void setUserId(Usermain userId) {
        this.userId = userId;
    }

    public Group1 getGroupId() {
        return groupId;
    }

    public void setGroupId(Group1 groupId) {
        this.groupId = groupId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (groupmemberId != null ? groupmemberId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Groupmember)) {
            return false;
        }
        Groupmember other = (Groupmember) object;
        if ((this.groupmemberId == null && other.groupmemberId != null) || (this.groupmemberId != null && !this.groupmemberId.equals(other.groupmemberId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.techdhoom.socialstudent.model.Groupmember[ groupmemberId=" + groupmemberId + " ]";
    }
    
}
