/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import com.techdhoom.socialstudent.database.config.DatabaseApplicationConfig;
import com.techdhoom.socialstudent.model.Groupmaster;
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
public class GroupmasterDaoTest {
      @Autowired
      GroupmasterDao groupmasterDao;
    
    public GroupmasterDaoTest() {
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
     * Test of createGroupmaster method, of class GroupmasterDao.
     */
//    @Test
//    public void testCreateGroupmaster() {
//        System.out.println("createGroupmaster");
//        Groupmaster groupmaster = null;
//        GroupmasterDao instance = new GroupmasterDaoImpl();
//        Long expResult = null;
//        Long result = instance.createGroupmaster(groupmaster);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of retrieveallGroupmaster method, of class GroupmasterDao.
     */
    @Test
    public void testRetrieveallGroupmaster() {
        System.out.println("retrieveallGroupmaster");
       List<Groupmaster> result =groupmasterDao.retrieveallGroupmaster();
        for(Groupmaster groupmaster : result){
            System.out.println("\n\t--user name "+groupmaster.getGroupType()+"\t"+groupmaster.getGroupmasterId());
        }
        System.out.println("\n\t-- size of list "+result.size());
    }

    
   
}
