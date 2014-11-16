/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.core;

import com.techdhoom.socialstudent.core.config.CoreApplicationConfig;
import com.techdhoom.socialstudent.core.impl.GroupMasterCoreImpl;
import com.techdhoom.socialstudent.model.Groupmaster;
import com.techdhoom.socialstudent.model.Users;
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
public class GroupMasterCoreTest {
    
     @Resource
    private GroupMasterCore groupMasterCore;
    public GroupMasterCoreTest() {
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
     * Test of retrieveAllGroupmasters method, of class GroupMasterCore.
     */
    @Test
    public void testRetrieveAllGroupmasters() {
        System.out.println("retrieveAllGroupmasters");
        GroupMasterCore instance = new GroupMasterCoreImpl();
        System.out.println("\n\t---- core" + instance);

        for(Groupmaster groupmaster : groupMasterCore.retrieveAllGroupmasters()){
            System.out.println("\n---"+groupmaster.getGroupType());
        }
    }

   
}
