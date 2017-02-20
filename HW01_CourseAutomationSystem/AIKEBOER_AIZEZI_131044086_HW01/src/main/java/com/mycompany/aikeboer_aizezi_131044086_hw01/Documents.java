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
public abstract class Documents {
    protected String NAME;
    protected String Discription;
    
    public Documents(){
        this("NoName","Empty");
    }
    public Documents(String name,String discription){
        NAME=name;
        Discription=discription;
    }
    public void setName(String name){
        NAME=name;
    }
    public void setDiscription(String discription){
        Discription=discription;
    }
    public String getName(){
        return NAME;
    }
    public String getDiscription(){
        return Discription;
    }
    
    @Override
    abstract public String toString();
}
