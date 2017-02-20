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
public class Teacher extends AbsUsers{
    private ArrayList<Course> myCourses;
    
    public Teacher(){
        super();
        myCourses=null;
    }
    public Teacher(int id,String name,int password){
        super(id,name,password);
        myCourses=null;
    }
    public Teacher(int id,String name,int password,Course aCourse){
        super(id,name,password);
        myCourses.add(aCourse);
    }
    public boolean addCourse(Course aCourse){
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
    public boolean addStudent(Student aStudent,Course aCourse){
        return aCourse.addStudent(aStudent);
    }
    public boolean removeStudent(Student aStudent,Course aCourse){
        return aCourse.removeStudent(aStudent);
    }
    public boolean addTutor(Student aStudent,Course aCourse){
        Tutor newTutor;
        if(aStudent instanceof Tutor){
            newTutor=(Tutor)aStudent;
        }
        else{
            newTutor= new Tutor(aStudent,aCourse);
        }
        
        if(aCourse.getStudents().isEmpty()){
            aCourse.addTutor(newTutor);
            return true;
        }
        else{
            for(int i=0;i<aCourse.getStudents().size();++i){
                if(aCourse.getStudents().get(i).equals(aStudent))
                    return false;
            }
            aCourse.addTutor(newTutor);
            return true;
        }
    }
    public boolean removeTutor(Student aStudent,Course aCourse){
        Tutor newTutor;
        if(aStudent instanceof Tutor){
            newTutor=(Tutor)aStudent;
        }
        else{
            newTutor= new Tutor(aStudent,aCourse);
        }
        return aCourse.removeTutor(newTutor);
    }
    public void addAssignment(Assignment assignment,Course aCourse){
        aCourse.addAssignment(assignment);
    }
    
    @Override
    public String toString(){
        String temp="Name: "+NAME+"\nID: "+ID;
        return temp;
    }
    
   
    @Override
    public boolean equals(AbsUsers aTeacher){
        if(aTeacher == this ) return true;
        if(aTeacher ==null ) return false;
        boolean test=false;
        /*exeption handling using try-catch method*/
        try{
            Teacher temp=(Teacher)aTeacher;
            if(ID==temp.getID()){
                test=true;
            }
        }
        catch(ClassCastException E){
            System.out.println("Wrong input for this(equals) method!");
            test=false;
        }   
        return test;
    }
}
