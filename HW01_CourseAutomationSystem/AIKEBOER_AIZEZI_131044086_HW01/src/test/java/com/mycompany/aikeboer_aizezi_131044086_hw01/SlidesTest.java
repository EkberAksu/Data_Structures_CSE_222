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
public class SlidesTest {
    
    public SlidesTest() {
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
     * Test of setSize method, of class Slides.
     */
    @org.junit.Test
    public void testSetSize() {
        System.out.println("setSize");
        int size = 0;
        Slides instance = new Slides();
        instance.setSize(size);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPages method, of class Slides.
     */
    @org.junit.Test
    public void testSetPages() {
        System.out.println("setPages");
        int pages = 0;
        Slides instance = new Slides();
        instance.setPages(pages);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class Slides.
     */
    @org.junit.Test
    public void testGetSize() {
        System.out.println("getSize");
        Slides instance = new Slides();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPages method, of class Slides.
     */
    @org.junit.Test
    public void testGetPages() {
        System.out.println("getPages");
        Slides instance = new Slides();
        int expResult = 0;
        int result = instance.getPages();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Slides.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        Slides instance = new Slides();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
