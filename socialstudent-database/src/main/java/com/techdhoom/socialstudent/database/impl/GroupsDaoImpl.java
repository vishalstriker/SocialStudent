/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.common.database.impl.BaseAbstractGenericDao;
import com.techdhoom.socialstudent.database.GroupsDao;
import com.techdhoom.socialstudent.model.Groups;

/**
 *
 * @author SONY
 */
public class GroupsDaoImpl extends BaseAbstractGenericDao<Groups, Long> implements GroupsDao {

    @Override
    public Long createEventmaster(Groups groups) {
       return super.create(groups);
        }

    @Override
    public Long updateEventmaster(Groups groups) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long deleteEventmaster(Groups groups) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long retrievebyidEventmaster(Groups groups) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long retrieveallEventmaster(Groups groups) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
