/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.core.impl;

import com.techdhoom.socialstudent.core.UsermainCore;
import com.techdhoom.socialstudent.database.UsermainDao;
import com.techdhoom.socialstudent.model.Usermain;
import com.techdhoom.socialstudent.model.Users;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author krunal
 */
@Service("usermainCore")
public class UsermainCoreImpl implements UsermainCore{
   @Autowired
   UsermainDao usermainDao;
   
//    @Override
//    public List<Users> retrieveAllUsers() {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }

    @Override
    public Long createUser(Usermain usermain) {
        return usermainDao.createUsermain(usermain);
    }

    @Override
    public List<Usermain> retrieveAllUsermain() {
        return usermainDao.retriveAllUsermain();
    }
    
}
