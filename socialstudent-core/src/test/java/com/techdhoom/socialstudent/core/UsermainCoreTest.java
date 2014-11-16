/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.core;

import com.techdhoom.socialstudent.core.config.CoreApplicationConfig;
import com.techdhoom.socialstudent.core.impl.UsermainCoreImpl;
import com.techdhoom.socialstudent.model.Usermain;
import java.util.List;
import javax.annotation.Resource;
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
public class UsermainCoreTest {
    
    @Resource
    private  UsermainCore usermainCore;
    public UsermainCoreTest() {
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
     * Test of createUser method, of class UsermainCore.
     */
//    @Test
//    public void testCreateUser() {
//        System.out.println("createUser");
//        Usermain usermain = new Usermain();
//       usermain.setUserlastname("parikh");
//        System.out.println(usermain.getUserlastname());
//        usermainCore.createUser(usermain);
//    }

    /**
     * Test of retrieveAllUsermain method, of class UsermainCore.
     */
    @Test
    public void testRetrieveAllUsermain() {
        System.out.println("retrieveAllUsermain");
       
        UsermainCore  instance = new UsermainCoreImpl();
        System.out.println("\n\t---- core" + instance);

        for(Usermain usermain:usermainCore.retrieveAllUsermain()){
            System.out.println("\n---"+usermain.getEmailId()+"  "+usermain.getPassword());
        }
    }

   
    }

   

