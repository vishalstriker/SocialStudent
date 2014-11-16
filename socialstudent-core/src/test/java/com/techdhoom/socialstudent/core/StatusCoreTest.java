/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.core;

import com.techdhoom.socialstudent.core.config.CoreApplicationConfig;
import com.techdhoom.socialstudent.core.impl.StatusCoreImpl;
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
import org.springframework.stereotype.Repository;
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
public class StatusCoreTest {
    
       @Resource
       private StatusCore statusCore;
    public StatusCoreTest() {
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
     * Test of retrieveallStatus method, of class StatusCore.
     */
    @Test
    public void testRetrieveallStatus() {
        System.out.println("retrieveallStatus");
         StatusCore instance = new StatusCoreImpl();
        System.out.println("\n\t---- core" + instance);

        for(Status status : statusCore.retrieveallStatus()){
            System.out.println("\n---"+status.getYourstatus());
        }

    }

    /**
     * Test of createStatus method, of class StatusCore.
     */
    @Test
    public void testCreateStatus() {
        System.out.println("createStatus");
        Status status = new Status(5L);
        status.setYourstatus("mann");
    }

   
}
