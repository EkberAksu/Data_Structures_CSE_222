/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aikeboer_aizezi_131044086_hw01;

import java.util.ArrayList;
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
public class TutorTest {
    
    public TutorTest() {
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
     * Test of setTutoringCourse method, of class Tutor.
     */
    @Test
    public void testSetTutoringCourse() {
        System.out.println("setTutoringCourse");
        Course otherCourse = null;
        Tutor instance = new Tutor();
        instance.setTutoringCourse(otherCourse);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTutoringCourse method, of class Tutor.
     */
    @Test
    public void testGetTutoringCourse() {
        System.out.println("getTutoringCourse");
        Tutor instance = new Tutor();
        Course expResult = null;
        Course result = instance.getTutoringCourse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewCourseMaterials method, of class Tutor.
     */
    @Test
    public void testViewCourseMaterials() {
        System.out.println("viewCourseMaterials");
        Tutor instance = new Tutor();
        ArrayList<Documents> expResult = null;
        ArrayList<Documents> result = instance.viewCourseMaterials();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewAssignment method, of class Tutor.
     */
    @Test
    public void testViewAssignment() {
        System.out.println("viewAssignment");
        int assignmentNumber = 0;
        Tutor instance = new Tutor();
        Assignment expResult = null;
        Assignment result = instance.viewAssignment(assignmentNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Tutor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Tutor instance = new Tutor();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
