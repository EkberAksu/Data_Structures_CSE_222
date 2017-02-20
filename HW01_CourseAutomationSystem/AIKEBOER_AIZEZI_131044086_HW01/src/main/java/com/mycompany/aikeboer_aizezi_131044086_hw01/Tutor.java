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
public class Tutor extends Student{
    private Course tutoringCourse;
    
    public Tutor(){
        super();
        tutoringCourse=null;
    }
    public Tutor(Student aStudent,Course aCourse){
        super(aStudent.getID(),aStudent.getName(),aStudent.PASSWORD);
        tutoringCourse=aCourse;
    }
    public Tutor(int id,String name,int password,Course myCourse,Course otherCourse){
        super(id,name,password,myCourse);
        tutoringCourse=otherCourse;
    }
    public void setTutoringCourse(Course otherCourse){
        tutoringCourse=otherCourse;
    }
    public Course getTutoringCourse(){
        return tutoringCourse;
    }
    public ArrayList<Documents> viewCourseMaterials(){
        return tutoringCourse.getMaterials();
    }
    public Assignment viewAssignment(int assignmentNumber){
        return tutoringCourse.getAssignment(assignmentNumber);
    }
    
    @Override
    public String toString(){
        String temp="Name: "+NAME;
        temp+="\nID: "+ID;
        temp+="\nIs a Tutor in "+this.getTutoringCourse();
        
        return temp;
    }
}
