/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.model;

import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author tapan
 */
@Entity
@Table(name = "group1")
public class Group1 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id")
    private Long groupId;
    @Column(name = "groupname")
    private String groupname;
    @OneToMany(mappedBy = "groupId")
    private Collection<Groupmember> groupmemberCollection;
    @JoinColumn(name = "updated_by", referencedColumnName = "user_id")
    @ManyToOne
    private Usermain updatedBy;
    @JoinColumn(name = "created_by", referencedColumnName = "user_id")
    @ManyToOne
    private Usermain createdBy;
    @JoinColumn(name = "groupowner", referencedColumnName = "user_id")
    @ManyToOne
    private Usermain groupowner;
    @JoinColumn(name = "group_type", referencedColumnName = "groupmaster_id")
    @ManyToOne
    private Groupmaster groupType;

    public Group1() {
    }

    public Group1(Long groupId) {
        this.groupId = groupId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    @XmlTransient
    public Collection<Groupmember> getGroupmemberCollection() {
        return groupmemberCollection;
    }

    public void setGroupmemberCollection(Collection<Groupmember> groupmemberCollection) {
        this.groupmemberCollection = groupmemberCollection;
    }

    public Usermain getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Usermain updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Usermain getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Usermain createdBy) {
        this.createdBy = createdBy;
    }

    public Usermain getGroupowner() {
        return groupowner;
    }

    public void setGroupowner(Usermain groupowner) {
        this.groupowner = groupowner;
    }

    public Groupmaster getGroupType() {
        return groupType;
    }

    public void setGroupType(Groupmaster groupType) {
        this.groupType = groupType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (groupId != null ? groupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Group1)) {
            return false;
        }
        Group1 other = (Group1) object;
        if ((this.groupId == null && other.groupId != null) || (this.groupId != null && !this.groupId.equals(other.groupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.techdhoom.socialstudent.model.Group1[ groupId=" + groupId + " ]";
    }
    
}
