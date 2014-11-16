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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author krunal
 */
@Entity
@Table(name = "usermain")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "Usermain.findAll", query = "SELECT u FROM Usermain u"),
//    @NamedQuery(name = "Usermain.findByBranch", query = "SELECT u FROM Usermain u WHERE u.branch = :branch"),
//    @NamedQuery(name = "Usermain.findByEnrollNo", query = "SELECT u FROM Usermain u WHERE u.enrollNo = :enrollNo"),
//    @NamedQuery(name = "Usermain.findByUserType", query = "SELECT u FROM Usermain u WHERE u.userType = :userType"),
//    @NamedQuery(name = "Usermain.findByUserlastname", query = "SELECT u FROM Usermain u WHERE u.userlastname = :userlastname"),
//    @NamedQuery(name = "Usermain.findByUsername", query = "SELECT u FROM Usermain u WHERE u.username = :username"),
//    @NamedQuery(name = "Usermain.findByYear", query = "SELECT u FROM Usermain u WHERE u.year = :year"),
//    @NamedQuery(name = "Usermain.findByEmailId", query = "SELECT u FROM Usermain u WHERE u.emailId = :emailId"),
//    @NamedQuery(name = "Usermain.findByPassword", query = "SELECT u FROM Usermain u WHERE u.password = :password"),
//    @NamedQuery(name = "Usermain.findByUserId", query = "SELECT u FROM Usermain u WHERE u.userId = :userId")})
public class Usermain implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "branch")
    private String branch;
    @Column(name = "enroll_no")
    private Integer enrollNo;
    @Column(name = "user_type")
    private String userType;
    @Column(name = "userlastname")
    private String userlastname;
    @Column(name = "username")
    private String username;
    @Column(name = "year")
    private Integer year;
    @Column(name = "email_id")
    private String emailId;
    @Column(name = "password")
    private String password;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_id")
    private Long userId;

    public Usermain() {
    }

    public Usermain(Long userId) {
        this.userId = userId;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Integer getEnrollNo() {
        return enrollNo;
    }

    public void setEnrollNo(Integer enrollNo) {
        this.enrollNo = enrollNo;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserlastname() {
        return userlastname;
    }

    public void setUserlastname(String userlastname) {
        this.userlastname = userlastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usermain)) {
            return false;
        }
        Usermain other = (Usermain) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.techdhoom.socialstudent.model.Usermain[ userId=" + userId + " ]";
    }
    
}
