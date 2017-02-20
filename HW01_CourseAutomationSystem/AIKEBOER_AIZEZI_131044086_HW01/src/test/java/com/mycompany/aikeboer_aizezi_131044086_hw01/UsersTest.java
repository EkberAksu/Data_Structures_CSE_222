/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aikeboer_aizezi_131044086_hw01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Akbar Aziz
 */
public class UsersTest {
    
    public UsersTest() {
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
     * Test of setID method, of class Users.
     */
    @org.junit.Test
    public void testSetID() {
        System.out.println("setID");
        int id = 0;
        Users instance = new UsersImpl();
        instance.setID(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Users.
     */
    @org.junit.Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Users instance = new UsersImpl();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Users.
     */
    @org.junit.Test
    public void testSetPassword() {
        System.out.println("setPassword");
        int password = 0;
        Users instance = new UsersImpl();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Users.
     */
    @org.junit.Test
    public void testGetName() {
        System.out.println("getName");
        Users instance = new UsersImpl();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class Users.
     */
    @org.junit.Test
    public void testGetID() {
        System.out.println("getID");
        Users instance = new UsersImpl();
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeName method, of class Users.
     */
    @org.junit.Test
    public void testChangeName() {
        System.out.println("changeName");
        String name = "";
        Users instance = new UsersImpl();
        instance.changeName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changePassword method, of class Users.
     */
    @org.junit.Test
    public void testChangePassword() {
        System.out.println("changePassword");
        int password = 0;
        Users instance = new UsersImpl();
        instance.changePassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class UsersImpl implements Users {

        public void setID(int id) {
        }

        public void setName(String name) {
        }

        public void setPassword(int password) {
        }

        public String getName() {
            return "";
        }

        public int getID() {
            return 0;
        }

        public void changeName(String name) {
        }

        public void changePassword(int password) {
        }
    }
    
}
