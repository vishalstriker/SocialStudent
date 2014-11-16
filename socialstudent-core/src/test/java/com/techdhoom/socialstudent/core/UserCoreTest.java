/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.core;

import com.techdhoom.socialstudent.core.config.CoreApplicationConfig;
import com.techdhoom.socialstudent.core.impl.UserCoreImpl;
import com.techdhoom.socialstudent.model.Users;
import javax.annotation.Resource;
//import javax.annotation.Resource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 *
 * @author krunal
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = {CoreApplicationConfig.class})
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
//@Transactional
public class UserCoreTest {

    @Resource
    private UserCore userCore;

    public UserCoreTest() {
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
     * Test of retrieveAllUsers method, of class UserCore.
     */
    @Test
    public void testRetrieveAllUsers() {
        System.out.println("retrieveAllUsers");
        UserCore instance = new UserCoreImpl();
        System.out.println("\n\t---- core" + instance);

        for(Users user : userCore.retrieveAllUsers()){
            System.out.println("\n---"+user.getFirstname());
        }

    }
    
    /**
     * Test of createUser method, of class UserCore.
     */
    @Test
    public void testCreateUser() {
        System.out.println("createUser");
        Users users = new Users(5L);
        users.setFirstname("nac");
//        userCore.createUser(users, usercon);
  }
}
