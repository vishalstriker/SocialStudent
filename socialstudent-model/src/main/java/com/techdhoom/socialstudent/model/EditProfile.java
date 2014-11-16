/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tapan
 */
@Entity
@Table(name = "edit_profile")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "EditProfile.findAll", query = "SELECT e FROM EditProfile e"),
//    @NamedQuery(name = "EditProfile.findByProfileId", query = "SELECT e FROM EditProfile e WHERE e.profileId = :profileId"),
//    @NamedQuery(name = "EditProfile.findByAdress", query = "SELECT e FROM EditProfile e WHERE e.adress = :adress"),
//    @NamedQuery(name = "EditProfile.findByState", query = "SELECT e FROM EditProfile e WHERE e.state = :state"),
//    @NamedQuery(name = "EditProfile.findByPinCode", query = "SELECT e FROM EditProfile e WHERE e.pinCode = :pinCode"),
//    @NamedQuery(name = "EditProfile.findByRelationshipStatus", query = "SELECT e FROM EditProfile e WHERE e.relationshipStatus = :relationshipStatus"),
//    @NamedQuery(name = "EditProfile.findByDateofbirth", query = "SELECT e FROM EditProfile e WHERE e.dateofbirth = :dateofbirth"),
//    @NamedQuery(name = "EditProfile.findByGender", query = "SELECT e FROM EditProfile e WHERE e.gender = :gender"),
//    @NamedQuery(name = "EditProfile.findByMobileNo", query = "SELECT e FROM EditProfile e WHERE e.mobileNo = :mobileNo"),
//    @NamedQuery(name = "EditProfile.findByHomeNo", query = "SELECT e FROM EditProfile e WHERE e.homeNo = :homeNo"),
//    @NamedQuery(name = "EditProfile.findByCity", query = "SELECT e FROM EditProfile e WHERE e.city = :city"),
//    @NamedQuery(name = "EditProfile.findByCountry", query = "SELECT e FROM EditProfile e WHERE e.country = :country"),
//    @NamedQuery(name = "EditProfile.findByEducation", query = "SELECT e FROM EditProfile e WHERE e.education = :education"),
//    @NamedQuery(name = "EditProfile.findByHighSchool", query = "SELECT e FROM EditProfile e WHERE e.highSchool = :highSchool"),
//    @NamedQuery(name = "EditProfile.findByCompany", query = "SELECT e FROM EditProfile e WHERE e.company = :company"),
//    @NamedQuery(name = "EditProfile.findByWorkEmail", query = "SELECT e FROM EditProfile e WHERE e.workEmail = :workEmail"),
//    @NamedQuery(name = "EditProfile.findByCollegeName", query = "SELECT e FROM EditProfile e WHERE e.collegeName = :collegeName"),
//    @NamedQuery(name = "EditProfile.findByEyeColor", query = "SELECT e FROM EditProfile e WHERE e.eyeColor = :eyeColor"),
//    @NamedQuery(name = "EditProfile.findByHairColor", query = "SELECT e FROM EditProfile e WHERE e.hairColor = :hairColor"),
//    @NamedQuery(name = "EditProfile.findByBuild", query = "SELECT e FROM EditProfile e WHERE e.build = :build"),
//    @NamedQuery(name = "EditProfile.findByLooks", query = "SELECT e FROM EditProfile e WHERE e.looks = :looks"),
//    @NamedQuery(name = "EditProfile.findByBestFeatures", query = "SELECT e FROM EditProfile e WHERE e.bestFeatures = :bestFeatures"),
//    @NamedQuery(name = "EditProfile.findByAbout", query = "SELECT e FROM EditProfile e WHERE e.about = :about"),
//    @NamedQuery(name = "EditProfile.findByCollegeName2", query = "SELECT e FROM EditProfile e WHERE e.collegeName2 = :collegeName2")})
public class EditProfile implements Serializable {
   
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "profile_id")
    private Long profileId;
    @Column(name = "adress")
    private String adress;
    @Column(name = "state")
    private String state;
    @Column(name = "pin_code")
    private Integer pinCode;
    @Column(name = "relationship_status")
    private String relationshipStatus;
    @Column(name = "dateofbirth")
    @Temporal(TemporalType.DATE)
    private Date dateofbirth;
    @Column(name = "gender")
    private String gender;
    @Column(name = "home_no")
    private Integer homeNo;
     @Column(name = "mobile_no")
    private BigInteger mobileNo;
    @Column(name = "city")
    private String city;
    @Column(name = "country")
    private String country;
    @Column(name = "education")
    private String education;
    @Column(name = "high_school")
    private String highSchool;
    @Column(name = "company")
    private String company;
    @Column(name = "work_email")
    private String workEmail;
    @Column(name = "college_name")
    private String collegeName;
    @Column(name = "eye_color")
    private String eyeColor;
    @Column(name = "hair_color")
    private String hairColor;
    @Column(name = "build")
    private String build;
    @Column(name = "looks")
    private String looks;
    @Column(name = "best_features")
    private String bestFeatures;
    @Column(name = "about")
    private String about;
    @Column(name = "college_name2")
    private String collegeName2;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne
    private Usermain userId;

    public EditProfile() {
    }

    public EditProfile(Long profileId) {
        this.profileId = profileId;
    }

    public Long getProfileId() {
        return profileId;
    }

    public void setProfileId(Long profileId) {
        this.profileId = profileId;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getPinCode() {
        return pinCode;
    }

    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }

    public String getRelationshipStatus() {
        return relationshipStatus;
    }

    public void setRelationshipStatus(String relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

//    public Integer getMobileNo() {
//        return mobileNo;
//    }
//
//    public void setMobileNo(Integer mobileNo) {
//        this.mobileNo = mobileNo;
//    }
     public BigInteger getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(BigInteger mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Integer getHomeNo() {
        return homeNo;
    }

    public void setHomeNo(Integer homeNo) {
        this.homeNo = homeNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getHighSchool() {
        return highSchool;
    }

    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getWorkEmail() {
        return workEmail;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public String getLooks() {
        return looks;
    }

    public void setLooks(String looks) {
        this.looks = looks;
    }

    public String getBestFeatures() {
        return bestFeatures;
    }

    public void setBestFeatures(String bestFeatures) {
        this.bestFeatures = bestFeatures;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getCollegeName2() {
        return collegeName2;
    }

    public void setCollegeName2(String collegeName2) {
        this.collegeName2 = collegeName2;
    }

    public Usermain getUserId() {
        return userId;
    }

    public void setUserId(Usermain userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (profileId != null ? profileId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EditProfile)) {
            return false;
        }
        EditProfile other = (EditProfile) object;
        if ((this.profileId == null && other.profileId != null) || (this.profileId != null && !this.profileId.equals(other.profileId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.techdhoom.socialstudent.model.EditProfile[ profileId=" + profileId + " ]";
    }

   
    
}
