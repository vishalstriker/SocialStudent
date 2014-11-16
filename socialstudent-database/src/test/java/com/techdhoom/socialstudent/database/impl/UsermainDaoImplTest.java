/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.model.Usermain;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tapan
 */
public class UsermainDaoImplTest {
    
    public UsermainDaoImplTest() {
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
     * Test of createUsermain method, of class UsermainDaoImpl.
     */
    @Test
    public void testCreateUsermain() {
        System.out.println("createUsermain");
        Usermain usermain = new Usermain();
        UsermainDaoImpl instance = new UsermainDaoImpl();
        Long expResult = null;
        Long result = instance.createUsermain(usermain);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
