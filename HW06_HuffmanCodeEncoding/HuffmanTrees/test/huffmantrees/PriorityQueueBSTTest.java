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
public class PriorityQueueBSTTest {
    
    public PriorityQueueBSTTest() {
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
     * Test of offer method, of class PriorityQueueBST.
     */
    @Test
    public void testOffer() {
        System.out.println("offer");
        Object e = null;
        PriorityQueueBST instance = new PriorityQueueBST();
        instance.add(2);
        instance.add(10);
        instance.add(15);
        instance.add(1);
        instance.add(6);
        boolean expResult = false;
        boolean result = instance.offer(2);
        assertEquals(expResult, result);
    }

    /**
     * Test of poll method, of class PriorityQueueBST.
     */
    @Test
    public void testPoll() {
        System.out.println("poll");
        PriorityQueueBST instance = new PriorityQueueBST();
        instance.add(2);
        instance.add(10);
        instance.add(15);
        instance.add(1);
        instance.add(6);
        Object expResult = 2;
        Object result = instance.poll();
        assertEquals(expResult, result);
    }

    /**
     * Test of peek method, of class PriorityQueueBST.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        PriorityQueueBST instance = new PriorityQueueBST();
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
     * Test of size method, of class PriorityQueueBST.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        PriorityQueueBST instance = new PriorityQueueBST();
        instance.add(2);
        instance.add(10);
        instance.add(15);
        instance.add(1);
        instance.add(6);
        int expResult = 5;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of isEmpty method, of class PriorityQueueBST.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        PriorityQueueBST instance = new PriorityQueueBST();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class PriorityQueueBST.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PriorityQueueBST instance = new PriorityQueueBST();
        instance.add(2);
        instance.add(10);
        instance.add(6);
        String expResult = "2<--6<--10";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
