/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.common.database.impl.BaseAbstractGenericDao;
import com.techdhoom.socialstudent.database.StatusDao;
import com.techdhoom.socialstudent.model.Status;
import com.techdhoom.socialstudent.model.Usermain;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author SONY
 */
@Repository
public class StatusDaoImpl extends BaseAbstractGenericDao<Status, Long> implements StatusDao{
    
    
    @Override
    public Long createStatus(Status status) {
    return super.create(status);   
    }

   
    @Override
    public List<Status> retrieveallStatus() {
       // throw new UnsupportedOperationException("Not supported yet.");
    return super.retrieveAll();
    
    }

    @Override
    public List<Status> findFiltered1(String property, Object filter) {
       // throw new UnsupportedOperationException("Not supported yet.");
    return super.findFiltered(property,filter);
    }
   
}
