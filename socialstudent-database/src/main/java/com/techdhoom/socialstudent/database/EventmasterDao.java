/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import com.techdhoom.socialstudent.common.database.GenericDao;
import com.techdhoom.socialstudent.model.Eventmaster;
import java.util.List;

/**
 *
 * @author tapan
 */
public interface EventmasterDao extends GenericDao<Eventmaster, Long> {
    public Long createEventmaster(Eventmaster eventmaster);
//    public void updateEventmaster(Eventmaster eventmaster);
//    public Long deleteEventmaster(Eventmaster eventmaster);
//    public Eventmaster retrievebyidEventmaster(Long id);
//    public List<Eventmaster> retrieveallEventmaster();

    
}
