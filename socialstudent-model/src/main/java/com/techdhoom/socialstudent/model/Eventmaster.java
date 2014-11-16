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
@Table(name = "eventmaster")
public class Eventmaster implements Serializable {
   
    private static final long serialVersionUID = 1L;
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private Long eventId;
     @Column(name = "event_title")
    private String eventTitle;
    @Column(name = "endingtime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endingtime;
    @Column(name = "event_type")
    private String eventType;
    @Column(name = "startingdate")
    @Temporal(TemporalType.DATE)
    private Date startingdate;
    @Column(name = "endingdate")
    @Temporal(TemporalType.DATE)
    private Date endingdate;
    @Column(name = "staringtime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date staringtime;
    @Column(name = "event_details")
    private String eventDetails;
    @Column(name = "event_place")
    private String eventPlace;
    @JoinColumn(name = "eventcreated_by", referencedColumnName = "user_id")
    @ManyToOne
    private Usermain eventcreatedBy;

    public Eventmaster() {
    }

    public Eventmaster(Long eventId) {
        this.eventId = eventId;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }
    

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Date getStartingdate() {
        return startingdate;
    }

    public void setStartingdate(Date startingdate) {
        this.startingdate = startingdate;
    }

    public Date getEndingdate() {
        return endingdate;
    }

    public void setEndingdate(Date endingdate) {
        this.endingdate = endingdate;
    }

    public Date getStaringtime() {
        return staringtime;
    }

    public void setStaringtime(Date staringtime) {
        this.staringtime = staringtime;
    }

    public String getEventDetails() {
        return eventDetails;
    }

    public void setEventDetails(String eventDetails) {
        this.eventDetails = eventDetails;
    }

    public String getEventPlace() {
        return eventPlace;
    }

    public void setEventPlace(String eventPlace) {
        this.eventPlace = eventPlace;
    }

//    public Usermain getEventcreatedBy() {
//        return eventcreatedBy;
//    }
//
//    public void setEventcreatedBy(Usermain eventcreatedBy) {
//        this.eventcreatedBy = eventcreatedBy;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventId != null ? eventId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eventmaster)) {
            return false;
        }
        Eventmaster other = (Eventmaster) object;
        if ((this.eventId == null && other.eventId != null) || (this.eventId != null && !this.eventId.equals(other.eventId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.techdhoom.socialstudent.model.Eventmaster[ eventId=" + eventId + " ]";
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public Date getEndingtime() {
        return endingtime;
    }

    public void setEndingtime(Date endingtime) {
        this.endingtime = endingtime;
    }
    
}
