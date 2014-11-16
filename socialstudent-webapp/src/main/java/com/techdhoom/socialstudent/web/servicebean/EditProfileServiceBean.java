/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.web.servicebean;

import com.techdhoom.socialstudent.core.EditProfileCore;
import com.techdhoom.socialstudent.model.EditProfile;
import com.techdhoom.socialstudent.web.databean.EditProfileDataBean;
//import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.DateTimeConverter;

/**
 *
 * @author tapan
 */
@ManagedBean
@RequestScoped
public class EditProfileServiceBean {
    
      @ManagedProperty(value = "#{editProfileDataBean}")
      private EditProfileDataBean editProfileDataBean;
      @ManagedProperty(value = "#{editProfileCore}")
      public EditProfileCore editProfileCore;
      List<EditProfileDataBean> editProfileDataBeanList;

    public EditProfileServiceBean() {
    }

//    public EditProfileServiceBean(EditProfileDataBean editProfileDataBean, EditProfileCore editProfileCore) {
//        this.editProfileDataBean = editProfileDataBean;
//        this.editProfileCore = editProfileCore;
//    }

    public EditProfileServiceBean(EditProfileDataBean editProfileDataBean, EditProfileCore editProfileCore, List<EditProfileDataBean> editProfileDataBeanList) {
        this.editProfileDataBean = editProfileDataBean;
        this.editProfileCore = editProfileCore;
        this.editProfileDataBeanList = editProfileDataBeanList;
    }
    

    public EditProfileDataBean getEditProfileDataBean() {
        return editProfileDataBean;
    }

    public void setEditProfileDataBean(EditProfileDataBean editProfileDataBean) {
        this.editProfileDataBean = editProfileDataBean;
    }

    public EditProfileCore getEditProfileCore() {
        return editProfileCore;
    }

    public void setEditProfileCore(EditProfileCore editProfileCore) {
        this.editProfileCore = editProfileCore;
    }

    public List<EditProfileDataBean> getEditProfileDataBeanList() {
        return editProfileDataBeanList;
    }

    public void setEditProfileDataBeanList(List<EditProfileDataBean> editProfileDataBeanList) {
        this.editProfileDataBeanList = editProfileDataBeanList;
    }
    
    public void createEditProfile() throws ParseException{
    EditProfile editProfile = new EditProfile();
    editProfile.setAbout(editProfileDataBean.getAbout());
    editProfile.setAdress(editProfileDataBean.getAdress());
    editProfile.setBestFeatures(editProfileDataBean.getBestFeatures());
    editProfile.setBuild(editProfileDataBean.getBuild());
    editProfile.setCity(editProfileDataBean.getCity());
    editProfile.setCollegeName(editProfileDataBean.getCollegeName());
    editProfile.setCollegeName2(editProfileDataBean.getCollegeName2());
    editProfile.setCompany(editProfileDataBean.getCompany());
    editProfile.setCountry(editProfileDataBean.getCountry());
    String result = editProfileDataBean.getDateofbirth();
        System.out.println("value--->>"+result);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
    Date date;
   DateTimeConverter dateTimeConverter = new DateTimeConverter();
   date = (Date) dateTimeConverter.getAsObject(FacesContext.getCurrentInstance(), UIComponent.getCurrentComponent(FacesContext.getCurrentInstance()), result);
//    date=sdf.parse(result); 
    
    editProfile.setDateofbirth(date);
    editProfile.setEducation(editProfileDataBean.getEducation());
    editProfile.setEyeColor(editProfileDataBean.getEyeColor());
    editProfile.setGender(editProfileDataBean.getGender());
        System.out.println("gender"+editProfile.getGender());
    editProfile.setHairColor(editProfileDataBean.getHairColor());
    editProfile.setHighSchool(editProfileDataBean.getHighSchool());
    editProfile.setHomeNo(editProfileDataBean.getHomeNo());
    editProfile.setLooks(editProfileDataBean.getLooks());
    editProfile.setMobileNo(editProfileDataBean.getMobileNo());
    editProfile.setPinCode(editProfileDataBean.getPinCode());
    editProfile.setState(editProfileDataBean.getState());
    editProfile.setRelationshipStatus(editProfileDataBean.getRelationshipStatus());
    editProfile.setWorkEmail(editProfileDataBean.getWorkEmail());
    editProfileCore.createEditProfile(editProfile);
    }
    public void retriveAllProfileData(){
        this.setEditProfileDataBeanList(new ArrayList<EditProfileDataBean>());
        for(EditProfile editProfile : editProfileCore.retrieveallProfileData()){
            Date date;
            date = editProfile.getDateofbirth();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
            String result = sdf.format(date);
        EditProfileDataBean editProfileData =  new EditProfileDataBean(editProfile.getProfileId(), editProfile.getAdress(), editProfile.getGender(), editProfile.getPinCode(), editProfile.getState(), editProfile.getRelationshipStatus(), result, editProfile.getMobileNo(), editProfile.getHomeNo(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);  
        this.editProfileDataBeanList.add(editProfileData);         
       }
    
    }
}
