/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.web.databean;

import com.techdhoom.socialstudent.model.Usermain;
import java.math.BigInteger;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author tapan
 */
@ManagedBean
@RequestScoped
public class EditProfileDataBean {
    
     private Long profileId;
    private String adress;
    private String state;
    private Integer pinCode;
    private String relationshipStatus;
    private String dateofbirth;
    private String gender;
    private BigInteger mobileNo;
    private Integer homeNo;
    private String city;
    private String country;
    private String education;
    private String highSchool;
    private String company;
    private String workEmail;
    private String collegeName;
    private String eyeColor;
    private String hairColor;
    private String build;
    private String looks;
    private String bestFeatures;
    private String about;
    private String collegeName2;
    private Usermain userId;

    public EditProfileDataBean() {
    }

    public EditProfileDataBean(Long profileId, String adress, String state, Integer pinCode, String relationshipStatus, String dateofbirth, String gender, BigInteger mobileNo, Integer homeNo, String city, String country, String education, String highSchool, String company, String workEmail, String collegeName, String eyeColor, String hairColor, String build, String looks, String bestFeatures, String about, String collegeName2, Usermain userId) {
        this.profileId = profileId;
        this.adress = adress;
        this.state = state;
        this.pinCode = pinCode;
        this.relationshipStatus = relationshipStatus;
        this.dateofbirth = dateofbirth;
        this.gender = gender;
        this.mobileNo = mobileNo;
        this.homeNo = homeNo;
        this.city = city;
        this.country = country;
        this.education = education;
        this.highSchool = highSchool;
        this.company = company;
        this.workEmail = workEmail;
        this.collegeName = collegeName;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.build = build;
        this.looks = looks;
        this.bestFeatures = bestFeatures;
        this.about = about;
        this.collegeName2 = collegeName2;
        this.userId = userId;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
    

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    

    public String getBestFeatures() {
        return bestFeatures;
    }

    public void setBestFeatures(String bestFeatures) {
        this.bestFeatures = bestFeatures;
    }
    

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }
    

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    

    public String getCollegeName2() {
        return collegeName2;
    }

    public void setCollegeName2(String collegeName2) {
        this.collegeName2 = collegeName2;
    }
    

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }
    

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
    

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
    

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    

    public String getHighSchool() {
        return highSchool;
    }

    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }
    

    public Integer getHomeNo() {
        return homeNo;
    }

    public void setHomeNo(Integer homeNo) {
        this.homeNo = homeNo;
    }
    

    public BigInteger getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(BigInteger mobileNo) {
        this.mobileNo = mobileNo;
    }
    

    public String getLooks() {
        return looks;
    }

    public void setLooks(String looks) {
        this.looks = looks;
    }
    

    public Integer getPinCode() {
        return pinCode;
    }

    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }
    

    public Long getProfileId() {
        return profileId;
    }

    public void setProfileId(Long profileId) {
        this.profileId = profileId;
    }
    

    public String getRelationshipStatus() {
        return relationshipStatus;
    }

    public void setRelationshipStatus(String relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
    }
    

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    

    public Usermain getUserId() {
        return userId;
    }

    public void setUserId(Usermain userId) {
        this.userId = userId;
    }
    

    public String getWorkEmail() {
        return workEmail;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }
    
    
    
    
}
