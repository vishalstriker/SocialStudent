/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import com.techdhoom.socialstudent.common.database.GenericDao;
import com.techdhoom.socialstudent.model.Groupmember;

/**
 *
 * @author tapan
 */
public interface GroupmemberDao extends GenericDao<Groupmember, Long> {
    public Long createGroupmember(Groupmember groupmember);
   public Long updateGroupmember(Groupmember groupmember);
   public Long deleteGroupmember(Groupmember groupmember);
   public Long retrievebyidGroupmember(Groupmember groupmember);
   public Long retrieveallGroupmember(Groupmember groupmember);
    
}
