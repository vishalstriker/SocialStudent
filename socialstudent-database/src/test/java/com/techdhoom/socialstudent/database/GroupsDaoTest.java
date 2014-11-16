/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import com.techdhoom.socialstudent.model.Groups;
import java.util.List;
import org.hibernate.criterion.Criterion;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author SONY
 */
public class GroupsDaoTest {
    
    public GroupsDaoTest() {
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
     * Test of createEventmaster method, of class GroupsDao.
     */
    @Test
    public void testCreateEventmaster() {
        System.out.println("createEventmaster");
        Groups groups = null;
        GroupsDao instance = new GroupsDaoImpl();
        Long expResult = null;
        Long result = instance.createEventmaster(groups);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateEventmaster method, of class GroupsDao.
     */
    @Test
    public void testUpdateEventmaster() {
        System.out.println("updateEventmaster");
        Groups groups = null;
        GroupsDao instance = new GroupsDaoImpl();
        Long expResult = null;
        Long result = instance.updateEventmaster(groups);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteEventmaster method, of class GroupsDao.
     */
    @Test
    public void testDeleteEventmaster() {
        System.out.println("deleteEventmaster");
        Groups groups = null;
        GroupsDao instance = new GroupsDaoImpl();
        Long expResult = null;
        Long result = instance.deleteEventmaster(groups);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrievebyidEventmaster method, of class GroupsDao.
     */
    @Test
    public void testRetrievebyidEventmaster() {
        System.out.println("retrievebyidEventmaster");
        Groups groups = null;
        GroupsDao instance = new GroupsDaoImpl();
        Long expResult = null;
        Long result = instance.retrievebyidEventmaster(groups);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieveallEventmaster method, of class GroupsDao.
     */
    @Test
    public void testRetrieveallEventmaster() {
        System.out.println("retrieveallEventmaster");
        Groups groups = null;
        GroupsDao instance = new GroupsDaoImpl();
        Long expResult = null;
        Long result = instance.retrieveallEventmaster(groups);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class GroupsDaoImpl implements GroupsDao {


        @Override
        public Groups retrieveById(Long id) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Long create(Groups entity) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void createOrUpdate(Groups entity) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void update(Groups entity) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void delete(Groups entity) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void deleteById(Long id) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public List<Groups> retrieveAll() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public List<Groups> findAll(String orderBy) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public List<Groups> findFiltered(String property, Object filter) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public List<Groups> findFiltered(String property, Object filter, String orderBy) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public List<Groups> findLikeFiltered(String property, Object filter) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public List<Groups> findLikeFiltered(String property, Object filter, String orderBy) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Groups findUniqueFiltered(String property, Object filter) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Groups findUniqueFiltered(String property, Object filter, String orderBy) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public List<Groups> findByCriteria(Criterion... criterion) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public List<Groups> findByCriteriaList(List<Criterion> criterions) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public List<Groups> findByCriteriaList(List<Criterion> criterions, Boolean isSearch) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public List<Groups> findByExample(Groups entity) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Long createEventmaster(Groups groups) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Long updateEventmaster(Groups groups) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Long deleteEventmaster(Groups groups) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Long retrievebyidEventmaster(Groups groups) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Long retrieveallEventmaster(Groups groups) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
