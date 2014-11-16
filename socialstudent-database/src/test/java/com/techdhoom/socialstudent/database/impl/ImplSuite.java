/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author tapan
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.techdhoom.socialstudent.database.impl.StudentDaoImplTest.class, com.techdhoom.socialstudent.database.impl.UsermainDaoImplTest.class, com.techdhoom.socialstudent.database.impl.StudentContactDaoImplTest.class})
public class ImplSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
