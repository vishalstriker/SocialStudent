/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import com.techdhoom.socialstudent.database.config.DatabaseApplicationConfig;
import com.techdhoom.socialstudent.model.Usermain;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 *
 * @author krunal
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = {DatabaseApplicationConfig.class})
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
//@Transactional
public class UsermainDaoTest {
    
    @Autowired
    UsermainDao usermainDao;
    public UsermainDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createUsermain method, of class UsermainDao.
     */
//    @Test
//    public void testCreateUsermain() {
//        System.out.println("createUsermain");
//        Usermain usermain = new Usermain();
//        usermain.setUsername("tapan");
//        System.out.println(usermain.getUsername());
//        usermain.setYear(2009);
//        System.out.println(usermain.getYear());
//        Long result = usermainDao.createUsermain(usermain);
//    }

    /**
     * Test of retriveAllUsermain method, of class UsermainDao.
     */
    @Test
    public void testRetriveAllUsermain() {
        System.out.println("retriveAllUsermain");
        List<Usermain> result =usermainDao.retriveAllUsermain();
        for(Usermain usermain: result){
            System.out.println("\n\t--user name "+usermain.getEmailId()+usermain.getPassword()+"\t");
        }
        System.out.println("\n\t-- size of list "+result.size());
    }
    }

    
//    }

    /**
     * Test of retriveAllUsersofGroup method, of class UsermainDao.
     */
//    @Test
//    public void testRetriveAllUsersofGroup() {
//        System.out.println("retriveAllUsersofGroup");
//        List<Usermain> result=usermainDao.retriveAllUsersofGroup("android");
//        for(Usermain usermain: result){
//            System.out.println("\n\t--user name "+usermain.getUsername()+"\t");
//        }
//        String GroupName = "";
//        UsermainDao instance = new UsermainDaoImpl();
//        List expResult = null;
//        List result = instance.retriveAllUsersofGroup(GroupName);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    

   
    

    /**
     * Test of createUsermain method, of class UsermainDao.
     */

//    public class UsermainDaoImpl implements UsermainDao {
//
//        public Long createUsermain(Usermain usermain) {
//            return null;
//        }
//
//        public List<Usermain> retriveAllUsermain() {
//            return null;
//        }
//    }

