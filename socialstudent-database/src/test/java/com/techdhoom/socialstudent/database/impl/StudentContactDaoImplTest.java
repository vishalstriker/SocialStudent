/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.model.StudentContact;
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
public class StudentContactDaoImplTest {
    
    public StudentContactDaoImplTest() {
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
     * Test of createStudentContact method, of class StudentContactDaoImpl.
     */
    @Test
    public void testCreateStudentContact() {
        System.out.println("createStudentContact");
        StudentContact studentContact = null;
        StudentContactDaoImpl instance = new StudentContactDaoImpl();
        Long expResult = null;
        Long result = instance.createStudentContact(studentContact);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
