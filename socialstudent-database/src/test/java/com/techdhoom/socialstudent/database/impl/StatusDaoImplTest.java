/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.model.Status;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author SONY
 */
public class StatusDaoImplTest {
    
    public StatusDaoImplTest() {
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
     * Test of createStatus method, of class StatusDaoImpl.
     */
    @Test
    public void testCreateStatus() {
        System.out.println("createStatus");
        Status status = null;
        StatusDaoImpl instance = new StatusDaoImpl();
        Long expResult = null;
        Long result = instance.createStatus(status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateStatus method, of class StatusDaoImpl.
     */
  
    /**
     * Test of retrieveallStatus method, of class StatusDaoImpl.
     */
    @Test
    public void testRetrieveallStatus() {
        System.out.println("retrieveallStatus");
        Status status = null;
        StatusDaoImpl instance = new StatusDaoImpl();
        Long expResult = null;
      //  Long result = instance.retrieveallStatus(status);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
