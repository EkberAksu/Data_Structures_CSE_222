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
public class TeacherTest {
    
    public TeacherTest() {
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
     * Test of addCourse method, of class Teacher.
     */
    @org.junit.Test
    public void testAddCourse() {
        System.out.println("addCourse");
        Course aCourse = null;
        Teacher instance = new Teacher();
        boolean expResult = false;
        boolean result = instance.addCourse(aCourse);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addStudent method, of class Teacher.
     */
    @org.junit.Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student aStudent = null;
        Course aCourse = null;
        Teacher instance = new Teacher();
        boolean expResult = false;
        boolean result = instance.addStudent(aStudent, aCourse);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeStudent method, of class Teacher.
     */
    @org.junit.Test
    public void testRemoveStudent() {
        System.out.println("removeStudent");
        Student aStudent = null;
        Course aCourse = null;
        Teacher instance = new Teacher();
        boolean expResult = false;
        boolean result = instance.removeStudent(aStudent, aCourse);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTutor method, of class Teacher.
     */
    @org.junit.Test
    public void testAddTutor() {
        System.out.println("addTutor");
        Student aStudent = null;
        Course aCourse = null;
        Teacher instance = new Teacher();
        boolean expResult = false;
        boolean result = instance.addTutor(aStudent, aCourse);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTutor method, of class Teacher.
     */
    @org.junit.Test
    public void testRemoveTutor() {
        System.out.println("removeTutor");
        Student aStudent = null;
        Course aCourse = null;
        Teacher instance = new Teacher();
        boolean expResult = false;
        boolean result = instance.removeTutor(aStudent, aCourse);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAssignment method, of class Teacher.
     */
    @org.junit.Test
    public void testAddAssignment() {
        System.out.println("addAssignment");
        Assignment assignment = null;
        Course aCourse = null;
        Teacher instance = new Teacher();
        instance.addAssignment(assignment, aCourse);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Teacher.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        Teacher instance = new Teacher();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Teacher.
     */
    @org.junit.Test
    public void testEquals() {
        System.out.println("equals");
        AbsUsers aTeacher = null;
        Teacher instance = new Teacher();
        boolean expResult = false;
        boolean result = instance.equals(aTeacher);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
