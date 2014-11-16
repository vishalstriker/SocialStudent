/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import com.techdhoom.socialstudent.common.database.GenericDao;
import com.techdhoom.socialstudent.model.Usermain;
import java.util.List;

/**
 *
 * @author tapan
 */
public interface UsermainDao extends GenericDao<Usermain, Long> {
    
    public Long createUsermain(Usermain usermain);
//    public Long updateUsermain(Usermain usermain);
//   public Long deleteUsermain(Usermain usermain);
//   public Long retrievebyidUsermain(Usermain usermain);
//   public Long retrieveallUsermain(Usermain usermain);
   // public List<Usermain> retriveAllUsersofGroup(String GroupName);
public List<Usermain> retriveAllUsermain();
}
