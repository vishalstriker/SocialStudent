/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import com.techdhoom.socialstudent.database.config.DatabaseApplicationConfig;
import com.techdhoom.socialstudent.model.Users;
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
public class UsersDaoTest {

    @Autowired
    UsersDao usersDao;
    
    public UsersDaoTest() {
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
     * Test of retriveAllUsers method, of class UsersDao.
     */
    @Test
    public void testRetriveAllUsers() {
        System.out.println("retriveAllUsers");
        List<Users> result = usersDao.retriveAllUsers();
        for(Users users : result){
            System.out.println("\n\t--user name "+users.getFirstname()+"\t"+users.getUserid());
        }
        System.out.println("\n\t-- size of list "+result.size());
    }

    /**
     * Test of createUser method, of class UsersDao.
     */
    @Test
    public void testCreateUser() {
        System.out.println("createUser");
        Users users = new Users(4l);
        users.setFirstname("tapan");
        Long result = usersDao.createUser(users);
    }

}
