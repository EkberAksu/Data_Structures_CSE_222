/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw04_aikeboer_aizezi_131044086;

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
public class InfixToPostfixTest {
    

    /**
     * Test of convert method, of class InfixToPostfix.
     * @throws java.lang.Exception
     */
    @Test
    public void testConvert() throws Exception {
        System.out.println("convert");
        String[] infix = null;
        InfixToPostfix instance = new InfixToPostfix();
        String[] expResult = null;
        String[] result = instance.convert(infix);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
