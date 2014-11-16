/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.web.servicebean;

import com.techdhoom.socialstudent.core.EventCore;
import com.techdhoom.socialstudent.model.Eventmaster;
import com.techdhoom.socialstudent.web.databean.EventDataBean;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.xml.bind.ParseConversionEvent;

/**
 *
 * @author tapan
 */
@ManagedBean
public class EventServiceBean {

    @ManagedProperty(value = "#{eventDatabean}")
    private EventDataBean eventDataBean;
    @ManagedProperty(value = "#{eventCore}")
    private EventCore eventCore;

    public EventServiceBean() {
    }

    public EventServiceBean(EventDataBean eventDataBean, EventCore eventCore) {
        this.eventDataBean = eventDataBean;
        this.eventCore = eventCore;
    }

    public EventDataBean getEventDataBean() {
        return eventDataBean;
    }

    public void setEventDataBean(EventDataBean eventDataBean) {
        this.eventDataBean = eventDataBean;
    }

    public EventCore getEventCore() {
        return eventCore;
    }

    public void setEventCore(EventCore eventCore) {
        this.eventCore = eventCore;
    }
    public void createEvent() throws ParseException{
    Eventmaster eventmaster = new Eventmaster();
    SimpleDateFormat sdf = new SimpleDateFormat("yyy-mm-dd");
        System.out.println("value------->"+eventDataBean.getEndingdate());
    Date date;
//        date = sdf.parse(eventDataBean.getEndingdate());
//        System.out.println("ending date----->"+date);
    eventmaster.setEndingdate(eventDataBean.getEndingdate());
    SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm");
    date = sdf1.parse(eventDataBean.getEndingtime());
    Timestamp timestamp = new Timestamp(date.getTime());
   
    eventmaster.setEndingtime(timestamp);
    eventmaster.setEventDetails(eventDataBean.getEventDetails());
    eventmaster.setEventPlace(eventDataBean.getEventPlace());
        System.out.println("event place---->"+eventDataBean.getEventTitle());
        date = sdf.parse(eventDataBean.getStaringtime());
        Timestamp timestamp1 = new Timestamp(date.getTime());
    eventmaster.setEventTitle(eventDataBean.getEventTitle());
    eventmaster.setStaringtime(timestamp1);
    Date date1;
    date1 = sdf1.parse(eventDataBean.getStartingdate());
    eventmaster.setStartingdate(date1);
    eventCore.createEvent(eventmaster);
    }
}
