/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw05_aikeboer_aizezi_13144086;
import java.util.*;

/**
 *
 * @author Akbar Aziz
 * @param <E>
 */
public class ListOperations <E> {
    private ArrayList<E> list1;
    private ArrayList<E> list2;
    /**
     * constructor
     * @param array1 sorted list
     * @param array2 sorted lsiy
     */
    public ListOperations(List<E> array1,List<E> array2){
        if(array1==null){
            list1=null;
        }else if(array2==null){
            list2=null;
        }
        else{
            list1.addAll(array1);
            list2.addAll(array2);
        }
    }
    /**
     * finds intersection of the list1 and list2
     * wrapper method
     * @return intersection
     */
    public List intersectionOfLists(){
        if(list1==null || list2==null){
            return null;
        }
        else if(list1.isEmpty() || list2.isEmpty()){
            return null;
        }
        else{
            return intersectionOfLists(list1);
        }
    }
    /**
     * finds intersection of the list1 and list2
     * @param aList a list
     * @return intersection
     */
    private List intersectionOfLists(List<E> aList){
        List<E> intersect= new ArrayList<E>();
        if(aList==null || aList.isEmpty()){
            return null;
        }
        else{
            if(list2.contains(aList.get(0) )){
                intersect.add(aList.get(0));
            }
            intersect.addAll(intersectionOfLists(list1.subList(1, list1.size()-1)));
            return intersect;
        }
    }
    /**
     * finds union of the list 1 and list2 
     * do not add duplications
     * @return union list
     */
    public List unionOfList(){
        List<E> union= new ArrayList<E>();
        if(list1.isEmpty() && list2.isEmpty()){
            return null;
        }
        else{
             unionOfLists(union,list1);
             unionOfLists(union,list2);
             return union;
        }
    }
    /**
     * finds union of the list 1 and list2 
     * do not add duplications
     * @return union list
     */
    private void unionOfLists(List<E> union, List<E> aList){
        if(aList==null || aList.isEmpty()){
            return;
        }
        else{
            if(union.contains(aList.get(0) )){
                unionOfLists(union,aList.subList(1, aList.size()-1));
            }else{
                union.add(aList.get(0));
                unionOfLists(union,aList.subList(1, aList.size()-1));
            }
        }
    }
    /**
     * check if list 2 is subset of list 1
     * @return 
     */
    public boolean isSubset(){
        if(list2==null||list2.isEmpty()){
            return true;
        }else if(list1==null || list1.isEmpty()){
            return false;
        }else{
            return isSubset(list1,list2);
        }
    }
    
    private boolean isSubset(List<E> aList1,List<E> aList2){
        if(list2==null||list2.isEmpty()){
            return true;
        }else if(list1==null || list1.isEmpty()){
            return false;
        }else{
            if(aList1.contains(aList2.get(0))){
                return isSubset(aList1,aList2.subList(1, aList2.size()-1));
            }
            return false; 
        }
    }
    
}
