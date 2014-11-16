/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.core;

import com.techdhoom.socialstudent.model.EditProfile;
import java.util.List;

/**
 *
 * @author tapan
 */
public interface EditProfileCore {
     public Long createEditProfile(EditProfile editProfile);
     
     public List<EditProfile> retrieveallProfileData();
    
}
