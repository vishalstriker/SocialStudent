/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.common.database.impl.BaseAbstractGenericDao;
import com.techdhoom.socialstudent.database.EditProfileDao;
import com.techdhoom.socialstudent.model.EditProfile;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tapan
 */
@Repository
public class EditProfileDaoImpl extends BaseAbstractGenericDao<EditProfile, Long> implements EditProfileDao{

    @Override
    public Long createEditProfile(EditProfile editProfile) {
        return  super.create(editProfile);
    }

    @Override
    public List<EditProfile> retrieveallProfileData() {
        return super.retrieveAll();
    }

//    @Override
//    public void createOrUpdateProfile(EditProfile editProfile) {
//         super.createOrUpdate(editProfile);
//    }

    
}
