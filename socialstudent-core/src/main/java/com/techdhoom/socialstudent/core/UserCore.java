/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.core;

import com.techdhoom.socialstudent.model.Group1;
import com.techdhoom.socialstudent.model.Users;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author SONY
 */

public interface UserCore {

    public List<Users> retrieveAllUsers();
    
    public Long createUser(Users users,Group1 group1);
}
