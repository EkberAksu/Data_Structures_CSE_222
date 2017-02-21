/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffmantrees;

import java.util.Iterator;
import java.util.Random;
/**
 *
 * @author Akbar Aziz
 */
public class main {
    public static void main(String[] args){
        PriorityQueueArrayList<Long> myArrayList =new PriorityQueueArrayList<>();
        long randomlong ;
        Random randomGenerator = new Random();
        Long[] time=new Long[7];
        long tStart = System.currentTimeMillis();
        for(int i=0;i<1000000;++i){
            randomlong= randomGenerator.nextLong();
            myArrayList.offer(randomlong);
            if(i==0) time[0]=System.currentTimeMillis();
            if(i==10) time[1]=System.currentTimeMillis();
            if(i==100) time[2]=System.currentTimeMillis();
            if(i==1000) time[3]=System.currentTimeMillis();
            if(i==10000) time[4]=System.currentTimeMillis();
            if(i==100000) time[5]=System.currentTimeMillis();
        }
        
        time[6]=System.currentTimeMillis(); 
        
        System.out.println("ProrityQueueArrayList : time spent to offer");
        System.out.println("1 item:"+(time[0]-tStart)+"ms");
        System.out.println("10 item:"+(time[1]-tStart)+"ms");
        System.out.println("100 item:"+(time[2]-tStart)+"ms");
        System.out.println("1000 item:"+(time[3]-tStart)+"ms");
        System.out.println("10000 item:"+(time[4]-tStart)+"ms");
        System.out.println("100000 item:"+(time[5]-tStart)+"ms");
        System.out.println("1000000 item:"+(time[6]-tStart)+"ms");
    
        tStart = System.currentTimeMillis();
        for(int i=0;i<1000000;++i){
            myArrayList.poll();
            if(i==0) time[0]=System.currentTimeMillis();
            if(i==10) time[1]=System.currentTimeMillis();
            if(i==100) time[2]=System.currentTimeMillis();
            if(i==1000) time[3]=System.currentTimeMillis();
            if(i==10000) time[4]=System.currentTimeMillis();
            if(i==100000) time[5]=System.currentTimeMillis();
        }

        time[6]=System.currentTimeMillis();
        
        System.out.println("ProrityQueueArrayList : time spent to poll");
        System.out.println("1 item:"+(time[0]-tStart)+"ms");
        System.out.println("10 item:"+(time[1]-tStart)+"ms");
        System.out.println("100 item:"+(time[2]-tStart)+"ms");
        System.out.println("1000 item:"+(time[3]-tStart)+"ms");
        System.out.println("10000 item:"+(time[4]-tStart)+"ms");
        System.out.println("100000 item:"+(time[5]-tStart)+"ms");
        System.out.println("1000000 item:"+(time[6]-tStart)+"ms");
        
        
        /*PriorityQueueLinkedList<Integer> myLinkedList =new PriorityQueueLinkedList<>();
        
        
        System.out.println("Prority Queue LinkedList:");
      
        
        PriorityQueueVector<Integer> myVector =new PriorityQueueVector<>();
        
        System.out.println("Prority Queue Vector:");*/
        
        
        /*PriorityQueueBST<Long> myBST= new PriorityQueueBST<>();
        
        
        /*System.out.println("Prority Queue BST:");*/
        
    }
}
