/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.common.database.impl.BaseAbstractGenericDao;
import com.techdhoom.socialstudent.database.EventmasterDao;
import com.techdhoom.socialstudent.model.Eventmaster;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tapan
 */
@Repository
public class EventmasterDaoImpl extends BaseAbstractGenericDao<Eventmaster, Long> implements EventmasterDao {

    @Override
    public Long createEventmaster(Eventmaster eventmaster) {
        return super.create(eventmaster);
    }

//    @Override
//    public void updateEventmaster(Eventmaster eventmaster) {
//         super.createOrUpdate(eventmaster);
//    }
//
//    @Override
//    public Long deleteEventmaster(Eventmaster eventmaster) {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }
//
//    @Override
//    public Eventmaster retrievebyidEventmaster(Long id) {
//        return super.retrieveById(id);
//    }
//
//    @Override
//    public List<Eventmaster> retrieveallEventmaster() {
//        return super.retrieveAll();
//    }
    
}
