/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw03_131044086;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Akbar Aziz
 */
public class TestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Scenario One: testong with integers
        //-------------------------------------------------
        SpecList intList1= new SpecList();
        intList1.add(4);
        intList1.add(8);
        intList1.add(2);
        SpecList intList2=new SpecList();
        intList2.add(0);
        intList2.add(5);
        intList2.add(3);
        
        //add intlist2 at the head of intList1
        try{
            if(intList1.addAllAtHead(intList2) ){
                System.out.print(intList1);
            }
        }catch(NullPointerException e){
            System.out.println("Exception thrown: NullPointerException!"
                    +Arrays.toString(e.getStackTrace()));
        }
        
        //sort new intlist1 in increasing order
        try{
            List intList3= intList1.sortList("increasing");
            System.out.print("\nAfter sorting The list in increasing order:\n      ");
            for(int i=0;i<intList3.size();++i){
             System.out.print(intList3.get(i)+" ,");
            }
        }catch(InvalidParameterException e){
            System.out.println("Exception thrown: InvalidParameterException!"
                    +Arrays.toString(e.getStackTrace()));
        }
        List intList3= intList1.sortList("decreasing");
            System.out.print("\nAfter sorting The list in decreasing order:\n      ");
            for(int i=0;i<intList3.size();++i){
             System.out.print(intList3.get(i)+" ,");
            }
        
        SpecList intList4=new SpecList();
        intList4.add(2);
        intList4.add(1);
        intList4.add(5);
        intList4.add(10);
        intList4.add(8);
        System.out.print("\n");
        System.out.print(intList4);
        
        //get the intersection of intlist1 and intlist4
        try{
            List intList5=intList1.getIntersectList(intList4);
            System.out.print("\nThe intersection of two lists are:\n      ");
            for(int i=0;i<intList5.size();++i){
                System.out.print(intList5.get(i)+" ,");
            }
            System.out.print("\n\n---------------------------------\n\n");
        }catch(NullPointerException e){
            System.out.println("Exception thrown: NullPointerException!"
                    +Arrays.toString(e.getStackTrace()));
        }
        
        
        //Scenario two: testong with characters
        //-------------------------------------------------
        SpecList charList1= new SpecList();
        charList1.add('c');
        charList1.add('a');
        charList1.add('e');
        SpecList charList2=new SpecList();
        charList2.add('m');
        charList2.add('d');
        charList2.add('s');
        
        //add charlist2 at the head of charList1
        try{
            if(charList1.addAllAtHead(charList2))
                System.out.print(charList1);
        }
        catch(NullPointerException e){
            System.out.println("Exception thrown: NullPointerException!"
                    +Arrays.toString(e.getStackTrace()));
        }
        
        //sort charlist1 in increasing order
        try{
            List charList3= charList1.sortList("increasing");
            System.out.print("\nAfter sorting,The list contains:\n      ");
            for(int i=0;i<charList3.size();++i){
                System.out.print(charList3.get(i)+" ,");
            }
        }catch(InvalidParameterException e){
            System.out.println("Exception thrown: InvalidParameterException!"
                    +Arrays.toString(e.getStackTrace()));
        }
        
        SpecList charList4=new SpecList();
        charList4.add('a');
        charList4.add('b');
        charList4.add('d');
        charList4.add('m');
        charList4.add('o');
        System.out.print("\n");
        System.out.print(charList4);
        
        //get the intersection of charlist1 and charlist4
        try{
            List charList5=charList1.getIntersectList(charList4);
            System.out.print("\nThe intersection of two lists are:\n      ");
            for(int i=0;i<charList5.size();++i){
                System.out.print(charList5.get(i)+" ,");
            }
            System.out.print("\n\n---------------------------------\n\n");
        }
        catch(NullPointerException e){
            System.out.println("Exception thrown: NullPointerException!"
                    +Arrays.toString(e.getStackTrace()));
        }
        
        //Scenario three: testong with double
        //-------------------------------------------------
        SpecList doubleList1= new SpecList();
        doubleList1.add(0.05);
        doubleList1.add(2.50);
        doubleList1.add(7.45);
        SpecList doubleList2=new SpecList();
        doubleList2.add(12.50);
        doubleList2.add(1.25);
        doubleList2.add(5.99);
        
        try{
            if(doubleList1.addAllAtHead(doubleList2) ){
                System.out.print(doubleList1);
            }
        }catch(NullPointerException e){
            System.out.println("Exception thrown: NullPointerException!"
                    +Arrays.toString(e.getStackTrace()));
        }
        
        SpecList doubleList4=new SpecList();
        doubleList4.add(7.45);
        doubleList4.add(3.34);
        doubleList4.add(12.50);
        doubleList4.add(10.00);
        doubleList4.add(20.12);
        System.out.print("\n");
        System.out.print(doubleList4);
        
        try{
            List doubleList5=doubleList1.getIntersectList(doubleList4);
            System.out.print("\nThe intersection of two lists are:\n      ");
            for(int i=0;i<doubleList5.size();++i){
                System.out.print(doubleList5.get(i)+" ,");
            }
            System.out.print("\n\n---------------------------------------");
        }catch(NullPointerException e){
            System.out.println("Exception thrown: NullPointerException!"
                    +Arrays.toString(e.getStackTrace()));
        }
    }
    
}
