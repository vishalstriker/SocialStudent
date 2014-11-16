/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.core.impl;

import com.techdhoom.socialstudent.core.UserCore;
import com.techdhoom.socialstudent.database.UsersDao;
import com.techdhoom.socialstudent.model.Group1;
import com.techdhoom.socialstudent.model.Users;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author SONY
 */
@Service("userCore")
public class UserCoreImpl implements UserCore {

    @Autowired
    UsersDao usersDao;

    @Override
    public List<Users> retrieveAllUsers() {
        System.out.println("--->>>" + usersDao);
        return usersDao.retriveAllUsers();
    }

    @Override
    public Long createUser(Users users, Group1 group1) {
        return usersDao.create(users);
    }
}
