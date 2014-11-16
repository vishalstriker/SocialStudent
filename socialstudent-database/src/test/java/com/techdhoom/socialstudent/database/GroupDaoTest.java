/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import com.techdhoom.socialstudent.database.config.DatabaseApplicationConfig;
import com.techdhoom.socialstudent.model.Group1;
import com.techdhoom.socialstudent.model.Status;
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
public class GroupDaoTest {
    @Autowired
    GroupDao groupDao;
    
    
    public GroupDaoTest() {
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
     * Test of retrieveallGroup method, of class GroupDao.
     */
//    @Test
//    public void testRetrieveallGroup() {
//        System.out.println("retrieveallGroup");
//        List<Group1> result =groupDao.retrieveallGroup();
//        for(Group1 group1: result){
//            System.out.println("\n\t--user name "+group1.getGroupname()+"\t");
//        }
//        System.out.println("\n\t-- size of list "+result.size());
//    }

    /**
     * Test of createGroup method, of class GroupDao.
     */
    @Test
    public void testCreateGroup() {
        System.out.println("createGroup");
      // System.out.println("createStatus");
        Group1 group1= new Group1();
        group1.setGroupname("php1111");
      //  group1.setGroupId(4l);
        
       
        Long result = groupDao.createGroup(group1);
    }

    
    }

   

