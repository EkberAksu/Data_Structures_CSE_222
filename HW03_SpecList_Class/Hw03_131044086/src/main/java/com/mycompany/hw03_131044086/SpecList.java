/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw03_131044086;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Akbar Aziz
 * @param <E> generic type
 */
public class SpecList<E> extends LinkedList{
    /**
     * no parameter constructor
     */
    public SpecList(){
        super();
    }
    
    /**
     * takes a collection,which is extended by E, and adds all of them at the 
     * head of the SpecList
     * @param c collection extended by E
     * @return boolean true if added successfully, if the parameter is a null
     * pointer, then returns false
     * used try-catch error handling
     */
    public boolean addAllAtHead(Collection<? extends E>  c) {
        boolean added=true;
        try{
            addAll(0,c);
        }
        catch(NullPointerException e){
            System.err.println("NullPointerException: " + e.getMessage());
            added=false;
        }
        return added;
    }
    
    /**
     * gets a collection,finds the common elements and returns the list of them
     * @param c collection extended by E
     * @return a intersection list
     * Throws NullPointerException if the given parameter is a null pointer
     */
    public List<E> getIntersectList (Collection<? extends E>  c){
        if(c==null) throw new NullPointerException();
        
        List<E> newList = new LinkedList();
        Iterator iterator= c.iterator();
        E temp;
        while(iterator.hasNext()){
            if(indexOf(temp=(E) iterator.next())>-1)  newList.add(temp);
        }
        return newList;
    }
    
    /**
     * sorts the list using cocktail sort algorithm
     * @param sortOrder a string specifying which order to sort the list,
     * ("increasing",if the list needs to be sorted in increasing order;
     * "decreasing", if needs to be sorted in decrementing order
     * @return the sorted list
     * throws InvalidParameterException if parameter string is neither 
     * "increasing" or "decreasing"
     */
    public List<E> sortList(String sortOrder){
        boolean order;
        switch (sortOrder) {
            case "decreasing":
                order=true;
                break;
            case "increasing":
                order=false;
                break;
            default:
                throw new InvalidParameterException();
        }
        E[] array=(E[])this.toArray();
        boolean swapped;
        for (int i = 0; i < this.size()/2; i++) {
            swapped = false;
            for (int j = i; j < this.size() - i - 1; j++) {
                //test whether the two elements are in the wrong order
                if (order==(array[j].hashCode() < array[j+1].hashCode() )) {
                    E temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            for (int j = this.size() - 2 - i; j > i; j--) {
                //test whether the two elements are in the wrong order
                if (order==(array[j].hashCode() > array[j-1].hashCode() )) {
                    E temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    swapped = true;
                }
            }
            //we can exit the outer loop here if no swaps occurred.
            if(!swapped) break;
        }
        List<E> newList = new LinkedList();
        newList.addAll(Arrays.asList(array));
        return newList;
    }
    
    /**
     * overrides toString method
     * @return a string
     */
    @Override
    public String toString(){
        String temp="This list contains:\n      ";
        for(int i=0;i<this.size()-1;++i){
                temp+=this.get(i)+" ,";
            }
        temp+=this.get(this.size()-1)+";";
        return temp;
    }
    
}
