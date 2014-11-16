/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.ContextConfiguration;
import com.techdhoom.socialstudent.database.config.DatabaseApplicationConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;
import com.techdhoom.socialstudent.database.impl.FeedlikeDaoImpl;
import com.techdhoom.socialstudent.model.Feedlike;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.*;

/**
 *
 * @author tapan
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader=AnnotationConfigContextLoader.class, classes={DatabaseApplicationConfig.class})
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
//@Transactional

public class FeedlikeDaoTest {
 @Autowired
 FeedlikeDao feedlikeDao;
    public FeedlikeDaoTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createFeedlike method, of class FeedlikeDao.
     */
    @Test
    public void testCreateFeedlike() {
        System.out.println("createFeedlike");
        Feedlike feedlike = new Feedlike();
        feedlike.setFeedcommentId(1);
        Long result = feedlikeDao.create(feedlike);
        System.out.println("\n\t---"+result);
    }

    /**
     * Test of updateFeedlike method, of class FeedlikeDao.
     */
    @Test
    public void testUpdateFeedlike() {
        System.out.println("updateFeedlike");
        Feedlike feedlike = null;
        FeedlikeDao instance = new FeedlikeDaoImpl();
        Long expResult = null;
        Long result = instance.updateFeedlike(feedlike);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteFeedlike method, of class FeedlikeDao.
     */
    @Test
    public void testDeleteFeedlike() {
        System.out.println("deleteFeedlike");
        Feedlike feedlike = null;
        FeedlikeDao instance = new FeedlikeDaoImpl();
        Long expResult = null;
        Long result = instance.deleteFeedlike(feedlike);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrievebyidFeedlike method, of class FeedlikeDao.
     */
    @Test
    public void testRetrievebyidFeedlike() {
        System.out.println("retrievebyidFeedlike");
        Feedlike feedlike = null;
        FeedlikeDao instance = new FeedlikeDaoImpl();
        Long expResult = null;
        Long result = instance.retrievebyidFeedlike(feedlike);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieveallFeedlike method, of class FeedlikeDao.
     */
    @Test
    public void testRetrieveallFeedlike() {
        System.out.println("retrieveallFeedlike");
        Feedlike feedlike = null;
        FeedlikeDao instance = new FeedlikeDaoImpl();
        Long expResult = null;
        Long result = instance.retrieveallFeedlike(feedlike);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

        }

