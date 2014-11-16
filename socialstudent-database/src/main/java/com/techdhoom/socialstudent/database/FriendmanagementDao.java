/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import com.techdhoom.socialstudent.common.database.GenericDao;
import com.techdhoom.socialstudent.model.Friendmanagement;

/**
 *
 * @author tapan
 */
public interface FriendmanagementDao extends GenericDao<Friendmanagement, Long> {
     public Long createFriendmanagement(Friendmanagement friendmanagement);
    public Long updateFriendmanagement(Friendmanagement friendmanagement);
    public Long deleteFriendmanagement(Friendmanagement friendmanagement);
    public Long retrievebyidFriendmanagement(Friendmanagement friendmanagement);
    public Long retrieveallFriendmanagement(Friendmanagement friendmanagement);

    
}
