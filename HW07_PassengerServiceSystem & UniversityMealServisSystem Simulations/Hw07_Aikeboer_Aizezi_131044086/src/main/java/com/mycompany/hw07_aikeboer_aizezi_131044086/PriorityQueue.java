/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw07_aikeboer_aizezi_131044086;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Queue;

/**
 * priority queue class
 * @author Akbar Aziz
 * @param <E> general type data
 */
public class PriorityQueue<E> extends AbstractQueue<E> implements Queue<E>
{
    //Data Fields
    /* Data holder */
    private ArrayList<E> theQueue;
    /* Comparator */
    Comparator<E> comparator = null;

    //Constructors
    /**
     * Default constructor
     */
    public PriorityQueue(){
        theQueue = new ArrayList<>();
    }
    
    /**
     * Constructor with initialized comparator
     * @param comparator 
     */
    public PriorityQueue(Comparator<E> comparator){
        theQueue = new ArrayList<>();
        this.comparator = comparator;
    }
    
    /**
     * Compare method
     * @param ob1 First object to compare
     * @param ob2 Second object to compare
     * @return The result of the compareTo or comparator method
     */
    private int compare(E ob1, E ob2){
        if(comparator != null)
            return comparator.compare(ob1, ob2);
        
        return ((Comparable <E>)ob1).compareTo(ob2);
    }
    
    /**
     * Checker for emptiness of the queue
     * @return True if the queue is empty
     */
    @Override
    public boolean isEmpty(){
        return theQueue.isEmpty();
    }
    
    /**
     * Checker for the size of the queue
     * @return The size of the queue
     */
    @Override
    public int size() {
        return theQueue.size();
    }

    /**
     * Method for adding new element
     * @param element Element to add
     * @return True if successful, false otherwise
     */
    @Override
    public boolean offer(E element){
        if(element == null || theQueue == null)
            return false;
        
        if(theQueue.isEmpty())
            theQueue.add(element);
        else
        {
            for(int i=0; i<theQueue.size(); ++i)
                if(compare(theQueue.get(i), element) > 0)
                {
                    theQueue.add(i, element);
                    return true;
                }
            
            theQueue.add(element);
        }
        
        return true;
    }

    /**
     * Method for getting and removing the first element of the queue
     * @return The first element of the queue
     */
    @Override
    public E poll(){
        if(theQueue.isEmpty())
            return null;
        
        return theQueue.remove(0);
    }

    /**
     * Method for checking the first element of the queue
     * @return The first element of the queue
     */
    @Override
    public E peek(){
        if(theQueue.isEmpty())
            return null;
        
        return theQueue.get(0);
    }

    /**
     * Iterator
     * @return Iterator for the queue
     */
    @Override
    public Iterator<E> iterator() {
        return theQueue.iterator();
    }
    
}
