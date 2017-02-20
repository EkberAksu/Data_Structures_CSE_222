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
public class CourseTest {
    
    public CourseTest() {
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
     * Test of setID method, of class Course.
     */
    @org.junit.Test
    public void testSetID() {
        System.out.println("setID");
        String id = "";
        Course instance = new Course();
        instance.setID(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Course.
     */
    @org.junit.Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Course instance = new Course();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTeacher method, of class Course.
     */
    @org.junit.Test
    public void testSetTeacher() {
        System.out.println("setTeacher");
        Teacher ateacher = null;
        Course instance = new Course();
        instance.setTeacher(ateacher);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Course.
     */
    @org.junit.Test
    public void testGetName() {
        System.out.println("getName");
        Course instance = new Course();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class Course.
     */
    @org.junit.Test
    public void testGetID() {
        System.out.println("getID");
        Course instance = new Course();
        String expResult = "";
        String result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeacher method, of class Course.
     */
    @org.junit.Test
    public void testGetTeacher() {
        System.out.println("getTeacher");
        Course instance = new Course();
        Teacher expResult = null;
        Teacher result = instance.getTeacher();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addStudent method, of class Course.
     */
    @org.junit.Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student aStudent = null;
        Course instance = new Course();
        boolean expResult = false;
        boolean result = instance.addStudent(aStudent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeStudent method, of class Course.
     */
    @org.junit.Test
    public void testRemoveStudent() {
        System.out.println("removeStudent");
        Student aStudent = null;
        Course instance = new Course();
        boolean expResult = false;
        boolean result = instance.removeStudent(aStudent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudents method, of class Course.
     */
    @org.junit.Test
    public void testGetStudents() {
        System.out.println("getStudents");
        Course instance = new Course();
        ArrayList<Student> expResult = null;
        ArrayList<Student> result = instance.getStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTutor method, of class Course.
     */
    @org.junit.Test
    public void testAddTutor() {
        System.out.println("addTutor");
        Tutor aTutor = null;
        Course instance = new Course();
        boolean expResult = false;
        boolean result = instance.addTutor(aTutor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTutor method, of class Course.
     */
    @org.junit.Test
    public void testRemoveTutor() {
        System.out.println("removeTutor");
        Tutor aTutor = null;
        Course instance = new Course();
        boolean expResult = false;
        boolean result = instance.removeTutor(aTutor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMaterial method, of class Course.
     */
    @org.junit.Test
    public void testAddMaterial() {
        System.out.println("addMaterial");
        Documents document = null;
        Course instance = new Course();
        instance.addMaterial(document);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaterials method, of class Course.
     */
    @org.junit.Test
    public void testGetMaterials() {
        System.out.println("getMaterials");
        Course instance = new Course();
        ArrayList<Documents> expResult = null;
        ArrayList<Documents> result = instance.getMaterials();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAssignment method, of class Course.
     */
    @org.junit.Test
    public void testAddAssignment() {
        System.out.println("addAssignment");
        Assignment homework = null;
        Course instance = new Course();
        instance.addAssignment(homework);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAssignment method, of class Course.
     */
    @org.junit.Test
    public void testGetAssignment() {
        System.out.println("getAssignment");
        int assignmentNumber = 0;
        Course instance = new Course();
        Assignment expResult = null;
        Assignment result = instance.getAssignment(assignmentNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Course.
     */
    @org.junit.Test
    public void testEquals() {
        System.out.println("equals");
        Object aCourse = null;
        Course instance = new Course();
        boolean expResult = false;
        boolean result = instance.equals(aCourse);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
