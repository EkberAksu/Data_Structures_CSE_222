/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw05_aikeboer_aizezi_13144086;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Akbar Aziz
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
       /*//test for Hanoi
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the No. of Disks : ");
       Hanoi toh=new Hanoi(sc.nextInt());
       toh.towerOfHanoi();*/
       
       
       //test for LinkedListRec
       LinkedListRec<Integer> list=new LinkedListRec();
       list.add(5);
       list.add(5);
       list.add(8);
       list.add(5);
       list.add(2);
       list.add(9);
       list.add(10);
       list.add(5);
       System.out.println(list.toString());
       list.remove(5);
       System.out.println(list.toString());
       
       /*//test for ListOperation 
       ArrayList<Integer> list1=new ArrayList();
       list.add(5);
       list.add(5);
       list.add(8);
       list.add(5);
       list.add(2);
       list.add(9);
       list.add(10);
       list.add(5);
      */
       
    }
    
}
