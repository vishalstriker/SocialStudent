/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.common.database.impl.BaseAbstractGenericDao;
import com.techdhoom.socialstudent.database.FriendmanagementDao;
import com.techdhoom.socialstudent.model.Friendmanagement;
import java.io.Serializable;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tapan
 */
@Repository
public class FriendmanagementDaoImpl extends BaseAbstractGenericDao<Friendmanagement, Long> implements FriendmanagementDao {

    @Override
    public Long createFriendmanagement(Friendmanagement friendmanagement) {
        return super.create(friendmanagement);
    }

    @Override
    public Long updateFriendmanagement(Friendmanagement friendmanagement) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long deleteFriendmanagement(Friendmanagement friendmanagement) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long retrievebyidFriendmanagement(Friendmanagement friendmanagement) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long retrieveallFriendmanagement(Friendmanagement friendmanagement) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
