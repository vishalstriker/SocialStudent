/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import com.techdhoom.socialstudent.database.config.DatabaseApplicationConfig;
import com.techdhoom.socialstudent.database.impl.StatusDaoImpl;
import com.techdhoom.socialstudent.model.Status;
import com.techdhoom.socialstudent.model.Usermain;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 *
 * @author SONY
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = {DatabaseApplicationConfig.class})
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
//@Transactional
public class StatusDaoTest {
    @Autowired
      StatusDao statusDao;
    
    public StatusDaoTest() {
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
     * Test of createStatus method, of class StatusDao.
     */
//    @Test
//    public void testCreateStatus() {
//      System.out.println("createStatus");
//        Status status = new Status();
//        status.setYourstatus("Test");
//       
//        Long result = statusDao.createStatus(status);
//    }
//
//    /**
//     * Test of updateStatus method, of class StatusDao.
//     */
//    @Test
//    public void testRetrieveallStatus() {
//        System.out.println("retrieveallStatus");
//       List<Status> result =statusDao.retrieveallStatus();
//        for(Status status: result){
//            System.out.println("\n\t--user name "+status.getYourstatus()+"\t");
//        }
//        System.out.println("\n\t-- size of list "+result.size());
//    }

    /**
     * Test of findFiltered1 method, of class StatusDao.
     */
    @Test
    public void testFindFiltered1() {
        System.out.println("findFiltered1");
       // String property = "";
       // Object filter = 4l;
//        StatusDao instance = new StatusDaoImpl();
//        List expResult = null;
//        List result = instance.findFiltered1(property, filter);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//   
   Usermain usermain=new Usermain(4l);
        List<Status> result =statusDao.findFiltered1("userid",usermain);
        for(Status status: result){
            System.out.println("\n\t--user name "+status.getYourstatus()+"\t");
        }
       
   
    
    }
        

   
    }



