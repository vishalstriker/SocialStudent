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
@Table(name = "groupmaster")
public class Groupmaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "groupmaster_id")
    private Long groupmasterId;
    @Column(name = "group_type")
    private String groupType;
    @OneToMany(mappedBy = "groupType")
    private Collection<Group1> group1Collection;

    public Groupmaster() {
    }

    public Groupmaster(Long groupmasterId) {
        this.groupmasterId = groupmasterId;
    }

    public Long getGroupmasterId() {
        return groupmasterId;
    }

    public void setGroupmasterId(Long groupmasterId) {
        this.groupmasterId = groupmasterId;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    @XmlTransient
    public Collection<Group1> getGroup1Collection() {
        return group1Collection;
    }

    public void setGroup1Collection(Collection<Group1> group1Collection) {
        this.group1Collection = group1Collection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (groupmasterId != null ? groupmasterId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Groupmaster)) {
            return false;
        }
        Groupmaster other = (Groupmaster) object;
        if ((this.groupmasterId == null && other.groupmasterId != null) || (this.groupmasterId != null && !this.groupmasterId.equals(other.groupmasterId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.techdhoom.socialstudent.model.Groupmaster[ groupmasterId=" + groupmasterId + " ]";
    }
    
}
