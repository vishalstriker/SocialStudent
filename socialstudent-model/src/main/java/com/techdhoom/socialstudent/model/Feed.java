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
@Table(name = "feed")
public class Feed implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feed_id")
    private Long feedId;
    @Column(name = "feed_type")
    private String feedType;
    @JoinColumn(name = "updated_by", referencedColumnName = "user_id")
    @ManyToOne
    private Usermain updatedBy;
    @JoinColumn(name = "owner", referencedColumnName = "user_id")
    @ManyToOne
    private Usermain owner;
    @JoinColumn(name = "loggedperson", referencedColumnName = "user_id")
    @ManyToOne
    private Usermain loggedperson;
//    @JoinColumn(name = "created_by", referencedColumnName = "user_id")
//    @ManyToOne
//    private Usermain createdBy;

    public Feed() {
    }

    public Feed(Long feedId) {
        this.feedId = feedId;
    }

    public Long getFeedId() {
        return feedId;
    }

    public void setFeedId(Long feedId) {
        this.feedId = feedId;
    }

    public String getFeedType() {
        return feedType;
    }

    public void setFeedType(String feedType) {
        this.feedType = feedType;
    }

    public Usermain getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Usermain updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Usermain getOwner() {
        return owner;
    }

    public void setOwner(Usermain owner) {
        this.owner = owner;
    }

    public Usermain getLoggedperson() {
        return loggedperson;
    }

    public void setLoggedperson(Usermain loggedperson) {
        this.loggedperson = loggedperson;
    }

//    public Usermain getCreatedBy() {
//        return createdBy;
//    }
//
//    public void setCreatedBy(Usermain createdBy) {
//        this.createdBy = createdBy;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (feedId != null ? feedId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Feed)) {
            return false;
        }
        Feed other = (Feed) object;
        if ((this.feedId == null && other.feedId != null) || (this.feedId != null && !this.feedId.equals(other.feedId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.techdhoom.socialstudent.model.Feed[ feedId=" + feedId + " ]";
    }
    
}
