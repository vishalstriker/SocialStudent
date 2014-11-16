/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.common.database.impl.BaseAbstractGenericDao;
import com.techdhoom.socialstudent.database.GroupDao;
import com.techdhoom.socialstudent.model.Group1;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tapan
 */
@Repository
public class GroupDaoImpl extends BaseAbstractGenericDao<Group1, Long> implements GroupDao {

  

  

    @Override
    public List<Group1> retrieveallGroup() {
  //      throw new UnsupportedOperationException("Not supported yet.");
        return super.retrieveAll();
    }

    @Override
    public Long createGroup(Group1 group) {
        
        return super.create(group);
    }
    
}
