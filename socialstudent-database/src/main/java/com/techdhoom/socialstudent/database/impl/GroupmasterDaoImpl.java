/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.common.database.impl.BaseAbstractGenericDao;
import com.techdhoom.socialstudent.database.GroupmasterDao;
import com.techdhoom.socialstudent.model.Groupmaster;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tapan
 */
@Repository
public class GroupmasterDaoImpl extends BaseAbstractGenericDao<Groupmaster, Long> implements GroupmasterDao {

    @Override
    public Long createGroupmaster(Groupmaster groupmaster) {
        return super.create(groupmaster);
    }

    @Override
    public List<Groupmaster> retrieveallGroupmaster() {
       return super.retrieveAll();
    }

 
    
}
