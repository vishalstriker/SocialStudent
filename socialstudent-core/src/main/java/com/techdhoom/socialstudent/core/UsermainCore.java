/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.core;

import com.techdhoom.socialstudent.model.Group1;
import com.techdhoom.socialstudent.model.Usermain;
import com.techdhoom.socialstudent.model.Users;
import java.util.List;

/**
 *
 * @author krunal
 */
public interface UsermainCore {
    public List<Usermain> retrieveAllUsermain();
    
    public Long createUser(Usermain usermain);
}
