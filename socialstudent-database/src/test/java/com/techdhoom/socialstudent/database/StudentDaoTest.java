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
import com.techdhoom.socialstudent.model.Student;
import com.techdhoom.socialstudent.model.Users;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ME
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = {DatabaseApplicationConfig.class})
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
//@Transactional
public class StudentDaoTest {

    @Autowired
    StudentDao studentDao;
    @Autowired
    UsersDao usersDao;

    public StudentDaoTest() {
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
     * Test of createStudent method, of class StudentDao.
     */
//    @Test
    public void testCreateStudent() {
        System.out.println("createStudent");
        Student student = new Student();
        student.setName("manan");
        Long result = studentDao.create(student);
        System.out.println("\n\t---" + result);
        for (Student std : studentDao.retrieveAll()) {
            System.out.println("\n\t--" + std.getName());
        }
    }

    @Test
    public void allUser() {
        for (Users std : usersDao.retrieveAll()) {
            System.out.println("\n\t--" + std.getFirstname());
        }
    }
}
