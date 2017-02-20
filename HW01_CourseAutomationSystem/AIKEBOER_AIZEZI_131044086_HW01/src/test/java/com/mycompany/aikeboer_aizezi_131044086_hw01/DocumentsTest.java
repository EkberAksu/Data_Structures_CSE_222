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
public class DocumentsTest {
    
    public DocumentsTest() {
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
     * Test of setName method, of class Documents.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Documents instance = new DocumentsImpl();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDiscription method, of class Documents.
     */
    @Test
    public void testSetDiscription() {
        System.out.println("setDiscription");
        String discription = "";
        Documents instance = new DocumentsImpl();
        instance.setDiscription(discription);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Documents.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Documents instance = new DocumentsImpl();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiscription method, of class Documents.
     */
    @Test
    public void testGetDiscription() {
        System.out.println("getDiscription");
        Documents instance = new DocumentsImpl();
        String expResult = "";
        String result = instance.getDiscription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Documents.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Documents instance = new DocumentsImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DocumentsImpl extends Documents {

        public String toString() {
            return "";
        }
    }
    
}
