/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.web.servicebean;

import com.techdhoom.socialstudent.core.ChangePasswordCore;
import com.techdhoom.socialstudent.core.UsermainCore;
import com.techdhoom.socialstudent.model.Usermain;
import com.techdhoom.socialstudent.web.databean.UsermainDatabean;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author tapan
 */
@ManagedBean
@ViewScoped
public class ChangePasswordServiceBean {
    
    @ManagedProperty(value = "#{usermainDatabean}")
    private UsermainDatabean usermainDatabean;
     @ManagedProperty(value = "#{usermainCore}")
    public UsermainCore usermainCore;
      @ManagedProperty("#{usermainServicebean}")
    private UsermainServicebean usermainServicebean;
      @ManagedProperty("#{changePasswordCore}")
      private ChangePasswordCore changePasswordCore;
List<UsermainDatabean> usermainDataBeanList = new ArrayList<UsermainDatabean>();
    public ChangePasswordServiceBean() {
    }

    public ChangePasswordServiceBean(UsermainDatabean usermainDatabean, UsermainCore usermainCore, UsermainServicebean usermainServicebean) {
        this.usermainDatabean = usermainDatabean;
        this.usermainCore = usermainCore;
        this.usermainServicebean = usermainServicebean;
    }

    public UsermainCore getUsermainCore() {
        return usermainCore;
    }

    public void setUsermainCore(UsermainCore usermainCore) {
        this.usermainCore = usermainCore;
    }

    public List<UsermainDatabean> getUsermainDataBeanList() {
        return usermainDataBeanList;
    }

    public void setUsermainDataBeanList(List<UsermainDatabean> usermainDataBeanList) {
        this.usermainDataBeanList = usermainDataBeanList;
    }

    public UsermainDatabean getUsermainDatabean() {
        return usermainDatabean;
    }

    public void setUsermainDatabean(UsermainDatabean usermainDatabean) {
        this.usermainDatabean = usermainDatabean;
    }

    public UsermainServicebean getUsermainServicebean() {
        return usermainServicebean;
    }

    public void setUsermainServicebean(UsermainServicebean usermainServicebean) {
        this.usermainServicebean = usermainServicebean;
    }

    public ChangePasswordCore getChangePasswordCore() {
        return changePasswordCore;
    }

    public void setChangePasswordCore(ChangePasswordCore changePasswordCore) {
        this.changePasswordCore = changePasswordCore;
    }
    
    
     
    public void updateUserPassword(){
    List<Usermain> userData = usermainCore.retriveUsernameByEmailId(usermainServicebean.getUserName());
    for(Usermain usermain : userData){
        String encrypt_password = encryptPassword(usermainDatabean.getPassword());
        System.out.println("Encrypted Password---->"+encrypt_password);
    usermain.setPassword(encrypt_password);
    usermain.setIsfirstLogin(Boolean.TRUE);
     changePasswordCore.updateUserPassword(usermain);
    }
   
    }
    
    public String encryptPassword(String password){
    
         String encrypt_pwd = null;
         
        if(null == password) 
            return null;
         
        try {
             
        //Create MessageDigest object for MD5
        MessageDigest digest = MessageDigest.getInstance("MD5");
         
        //Update input string in message digest
        digest.update(password.getBytes(), 0, password.length());
 
        //Converts message digest value in base 16 (hex) 
        encrypt_pwd = new BigInteger(1, digest.digest()).toString(16);
 
        } catch (NoSuchAlgorithmException e) {
 
            e.printStackTrace();
        }
        return encrypt_pwd;
    
    }
}
