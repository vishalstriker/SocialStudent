/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.common.database.impl.BaseAbstractGenericDao;
import com.techdhoom.socialstudent.database.UsermainDao;
import com.techdhoom.socialstudent.model.Group1;
import com.techdhoom.socialstudent.model.Usermain;
import com.techdhoom.socialstudent.model.Users;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Subqueries;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tapan
 */
@Repository
public class UsermainDaoImpl extends BaseAbstractGenericDao<Usermain, Long> implements UsermainDao{
     @Override
    public Long createUsermain(Usermain usermain) {
//        usermain.setEnrollNo(usermain.getEnrollNo());
//         usermain.setUsername(usermain.getUsername());
//         usermain.setUserlastname(usermain.getUserlastname());
//         usermain.setBranch(usermain.getBranch());
      //   usermain.setYear(usermain.getYear());
        return super.create(usermain);
    }

//    @Override
//    public Long updateUsermain(Usermain usermain) {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }
//
//    @Override
//    public Long deleteUsermain(Usermain usermain) {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }
//
//    @Override
//    public Long retrievebyidUsermain(Usermain usermain) {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }
//
//    @Override
//    public Long retrieveallUsermain(Usermain usermain) {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }
//    

//    @Override
//    public List<Usermain> retriveAllUsersofGroup(String GroupName) {
//       SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Criteria criteria = new HibernateTemplate(sessionFactory).getSessionFactory().getCurrentSession().createCriteria(Usermain.class);
//        DetachedCriteria detachedCriteria=DetachedCriteria.forClass(Group1.class);
//        detachedCriteria.add(Restrictions.eq("groupname",GroupName));
//        detachedCriteria.setProjection(Projections.property("created_by"));
//        criteria.add(Subqueries.propertyEq("user_id", detachedCriteria));
//        criteria.setProjection(Projections.property("username"));
//        return criteria.list();
//        
//    
//    
//    }

    @Override
    public List<Usermain> retriveAllUsermain() {
       return super.retrieveAll();
    }
}
