/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.web.databean;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author tapan
 */
@ManagedBean
@RequestScoped
public class EventDataBean {

    private Long eventId;
    private String startingdate;
    private Date endingdate;
    private String eventTitle;
    private String staringtime;
    private String endingtime;
    private String eventDetails;
    private String eventPlace;

    public EventDataBean() {
    }

    public EventDataBean(Long eventId, String startingdate, Date endingdate, String eventTitle, String staringtime, String endingtime, String eventDetails, String eventPlace) {
        this.eventId = eventId;
        this.startingdate = startingdate;
        this.endingdate = endingdate;
        this.eventTitle = eventTitle;
        this.staringtime = staringtime;
        this.endingtime = endingtime;
        this.eventDetails = eventDetails;
        this.eventPlace = eventPlace;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getStartingdate() {
        return startingdate;
    }

    public void setStartingdate(String startingdate) {
        this.startingdate = startingdate;
    }

    public Date getEndingdate() {
        return endingdate;
    }

    public void setEndingdate(Date endingdate) {
        this.endingdate = endingdate;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getStaringtime() {
        return staringtime;
    }

    public void setStaringtime(String staringtime) {
        this.staringtime = staringtime;
    }

    public String getEndingtime() {
        return endingtime;
    }

    public void setEndingtime(String endingtime) {
        this.endingtime = endingtime;
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
    
}
