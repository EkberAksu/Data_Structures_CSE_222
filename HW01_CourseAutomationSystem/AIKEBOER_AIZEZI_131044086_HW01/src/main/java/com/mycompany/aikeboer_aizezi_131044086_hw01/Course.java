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
public class Course {
    private String ID;
    private String Name;
    private Teacher teacher;
    private ArrayList<Student> students;
    private ArrayList<Tutor> tutors;
    private ArrayList<Documents> Materials;
    private ArrayList<Assignment> assignments;
    
    public Course(){
        ID=null;
        Name="Nothing";
        students=null;
        teacher=null;
    }
    /**
     * Three parameter constructor
     * @param id
     * @param name
     * @param aTeacher 
     */
    public Course(String id,String name,Teacher aTeacher){
        ID=id;
        Name=name;
        teacher=aTeacher;
    }
    public Course(String id,String name,Teacher aTeacher,ArrayList<Documents> 
            documents){
        ID=id;
        Name=name;
        teacher=aTeacher;
        Materials=documents;
    }
    public void setID(String id){
        ID=id;
    }
    public void setName(String name){
        Name=name;
    }
    public void setTeacher(Teacher ateacher){
        teacher=ateacher;
    }
    public String getName(){
        return Name;
    }
    public String getID(){
        return ID;
    }
    public Teacher getTeacher(){
        return teacher;
    }
    public boolean addStudent(Student aStudent){
        if(students.isEmpty()){
            students.add(aStudent);
            return true;
        }
        else{
            for(int i=0;i<students.size();++i){
                if(students.get(i).equals(aStudent))
                    return false;
            }
            students.add(aStudent);
            return true;
        }
    }
    public boolean removeStudent(Student aStudent){
        if(students.isEmpty()){
            return false;
        }
        else{
            for(int i=0;i<students.size();++i){
                if(students.get(i).equals(aStudent)){
                    students.remove(i);
                    return true;
                }   
            }
            return false;
        }
    }
    public ArrayList<Student> getStudents(){
        return students;
    }
    public boolean addTutor(Tutor aTutor){
        if(tutors.isEmpty()){
            tutors.add(aTutor);
            return true;
        }
        else{
            for(int i=0;i<tutors.size();++i){
                if(tutors.get(i).equals(aTutor))
                    return false;
            }
            tutors.add(aTutor);
            return true;
        }
    }
    public boolean removeTutor(Tutor aTutor){
        if(tutors.isEmpty()){
            return false;
        }
        else{
            for(int i=0;i<tutors.size();++i){
                if(tutors.get(i).equals(aTutor)){
                    tutors.remove(i);
                    return true;
                }   
            }
            return false;
        }
    }
    public void addMaterial(Documents document){
        Materials.add(document);
    }
    public ArrayList<Documents> getMaterials(){
        return Materials;
    }
    public void addAssignment(Assignment homework){
        assignments.add(homework);
    }
    public Assignment getAssignment(int assignmentNumber){
        return assignments.get(assignmentNumber);
    }
    
    @Override
    public boolean equals(Object aCourse){
        if(aCourse == this ) return true;
        if(aCourse ==null ) return false;
        boolean test=false;
        
        /*exeption handling using try-catch method*/
        try{
            Course temp=(Course)aCourse;
            if(ID.equals(temp.getID())){
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
