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
import com.techdhoom.socialstudent.model.Feed;
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

public class FeedDaoTest {
    @Autowired
    FeedDao feedDao;
    public FeedDaoTest() {
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
     * Test of createFeed method, of class FeedDao.
     */
    @Test
    public void testCreateFeed() {
        System.out.println("createFeed");
        Feed feed = new Feed();
       feed.setFeedType("status updated");
        Long result = feedDao.create(feed);
        System.out.println("\n\t---"+result);
    }

   
}
