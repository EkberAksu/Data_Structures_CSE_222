/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw05_aikeboer_aizezi_13144086;

import static java.lang.Math.pow;
import java.util.Stack;

/**
 *
 * @author Akbar Aziz
 */
public class Hanoi {
    private Stack<Integer> A = new Stack<Integer>();
    private Stack<Integer> B = new Stack<Integer>();
    private Stack<Integer> C = new Stack<Integer>();
    private int disks ;
    
    public Hanoi(int numOfDisks){
        disks=numOfDisks;
        for(int i=disks;i>0;--i){
            A.push(new Integer(i));
        }
    }
    // Function to implement legal movement between
    // two poles
    private void moveDisksBetweenTwoPoles(Stack<Integer> src,Stack<Integer> dest,
                                        char s, char d){
        int pole1TopDisk ;
        int pole2TopDisk ;

        // When pole 1 is empty
        if (src.empty())
        {   
            pole2TopDisk=dest.pop();
            src.push(pole2TopDisk) ;
            moveDisk(d, s, pole2TopDisk);
        }

        // When pole2 pole is empty
        else if (dest.empty())
        {
            pole1TopDisk=src.pop();
            dest.push(pole1TopDisk);
            moveDisk(s, d, pole1TopDisk);
        }
        else{
            pole1TopDisk=src.pop();
            pole2TopDisk=dest.pop();
            // When top disk of pole1 > top disk of pole2
            if (pole1TopDisk > pole2TopDisk)
            {
                src.push( pole1TopDisk);
                src.push( pole2TopDisk);
                moveDisk(d, s, pole2TopDisk);
            }
            // When top disk of pole1 < top disk of pole2
            else
            {
                dest.push(pole2TopDisk);
                dest.push(pole1TopDisk);
                moveDisk(s, d, pole1TopDisk);
            }
        }
    }

    //Function to show the movement of disks
    private void moveDisk(char fromPeg, char toPeg, int disk)
    {
        System.out.printf("Move the disk %d from \'%c\' to \'%c\'\n",
               disk, fromPeg, toPeg);
    }
 
    /**
     * Function to implement TOH puzzle
     * @param numOfDisks number of disks
     * @param src  sorce tower
     * @param aux  spare tower
     * @param dest destination tower
     */
    private void towerOfHanoi(int numOfDisks, Stack<Integer> src, Stack<Integer> aux,
                   Stack<Integer> dest){
        int i, totaMoves;
        char s = 'A', d = 'B', a = 'C';

        //If number of disks is even, then interchange
        //destination pole and auxiliary pole
        if (numOfDisks % 2 == 0)
        {
            char temp = d;
            d = a;
            a  = temp;
        }
        totaMoves = (int) (pow(2, numOfDisks) - 1);
        for (i = 1; i <= totaMoves; i++)
        {
            switch (i % 3) {
                case 1:
                    moveDisksBetweenTwoPoles(src, dest, s, d);
                    break;
                case 2:
                    moveDisksBetweenTwoPoles(src, aux, s, a);
                    break;
                case 0:
                    moveDisksBetweenTwoPoles(aux, dest, a, d);
                    break;
                default:
                    break;
            }
        }
    }
    public void towerOfHanoi(){
        towerOfHanoi(disks,A,B,C);
    }
}

