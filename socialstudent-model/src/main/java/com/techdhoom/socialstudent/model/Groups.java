/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author SONY
 */
@Entity
@Table(name = "groups")
public class Groups implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "groupid")
    private Long groupid;
    @Column(name = "groupname")
    private String groupname;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "groupid")
//    private Collection<Users> usersCollection;

    public Groups() {
    }

    public Groups(Long groupid) {
        this.groupid = groupid;
    }

    public Long getGroupid() {
        return groupid;
    }

    public void setGroupid(Long groupid) {
        this.groupid = groupid;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

//    @XmlTransient
//    public Collection<Users> getUsersCollection() {
//        return usersCollection;
//    }
//
//    public void setUsersCollection(Collection<Users> usersCollection) {
//        this.usersCollection = usersCollection;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (groupid != null ? groupid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Groups)) {
            return false;
        }
        Groups other = (Groups) object;
        if ((this.groupid == null && other.groupid != null) || (this.groupid != null && !this.groupid.equals(other.groupid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.techdhoom.socialstudent.model.Groups[ groupid=" + groupid + " ]";
    }
    
}
