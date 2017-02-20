/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aikeboer_aizezi_131044086_hw01;

import java.util.ArrayList;

/**
 *
 * @author Akbar Aziz
 */
public class Student extends AbsUsers{
    ArrayList<Course> myCourses;
    
    public Student(){
        super();
        myCourses=null;
    }
    public Student(int id,String name,int password){
        super(id,name,password);
        myCourses=null;
    }
    public Student(int id,String name,int password,Course aCourse){
        super(id,name,password);
        myCourses.add(aCourse);
    }
    public boolean enrole(Course aCourse){
        if(myCourses.isEmpty()){
            myCourses.add(aCourse);
            return true;
        }
        else{
            for(int i=0;i<myCourses.size();++i){
                if(myCourses.get(i).equals(aCourse) )
                    return false;
            }
            myCourses.add(aCourse);
            return true;
        }
    }
    public boolean isMycourse(Course aCourse){
        if(myCourses.isEmpty()){
            return false;
        }
        else{
            for(int i=0;i<myCourses.size();++i){
                if(myCourses.get(i).equals(aCourse) )
                    return true;
            }
            return false;
        }
    }
    public ArrayList<Course> getCourses(){
        return myCourses;
    }
    
    @Override
    public boolean equals(AbsUsers aUser){
        /*exeption handling using try-catch method*/
        try{
            Student temp=(Student)aUser;
            return ID==temp.getID();
        }
        catch(ClassCastException E){
            System.out.println("Wrong input for this(equals) method!, input is"
                    + "not a student");
            return false;
        }
    }
    
    @Override
    public String toString(){
        String temp="Name: "+NAME;
        temp+="\nID: "+ID;
        
        return temp;
    }
    
}
