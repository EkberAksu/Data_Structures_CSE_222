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
public class AssignmentTest {
    
    public AssignmentTest() {
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
     * Test of changeFile method, of class Assignment.
     */
    @org.junit.Test
    public void testChangeFile() {
        System.out.println("changeFile");
        File homework = null;
        Assignment instance = new Assignment();
        instance.changeFile(homework);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeSubDate method, of class Assignment.
     */
    @org.junit.Test
    public void testChangeSubDate() {
        System.out.println("changeSubDate");
        String date = "";
        Assignment instance = new Assignment();
        instance.changeSubDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeLateSubDate method, of class Assignment.
     */
    @org.junit.Test
    public void testChangeLateSubDate() {
        System.out.println("changeLateSubDate");
        String date = "";
        Assignment instance = new Assignment();
        instance.changeLateSubDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumber method, of class Assignment.
     */
    @org.junit.Test
    public void testGetNumber() {
        System.out.println("getNumber");
        Assignment instance = new Assignment();
        int expResult = 0;
        int result = instance.getNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFile method, of class Assignment.
     */
    @org.junit.Test
    public void testGetFile() {
        System.out.println("getFile");
        Assignment instance = new Assignment();
        File expResult = null;
        File result = instance.getFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubDate method, of class Assignment.
     */
    @org.junit.Test
    public void testGetSubDate() {
        System.out.println("getSubDate");
        Assignment instance = new Assignment();
        String expResult = "";
        String result = instance.getSubDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLateSubDate method, of class Assignment.
     */
    @org.junit.Test
    public void testGetLateSubDate() {
        System.out.println("getLateSubDate");
        Assignment instance = new Assignment();
        String expResult = "";
        String result = instance.getLateSubDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Assignment.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        Assignment instance = new Assignment();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
