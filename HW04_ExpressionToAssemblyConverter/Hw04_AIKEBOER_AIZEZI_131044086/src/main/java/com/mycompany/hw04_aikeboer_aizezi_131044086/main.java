/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw04_aikeboer_aizezi_131044086;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Akbar Aziz
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        /**
         * opens a file and reads the texts in it to a string array
         */
        String[] infix = new String[100];
        try {
            File inp = new File("input.txt");
            try (BufferedReader br = new BufferedReader(new FileReader(inp))) {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();
                int i=0;
                while (line != null) {
                    infix[i]=line;
                    line = br.readLine();
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            java.lang.System.exit(1);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            java.lang.System.exit(1);
        } 
        
        /**
         * converts the input to postfix first, then to assembly code
         */
        try {
            InfixToPostfix inputs = new InfixToPostfix();
            String[] postfix=inputs.convert(infix);
            PostfixToAssambly outputs= new PostfixToAssambly(postfix);
            outputs.toAssambly();
        } catch (SyntaxErrorException ex) {
            System.out.println("Syntax error is detacted!");
        } catch (OutOfRegisterLimitException ex) {
            System.out.println("Registers are used out!");
        } catch (DivisionByZeroException ex) {
            System.out.println("Division by zero is detacted in the inouts!");
        }
        
    }
    
}
