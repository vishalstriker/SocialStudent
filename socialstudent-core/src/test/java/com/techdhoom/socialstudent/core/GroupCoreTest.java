/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.core;

import com.techdhoom.socialstudent.core.config.CoreApplicationConfig;
import com.techdhoom.socialstudent.core.impl.GroupCoreImpl;
import com.techdhoom.socialstudent.core.impl.StatusCoreImpl;
import com.techdhoom.socialstudent.model.Group1;
import com.techdhoom.socialstudent.model.Status;
import java.util.List;
import javax.annotation.Resource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
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
public class GroupCoreTest {
    
     @Resource
       private GroupCore groupCore;
    public GroupCoreTest() {
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
     * Test of retrieveAllGroup method, of class GroupCore.
     */
    @Test
    public void testRetrieveAllGroup() {
        System.out.println("retrieveAllGroup");
    GroupCore instance = new GroupCoreImpl();
        System.out.println("\n\t---- core" + instance);

        for(Group1 group1:groupCore.retrieveAllGroup()){
            System.out.println("\n---"+group1.getGroupname());
        }
    }

    /**
     * Test of createGroup method, of class GroupCore.
     */
    @Test
    public void testCreateGroup() {
        System.out.println("createGroup");
     Group1 group1 = new Group1();
       group1.setGroupname("Test");
        System.out.println(group1.getGroupname());
        groupCore.createGroup(group1);
    }

   


}

