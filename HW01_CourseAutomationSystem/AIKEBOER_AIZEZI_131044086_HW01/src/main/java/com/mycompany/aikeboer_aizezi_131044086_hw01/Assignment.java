/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aikeboer_aizezi_131044086_hw01;

/**
 *
 * @author Akbar Aziz
 */
public class Assignment {
    int Number;
    File file;
    String SubmissionDate;
    String LateSubmissionDate;
    
    public Assignment(){
        this(0,null,null,null);
    }
    public Assignment(int hwNumber,File aFile,String subDate,String lateSubDate){
        Number=hwNumber;
        file=aFile;
        SubmissionDate=subDate;
        LateSubmissionDate=lateSubDate;
    }
    public void changeFile(File homework){
        file=homework;
    }
    public void changeSubDate(String date){
        SubmissionDate=date;
    }
    public void changeLateSubDate(String date){
        LateSubmissionDate=date;
    }
    public int getNumber(){
        return Number;
    }
    public File getFile(){
        return file;
    }
    public String getSubDate(){
        return SubmissionDate;
    }
    public String getLateSubDate(){
        return LateSubmissionDate;
    }
    
    @Override
    public String toString(){
        String assignment="HomeWork"+Number;
        assignment+="\nSubmisssion date: "+SubmissionDate;
        assignment+="\nLate submission date: "+LateSubmissionDate;
        
        return assignment;
    }
    
}
