/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import com.techdhoom.socialstudent.common.database.GenericDao;
import com.techdhoom.socialstudent.model.Groups;
import com.techdhoom.socialstudent.model.Users;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author SONY
 */
public interface UsersDao extends GenericDao<Users, Long> {

    public Long createUser(Users users);

//    public Long updateEventmaster(Users users);
//    public Long deleteEventmaster(Users users);
//    public Long retrievebyidEventmaster(Users users);
//    public Long retrieveallEventmaster(Users users);
    public List<Users> retriveAllUsers();

    public Users retrieveUsersById(Long id);

    public List<Users> groupShow();
}
