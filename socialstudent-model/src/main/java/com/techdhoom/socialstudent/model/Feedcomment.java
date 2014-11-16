/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.model;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tapan
 */
@Entity
@Table(name = "feedcomment")
public class Feedcomment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feedcomment_id")
    private Long feedcommentId;
    @Column(name = "comment")
    private String comment;
    @Column(name = "created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "feedupdate_id")
    private Integer feedupdateId;
    @JoinColumn(name = "created_by", referencedColumnName = "user_id")
    @ManyToOne
    private Usermain createdBy;
    @JoinColumn(name = "feed_id", referencedColumnName = "feed_id")
    @ManyToOne
    private Feed feedId;

    public Feedcomment() {
    }

    public Feedcomment(Long feedcommentId) {
        this.feedcommentId = feedcommentId;
    }

    public Long getFeedcommentId() {
        return feedcommentId;
    }

    public void setFeedcommentId(Long feedcommentId) {
        this.feedcommentId = feedcommentId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Integer getFeedupdateId() {
        return feedupdateId;
    }

    public void setFeedupdateId(Integer feedupdateId) {
        this.feedupdateId = feedupdateId;
    }

    public Usermain getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Usermain createdBy) {
        this.createdBy = createdBy;
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
        hash += (feedcommentId != null ? feedcommentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Feedcomment)) {
            return false;
        }
        Feedcomment other = (Feedcomment) object;
        if ((this.feedcommentId == null && other.feedcommentId != null) || (this.feedcommentId != null && !this.feedcommentId.equals(other.feedcommentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.techdhoom.socialstudent.model.Feedcomment[ feedcommentId=" + feedcommentId + " ]";
    }
    
}
