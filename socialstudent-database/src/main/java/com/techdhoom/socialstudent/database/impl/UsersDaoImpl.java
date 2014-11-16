/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.common.database.impl.BaseAbstractGenericDao;
import com.techdhoom.socialstudent.database.UsersDao;
import com.techdhoom.socialstudent.model.Users;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author SONY
 */
@Repository
public class UsersDaoImpl extends BaseAbstractGenericDao<Users, Long> implements UsersDao {

    @Override
    public List<Users> groupShow() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Criteria criteria = new HibernateTemplate(sessionFactory).getSessionFactory().getCurrentSession().createCriteria(Users.class);
        return criteria.list();
    }

    @Override
    public Long createUser(Users users) {
        return super.create(users);
    }

    @Override
    public List<Users> retriveAllUsers() {
        return super.retrieveAll();
    }

    @Override
    public Users retrieveUsersById(Long id) {
        return super.retrieveById(id);
    }
}
