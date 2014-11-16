/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SONY
 */
@Entity
@Table(name = "usermaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usermaster.findAll", query = "SELECT u FROM Usermaster u"),
    @NamedQuery(name = "Usermaster.findByUserid", query = "SELECT u FROM Usermaster u WHERE u.userid = :userid"),
    @NamedQuery(name = "Usermaster.findByFirstname", query = "SELECT u FROM Usermaster u WHERE u.firstname = :firstname")})
public class Usermaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "userid")
    private Long userid;
    @Column(name = "firstname")
    private String firstname;
//    @JoinColumn(name = "groupid", referencedColumnName = "groupid")
//    @ManyToOne(optional = false)
//    private Groupmaster groupid;

    public Usermaster() {
    }

    public Usermaster(Long userid) {
        this.userid = userid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

//    public Groupmaster getGroupid() {
//        return groupid;
//    }
//
//    public void setGroupid(Groupmaster groupid) {
//        this.groupid = groupid;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userid != null ? userid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usermaster)) {
            return false;
        }
        Usermaster other = (Usermaster) object;
        if ((this.userid == null && other.userid != null) || (this.userid != null && !this.userid.equals(other.userid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.techdhoom.socialstudent.model.Usermaster[ userid=" + userid + " ]";
    }
    
}
