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
public class Slides extends Documents{
    int Size;
    int Pages;
    
    public Slides(){
        super();
        Size=0;
        Pages=0;
    }
    public Slides(String name,String discription,int size,int pages){
        super(name,discription);
        Size=size;
        Pages=pages;
    }
    public void setSize(int size){
        Size=size;
    }
    public void setPages(int pages){
        Pages=pages;
    }
    public int getSize(){
        return Size;
    }
    public int getPages(){
        return Pages;
    }
    
    @Override
    public String toString(){
        String slide=NAME+"."+"ppt";
        slide+="    (size : "+Size+")\n";
        slide+=Discription;
        
        return slide;
    }
}
