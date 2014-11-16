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
 * @author krunal
 */
@Entity
@Table(name = "status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Status.findAll", query = "SELECT s FROM Status s"),
    @NamedQuery(name = "Status.findByYourstatus", query = "SELECT s FROM Status s WHERE s.yourstatus = :yourstatus"),
    @NamedQuery(name = "Status.findByStatusid", query = "SELECT s FROM Status s WHERE s.statusid = :statusid")})
public class Status implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "yourstatus")
    private String yourstatus;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "statusid")
    private Long statusid;
    @JoinColumn(name = "userid", referencedColumnName = "user_id")
    @ManyToOne
    private Usermain userid;

    public Status() {
    }

    public Status(Long statusid) {
        this.statusid = statusid;
    }

    public Status(Long statusid, String yourstatus) {
        this.statusid = statusid;
        this.yourstatus = yourstatus;
    }

    public String getYourstatus() {
        return yourstatus;
    }

    public void setYourstatus(String yourstatus) {
        this.yourstatus = yourstatus;
    }

    public Long getStatusid() {
        return statusid;
    }

    public void setStatusid(Long statusid) {
        this.statusid = statusid;
    }

    public Usermain getUserid() {
        return userid;
    }

    public void setUserid(Usermain userid) {
        this.userid = userid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (statusid != null ? statusid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Status)) {
            return false;
        }
        Status other = (Status) object;
        if ((this.statusid == null && other.statusid != null) || (this.statusid != null && !this.statusid.equals(other.statusid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.techdhoom.socialstudent.model.Status[ statusid=" + statusid + " ]";
    }
    
}
