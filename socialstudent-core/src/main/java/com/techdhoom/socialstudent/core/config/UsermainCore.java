/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.core.config;

import com.techdhoom.socialstudent.database.UsermainDao;
import com.techdhoom.socialstudent.database.impl.UsermainDaoImpl;
import com.techdhoom.socialstudent.model.Usermain;

/**
 *
 * @author tapan
 */
public class UsermainCore {

    public void createuser(Usermain usermain) {
        UsermainDao usermainDao = new UsermainDaoImpl();
        usermainDao.createUsermain(usermain);
    }
    
}
