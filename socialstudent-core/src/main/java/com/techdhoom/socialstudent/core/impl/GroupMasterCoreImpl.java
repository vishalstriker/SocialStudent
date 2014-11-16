/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.core.impl;

import com.techdhoom.socialstudent.core.GroupMasterCore;
import com.techdhoom.socialstudent.database.GroupmasterDao;
import com.techdhoom.socialstudent.model.Groupmaster;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author krunal
 */
@Service("groupMasterCore")
public class GroupMasterCoreImpl implements GroupMasterCore{
@Autowired
GroupmasterDao groupMasterDao;
  

    @Override
    public List<Groupmaster> retrieveAllGroupmasters() {
       return groupMasterDao.retrieveallGroupmaster();
    }
    
}
