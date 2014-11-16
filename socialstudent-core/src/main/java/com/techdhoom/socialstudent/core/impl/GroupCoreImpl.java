/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.core.impl;

import com.techdhoom.socialstudent.core.GroupCore;
import com.techdhoom.socialstudent.database.GroupDao;
import com.techdhoom.socialstudent.model.Group1;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author krunal
 */
@Service("groupCore")
public class GroupCoreImpl implements GroupCore{
     @Autowired
    GroupDao groupDao;
     
     

    @Override
    public List<Group1> retrieveAllGroup() {
      System.out.println("--->>>" + groupDao);
        return groupDao.retrieveallGroup();
    }

    @Override
    public Long createGroup(Group1 group) {
    return groupDao.createGroup(group);  
    }
}
