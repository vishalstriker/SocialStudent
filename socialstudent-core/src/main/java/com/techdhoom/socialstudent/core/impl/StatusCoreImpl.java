/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.core.impl;

import com.techdhoom.socialstudent.core.StatusCore;
import com.techdhoom.socialstudent.database.StatusDao;
import com.techdhoom.socialstudent.model.Status;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.stereotype.Service;

/**
 *
 * @author krunal
 */
@Service("statusCore")
public class StatusCoreImpl implements StatusCore{

    @Autowired
   StatusDao  statusDao;
    
    @Override
    public List<Status> retrieveallStatus() {
    return statusDao.retrieveallStatus();
    }

    @Override
    public Long createStatus(Status status) {
      return statusDao.createStatus(status);
    
    }
    
}
