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
public class CourseSystemTest {
    
    public CourseSystemTest() {
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
     * Test of getCourses method, of class CourseSystem.
     */
    @Test
    public void testGetCourses() {
        System.out.println("getCourses");
        CourseSystem instance = new CourseSystem();
        ArrayList<Course> expResult = null;
        ArrayList<Course> result = instance.getCourses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeachers method, of class CourseSystem.
     */
    @Test
    public void testGetTeachers() {
        System.out.println("getTeachers");
        CourseSystem instance = new CourseSystem();
        ArrayList<Teacher> expResult = null;
        ArrayList<Teacher> result = instance.getTeachers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudents method, of class CourseSystem.
     */
    @Test
    public void testGetStudents() {
        System.out.println("getStudents");
        CourseSystem instance = new CourseSystem();
        ArrayList<Student> expResult = null;
        ArrayList<Student> result = instance.getStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class CourseSystem.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CourseSystem instance = new CourseSystem();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
