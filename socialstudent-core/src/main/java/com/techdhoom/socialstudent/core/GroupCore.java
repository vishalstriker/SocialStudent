/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.core;

import com.techdhoom.socialstudent.model.Group1;
import java.util.List;

/**
 *
 * @author krunal
 */
public interface GroupCore {
    public List<Group1> retrieveAllGroup();
    
    public Long createGroup(Group1 group);
}
