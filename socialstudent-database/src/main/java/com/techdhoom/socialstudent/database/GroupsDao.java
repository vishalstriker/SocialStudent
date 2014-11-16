/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import com.techdhoom.socialstudent.common.database.GenericDao;
import com.techdhoom.socialstudent.model.Eventmaster;
import com.techdhoom.socialstudent.model.Groups;

/**
 *
 * @author SONY
 */
public interface GroupsDao extends GenericDao<Groups, Long>{
     public Long createEventmaster(Groups groups);
    public Long updateEventmaster(Groups groups);
    public Long deleteEventmaster(Groups groups);
    public Long retrievebyidEventmaster(Groups groups);
    public Long retrieveallEventmaster(Groups groups);
}
