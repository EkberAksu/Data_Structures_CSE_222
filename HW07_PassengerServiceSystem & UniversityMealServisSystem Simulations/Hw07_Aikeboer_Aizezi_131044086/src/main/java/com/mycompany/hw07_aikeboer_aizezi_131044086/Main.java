/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw07_aikeboer_aizezi_131044086;

/**
 *
 * @author Akbar Aziz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Simulator mySimulation = new Simulator();
        String inputFile = "data1.txt";
        String outputFile = "output1.txt";
        
        /* Start simulation with data1.txt */
        mySimulation.simulate(inputFile, outputFile);
        
        inputFile = "data2.txt";
        outputFile = "output2.txt";
        
        /* Start simulation with data2.txt */
        mySimulation.simulate(inputFile, outputFile);
    }
    
}
