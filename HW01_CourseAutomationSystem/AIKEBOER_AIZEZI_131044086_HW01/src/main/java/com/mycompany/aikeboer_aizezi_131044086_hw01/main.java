/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aikeboer_aizezi_131044086_hw01;
import com.mycompany.aikeboer_aizezi_131044086_hw01.CourseSystem.Administrator;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 *main class
 * @author Akbar Aziz
 */
public class main {
    /**
     * main method
     * @param args 
     */
    public static void main(String[] args) {
        
        /*Scenario 1 */
        /**
         * testing this course automation system
         */
        CourseSystem System1=new CourseSystem();
        Administrator admin= System1.new Administrator(1100,"Akbar Aziz",12345);
        Teacher teacher1=new Teacher(1200,"Ali Kaya",01234);
        admin.addCourse(new Course("Bil101","Introduction to coumputer science",teacher1));
        
        Course Bil102=new Course("Bil_102","Object oriented perogramming",teacher1);
        admin.addCourse(Bil102);
        
        Teacher teacher2=new Teacher(1201,"Kaan Ucar",43210);
        admin.addTeachers(teacher2);
        
        Student student1=new Student(13101,"Seyda Nur",25890);
        admin.addStudent(student1);
        
        /*print them out */
        ArrayList<Course> courses=System1.getCourses();
        ListIterator<Course> iter1= courses.listIterator();
        while(iter1.hasNext()){
            System.out.print(iter1.next()+"\n");
        }
        
        ArrayList<Teacher> teachers=System1.getTeachers();
        ListIterator<Teacher> iter2= teachers.listIterator();
        while(iter2.hasNext()){
            System.out.print(iter2.next()+"\n");
        }
        
        ArrayList<Student> students=System1.getStudents();
        ListIterator<Student> iter3= students.listIterator();
        while(iter3.hasNext()){
            System.out.print(iter3.next()+"\n");
        }
        
        
    }
}
