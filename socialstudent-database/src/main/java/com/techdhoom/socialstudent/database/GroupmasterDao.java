/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import com.techdhoom.socialstudent.common.database.GenericDao;
import com.techdhoom.socialstudent.model.Groupmaster;
import java.util.List;

/**
 *
 * @author tapan
 */
public interface GroupmasterDao extends GenericDao<Groupmaster, Long> {
    public Long createGroupmaster(Groupmaster groupmaster);
//   public Long updateGroupmaster(Groupmaster groupmaster);
//   public Long deleteGroupmaster(Groupmaster groupmaster);
//   public Long retrievebyidGroupmaster(Groupmaster groupmaster);
   public List<Groupmaster> retrieveallGroupmaster();
    
}
