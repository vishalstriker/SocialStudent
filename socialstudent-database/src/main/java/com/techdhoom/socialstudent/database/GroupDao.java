/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import com.techdhoom.socialstudent.common.database.GenericDao;
import com.techdhoom.socialstudent.model.Group1;
import java.util.List;

/**
 *
 * @author tapan
 */
public interface GroupDao extends GenericDao<Group1, Long> {
     public Long createGroup(Group1 group);
//   public Long updateGroup(Group1 group);
//   public Long deleteGroup(Group1 group);
//   public Long retrievebyidGroup(Group1 group);
public List<Group1> retrieveallGroup();
     
}
