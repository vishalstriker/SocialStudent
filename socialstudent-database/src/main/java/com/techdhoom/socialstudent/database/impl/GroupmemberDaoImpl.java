/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.common.database.impl.BaseAbstractGenericDao;
import com.techdhoom.socialstudent.database.GroupmemberDao;
import com.techdhoom.socialstudent.model.Groupmember;
import java.io.Serializable;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tapan
 */
@Repository
public class GroupmemberDaoImpl extends BaseAbstractGenericDao<Groupmember, Long> implements GroupmemberDao {

    @Override
    public Long createGroupmember(Groupmember groupmember) {
        return super.create(groupmember);

    }

    @Override
    public Long updateGroupmember(Groupmember groupmember) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long deleteGroupmember(Groupmember groupmember) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long retrievebyidGroupmember(Groupmember groupmember) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long retrieveallGroupmember(Groupmember groupmember) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
