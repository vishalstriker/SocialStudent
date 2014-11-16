/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.core.impl;

import com.techdhoom.socialstudent.core.EditProfileCore;
import com.techdhoom.socialstudent.database.EditProfileDao;
import com.techdhoom.socialstudent.model.EditProfile;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tapan
 */
@Service("editProfileCore")
public class EditProfileCoreImpl implements EditProfileCore{
    @Autowired
    EditProfileDao editProfileDao;

    @Override
    public Long createEditProfile(EditProfile editProfile) {
        return editProfileDao.createEditProfile(editProfile);
    }

    @Override
    public List<EditProfile> retrieveallProfileData() {
       return editProfileDao.retrieveallProfileData();
    }
    
    
}
