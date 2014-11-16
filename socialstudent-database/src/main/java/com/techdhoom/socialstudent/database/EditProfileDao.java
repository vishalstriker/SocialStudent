/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import com.techdhoom.socialstudent.common.database.GenericDao;
import com.techdhoom.socialstudent.model.EditProfile;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author tapan
 */
public interface EditProfileDao extends GenericDao<EditProfile, Long> {
    public Long createEditProfile(EditProfile editProfile);
    public List<EditProfile> retrieveallProfileData();
//    public void createOrUpdateProfile(EditProfile editProfile);
    
}
