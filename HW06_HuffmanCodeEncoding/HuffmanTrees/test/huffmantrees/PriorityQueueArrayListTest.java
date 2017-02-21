/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffmantrees;

import java.util.Iterator;
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
public class PriorityQueueArrayListTest {
    
    public PriorityQueueArrayListTest() {
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
     * Test of offer method, of class PriorityQueueArrayList.
     */
    @Test
    public void testOffer() {
        System.out.println("offer");
        Object e = null;
        PriorityQueueArrayList instance = new PriorityQueueArrayList();
        instance.add(2);
        instance.add(10);
        instance.add(15);
        instance.add(1);
        instance.add(6);
        boolean expResult = true;
        boolean result = instance.offer(7);
        assertEquals(expResult, result);
    }

    /**
     * Test of remove method, of class PriorityQueueArrayList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        PriorityQueueArrayList instance = new PriorityQueueArrayList();
        instance.add(2);
        instance.add(10);
        instance.add(15);
        instance.add(1);
        instance.add(6);
        Object expResult = 1;
        Object result = instance.remove();
        assertEquals(expResult, result);
    }

    /**
     * Test of removeElement method, of class PriorityQueueArrayList.
     */
    @Test
    public void testRemoveElement() {
        System.out.println("removeElement");
        Object e = null;
        PriorityQueueArrayList instance = new PriorityQueueArrayList();
        instance.add(2);
        instance.add(10);
        instance.add(15);
        instance.add(1);
        instance.add(6);
        boolean expResult = false;
        boolean result = instance.removeElement(5);
        assertEquals(expResult, result);
    }

    /**
     * Test of poll method, of class PriorityQueueArrayList.
     */
    @Test
    public void testPoll() {
        System.out.println("poll");
        PriorityQueueArrayList instance = new PriorityQueueArrayList();
        instance.add(2);
        instance.add(10);
        instance.add(15);
        instance.add(1);
        instance.add(6);
        Object expResult = 1;
        Object result = instance.poll();
        assertEquals(expResult, result);
    }

    /**
     * Test of peek method, of class PriorityQueueArrayList.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        PriorityQueueArrayList instance = new PriorityQueueArrayList();
        instance.add(2);
        instance.add(10);
        instance.add(15);
        instance.add(1);
        instance.add(6);
        Object expResult = 1;
        Object result = instance.peek();
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class PriorityQueueArrayList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        PriorityQueueArrayList instance = new PriorityQueueArrayList();
        instance.add(0);
        instance.add(4);
        instance.add(9);
        instance.add(5);
        int expResult = 4;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of isEmpty method, of class PriorityQueueArrayList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        PriorityQueueArrayList instance = new PriorityQueueArrayList();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class PriorityQueueArrayList.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PriorityQueueArrayList instance = new PriorityQueueArrayList();
        instance.add(10);
        instance.add(15);
        instance.add(1);
        instance.add(6);
        String expResult = "1<--6<--10<--15";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
