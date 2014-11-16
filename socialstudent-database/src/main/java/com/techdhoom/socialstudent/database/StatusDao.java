/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import com.techdhoom.socialstudent.common.database.GenericDao;
import com.techdhoom.socialstudent.model.Status;
import com.techdhoom.socialstudent.model.Usermain;
import java.util.List;

/**
 *
 * @author SONY
 */
public interface StatusDao extends GenericDao<Status, Long> {
     public Long createStatus(Status status);
//      public Long updateStatus(Status status);
//       public Long deleteStatus(Status status);
//        public Long retrievebyidStatus(Status status);
         public List<Status> retrieveallStatus();
   
    public List<Status> findFiltered1(String property,Object filter);
}
