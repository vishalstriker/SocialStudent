/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.config;

import javax.sql.DataSource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;

/**
 *
 * @author tapan
 */
public class DatabaseApplicationConfigTest {

    public DatabaseApplicationConfigTest() {
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
     * Test of dataSourcePBalance method, of class DatabaseApplicationConfig.
     */
//    @Test
    public void testDataSourcePBalance() {
        System.out.println("dataSourcePBalance");
        DatabaseApplicationConfig instance = new DatabaseApplicationConfig();
//        DataSource expResult = null;
        System.out.println("\n\t");
        DataSource result = instance.dataSourceSocialStudent();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of sessionFactoryPBalance method, of class
     * DatabaseApplicationConfig.
     */
//    @Test
    public void testSessionFactoryPBalance() {
        System.out.println("sessionFactoryPBalance");
        DatabaseApplicationConfig instance = new DatabaseApplicationConfig();
        AnnotationSessionFactoryBean expResult = null;
        AnnotationSessionFactoryBean result = instance.sessionFactorySocialStudent();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of hibernateTemplate method, of class DatabaseApplicationConfig.
     */
    @Test
    public void testHibernateTemplate() throws Exception {
        System.out.println("hibernateTemplate");
        DatabaseApplicationConfig instance = new DatabaseApplicationConfig();
        HibernateTemplate expResult = null;
        HibernateTemplate result = instance.hibernateTemplate();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of transactionManager method, of class DatabaseApplicationConfig.
     */
//    @Test
    public void testTransactionManager() {
        System.out.println("transactionManager");
        DatabaseApplicationConfig instance = new DatabaseApplicationConfig();
        HibernateTransactionManager expResult = null;
        HibernateTransactionManager result = instance.transactionManager();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}
