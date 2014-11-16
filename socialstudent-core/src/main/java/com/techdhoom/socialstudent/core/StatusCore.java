/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.core;

import com.techdhoom.socialstudent.model.Status;
import java.util.List;

/**
 *
 * @author krunal
 */
public interface StatusCore {
  
    public List<Status> retrieveallStatus();
   
    public Long createStatus(Status status); 

}
