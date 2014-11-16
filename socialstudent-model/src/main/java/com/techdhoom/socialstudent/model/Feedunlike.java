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
@Table(name = "feedunlike")
public class Feedunlike implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "unlike_id")
    private Long unlikeId;
    @Column(name = "feedcomment_id")
    private Integer feedcommentId;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne
    private Usermain userId;
    @JoinColumn(name = "feed_id", referencedColumnName = "feed_id")
    @ManyToOne
    private Feed feedId;

    public Feedunlike() {
    }

    public Feedunlike(Long unlikeId) {
        this.unlikeId = unlikeId;
    }

    public Long getUnlikeId() {
        return unlikeId;
    }

    public void setUnlikeId(Long unlikeId) {
        this.unlikeId = unlikeId;
    }

    public Integer getFeedcommentId() {
        return feedcommentId;
    }

    public void setFeedcommentId(Integer feedcommentId) {
        this.feedcommentId = feedcommentId;
    }

    public Usermain getUserId() {
        return userId;
    }

    public void setUserId(Usermain userId) {
        this.userId = userId;
    }

    public Feed getFeedId() {
        return feedId;
    }

    public void setFeedId(Feed feedId) {
        this.feedId = feedId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (unlikeId != null ? unlikeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Feedunlike)) {
            return false;
        }
        Feedunlike other = (Feedunlike) object;
        if ((this.unlikeId == null && other.unlikeId != null) || (this.unlikeId != null && !this.unlikeId.equals(other.unlikeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.techdhoom.socialstudent.model.Feedunlike[ unlikeId=" + unlikeId + " ]";
    }
    
}
