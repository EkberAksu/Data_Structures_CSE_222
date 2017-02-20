/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aikeboer_aizezi_131044086_hw01;

import java.util.ArrayList;

/**
 *courseSystem class
 * @author Akbar Aziz
 */
public class CourseSystem {
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    
    /**
     * class Administrator
     * an inner class ,which extends absUsers abstract class
     */
    public class Administrator extends AbsUsers{
        
        /**
         * no parameter constructor
         */
        public Administrator(){
            super();
        }
        
        /**
         * three parameter constructor
         * @param id
         * @param name
         * @param password 
         */
        public Administrator(int id,String name,int password){
            super(id,name,password);
        }
        
        /**
         * adds teacher to the system
         * @param aTeacher
         * @return 
         */
        public boolean addTeachers(Teacher aTeacher){
            if(teachers.isEmpty()){
                teachers.add(aTeacher);
                return true;
            }
            else{
                for(int i=0;i<teachers.size();++i){
                    if(teachers.get(i).equals(aTeacher))
                        return false;
                }
                teachers.add(aTeacher);
                return true;
            }
        }
        
        /**
         * removes a teacher from the system
         * @param aTeacher
         * @return 
         */
        public boolean removeTeachers(Teacher aTeacher){
            if(teachers.isEmpty()){
                return false;
            }
            else{
                for(int i=0;i<teachers.size();++i){
                    if(teachers.get(i).equals(aTeacher)){
                        teachers.remove(aTeacher);
                        return true;
                    }
                }
                return false;
            }
        }
        
        /**
         * adds a student to the system
         * @param aStudent
         * @return 
         */
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
        
        /**
         * removes a student from the system
         * @param aStudent
         * @return 
         */
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
        
        /**
         * adds a course to the system
         * @param aCourse
         * @return 
         */
        public boolean addCourse(Course aCourse){
            if(courses.isEmpty()){
                courses.add(aCourse);
                return true;
            }
            else{
                for(int i=0;i<courses.size();++i){
                    if(courses.get(i).equals(aCourse) )
                        return false;
                }
                courses.add(aCourse);
                return true;
            }
        }
        
        /**
         * removes a course from the system
         * @param aCourse
         * @return 
         */
        public boolean removeCourse(Course aCourse){
            if(courses.isEmpty()){
                return false;
            }
            else{
                for(int i=0;i<courses.size();++i){
                    if(courses.get(i).equals(aCourse) ){
                        courses.remove(aCourse);
                        return true;
                    }
                }
                return false;
            }
        }

        /**
         *Override toString method
         * includes try-catch exception handling
         * @return a string including name and id
         */
        @Override
        public String toString(){
            String temp="Aministrator: "+"Name: "+NAME+"\nID: "+ID;
            return temp;
        }
        
        /**
         * implemented equals abstract method
         * written with the idea of polymorphism
         * includes try-catch exception handling
         * @param aUser
         * @return 
         */
        @Override
        public boolean equals(AbsUsers aUser){
            if(aUser == this ) return true;
            if(aUser ==null ) return false;
            boolean test=false;
            /*exeption handling using try-catch method*/
            try{
                Administrator temp=(Administrator)aUser;
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
    /**
     * constructors
     */
    public CourseSystem(){
        teachers=null;
        students=null;
        courses=null;
    }
    public CourseSystem(ArrayList<Course> clases){
        teachers=null;
        students=null;
        courses=clases;
        
    }
    public CourseSystem(ArrayList<Course> clases,ArrayList<Teacher> Teachers){
        teachers=Teachers;
        students=null;
        courses=clases;
        
    }
    public CourseSystem(ArrayList<Course> clases,ArrayList<Teacher> Teachers,
            ArrayList<Student> Students){
        teachers=Teachers;
        students=Students;
        courses=clases;
        
    }
     /**
      * returns courses list
      * @return 
      */
    public ArrayList<Course> getCourses(){
        return courses;
    }
    
    /**
     * returns teachers list
     * @return 
     */
    public ArrayList<Teacher> getTeachers(){
        return teachers;
    }
    
    /**
     * returns students list
     * @return 
     */
    public ArrayList<Student> getStudents(){
        return students;
    }
    
    /**
     * override toString method
     * @return 
     */
    @Override
    public String toString(){
        String temp="This is a course automation system, the system has ";
        temp+=courses.size()+
                " courses,"+teachers.size()+" teachers and "+students.size()+
                " students enrolled.";
        return temp;
    }
}
