/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffmantrees;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author Akbar Aziz
 */
public class PriorityQueueArrayList< E > extends AbstractQueue < E > {
   
    // Data Fields
    /** The ArrayList to hold the data. */
    private ArrayList<E> theQueue;
    /** An optional reference to a Comparator object. */
    private Comparator < E > comparator = null;
    // Methods
    
    public PriorityQueueArrayList(){
        theQueue= new ArrayList<E>();
    }
    
    /** Creates a heap-based priority queue with the specified initial
       capacity that orders its elements according to the specified
       comparator.
       @param cap The initial capacity for this priority queue
       @param comp The comparator used to order this priority queue
       @throws IllegalArgumentException if cap is less than 1
   */
    public PriorityQueueArrayList(int cap, Comparator < E > comp) {
        if (cap < 1)
          throw new IllegalArgumentException();
        theQueue = new ArrayList< E > (cap + 1);
        comparator = comp;
    }
    /** Insert an item into the priority queue. 
     * @param e The item to be inserted
     * @return true if the item is inserted successfully,false otherwise.
     */
    @Override
    public boolean offer(E e) {
        if(e==null) return false;
        if(theQueue.isEmpty()){
            theQueue.add(e);
            return true;
        }
        
        int size=theQueue.size();
        int m;
        for(int i=0; i<size; ++i){
            if(compare(theQueue.get(i), e)==1){
                //System.out.print(m+" ");
                theQueue.add(i, e);
                return true;
            }
        }
        theQueue.add(e);
        return true;
    }
    /**
     * Retrieves and removes the head of this queue.
     * @return removed element,or null if queue is empty.
     */
    @Override
    public E remove(){
        return super.remove();
    }
    
    /**
     *
     * @param e
     * @return
     */
    public boolean removeElement(E e){
        if(theQueue.contains(e)){
            theQueue.remove(e);
            return true;
        }
        return false;
    }
    
    
    /** Compare two items using either a Comparator object’s compare method
       or their natural ordering using method compareTo.
       pre: If comparator is null, left and right implement Comparable<E>.
       @param left One item
       @param right The other item
       @return Negative int if left less than right,
          0 if left equals right,
          positive int if left > right
       @throws ClassCastException if items are not Comparable
   */
    private int compare(E left, E right) {
      if (comparator != null) { // A Comparator is defined.
        return comparator.compare(left, right);
      }
      else { // Use left’s compareTo method.
        return ( (Comparable < E > ) left).compareTo(right);
      }
    }
    
    @Override
    public E poll() {
        if(theQueue.isEmpty()) return null;
        
        return theQueue.remove(0);
    }

    @Override
    public E peek() {
        if(theQueue.isEmpty()) return null;
        
        return theQueue.get(0);
    }
    @Override
    public Iterator<E> iterator() {
        return theQueue.iterator();
    }

    @Override
    public int size() {
        return theQueue.size();
    }
    
    /**
     *
     * @return
     */
    @Override
    public boolean isEmpty(){
        return theQueue.isEmpty();
    }
    @Override
    public String toString(){
        StringBuilder str= new StringBuilder();
        if(this.isEmpty()) return null;
        
        Iterator iter= this.iterator();
        while(iter.hasNext()){
            str.append(iter.next());
            if(iter.hasNext()) str.append("<--");
        }
        return str.toString();
    }
}