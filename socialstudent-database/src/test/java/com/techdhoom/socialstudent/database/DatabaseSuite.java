/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

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
@Suite.SuiteClasses({com.techdhoom.socialstudent.database.config.ConfigSuite.class, com.techdhoom.socialstudent.database.StudentDaoTest.class, com.techdhoom.socialstudent.database.UsermainDaoTest.class, com.techdhoom.socialstudent.database.impl.ImplSuite.class, com.techdhoom.socialstudent.database.StudentContactDaoTest.class})
public class DatabaseSuite {

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
