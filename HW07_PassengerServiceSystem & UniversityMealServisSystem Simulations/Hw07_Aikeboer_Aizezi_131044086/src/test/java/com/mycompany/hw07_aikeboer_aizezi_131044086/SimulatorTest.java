/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw07_aikeboer_aizezi_131044086;

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
public class SimulatorTest {
    
    public SimulatorTest() {
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
     * Test of simulate method, of class Simulator.
     */
    @org.junit.Test
    public void testSimulate() {
        System.out.println("simulate");
        String inputFileName = "";
        String outputFile = "";
        Simulator instance = new Simulator();
        instance.simulate(inputFileName, outputFile);
        
    }
    
}
