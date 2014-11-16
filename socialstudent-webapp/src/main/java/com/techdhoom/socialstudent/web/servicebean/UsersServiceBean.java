/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.web.servicebean;

import com.techdhoom.socialstudent.core.UserCore;
import com.techdhoom.socialstudent.model.Users;
import com.techdhoom.socialstudent.web.databean.UsersDataBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author SONY
 */
@ManagedBean
@RequestScoped
public class UsersServiceBean {

    @ManagedProperty(value = "#{usersDataBean}")
    private UsersDataBean usersDataBean;
    @ManagedProperty(value = "#{userCore}")
    public UserCore userCore;
    List<UsersDataBean> usersDataBeanList;

    public List<UsersDataBean> getUsersDataBeanList() {
        return usersDataBeanList;
    }

    public void setUsersDataBeanList(List<UsersDataBean> usersDataBeanList) {
        this.usersDataBeanList = usersDataBeanList;
    }

    public UsersServiceBean() {
    }

    public UsersServiceBean(UsersDataBean usersDataBean) {
        this.usersDataBean = usersDataBean;
    }

    public UsersDataBean getUsersDataBean() {
        return usersDataBean;
    }

    public UserCore getUserCore() {
        return userCore;
    }

    public void setUserCore(UserCore userCore) {
        this.userCore = userCore;
    }

    public void setUsersDataBean(UsersDataBean usersDataBean) {
        this.usersDataBean = usersDataBean;
    }

    public void createUser() {
        Users users = new Users();
//        UsersDao usersDao = new UsersDaoImpl();
        users.setFirstname(usersDataBean.getFirstname());
//        usersDao.createUser(users);
    }

    public void retriveUsers() {
//        Map<Long,Users> userContact = new HashMap<Long,Users>();
//        for(Users temp : userCore.retrieveAllUsers()){
//            userContact.put(temp.getUserid(), temp);
//        }
        this.setUsersDataBeanList(new ArrayList<UsersDataBean>());
        for (Users users : userCore.retrieveAllUsers()) {
//            Users u = userContact.get(users.getUserid());
            UsersDataBean bean = new UsersDataBean(users.getUserid(), users.getFirstname());
            this.usersDataBeanList.add(bean);
        }
    }
//    
}
