/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aikeboer_aizezi_131044086_hw01;

/**
 *an abstract class 
 * written with an idea of polymorphism
 * @author Akbar Aziz
 */
public abstract class AbsUsers implements Users{
    protected int ID;
    protected String NAME;
    protected int PASSWORD;
    
    /**
     * constructors
     */
    public AbsUsers(){
        this(0,"NoName",0);
    }
    public AbsUsers(int id,String name,int password){
        ID=id;
        NAME=name;
        PASSWORD=password;
    }
    
    /**
     * sets id
     * @param id 
     */
    @Override
    public void setID(int id){
        ID=id;
    }
    
    /**
     * sets name
     * @param name 
     */
    @Override
    public void setName(String name){
        NAME=name;
    }
    
    /**
     * sets password
     * @param password 
     */
    @Override
    public void setPassword(int password){
        PASSWORD=password;
    }
    
    /**
     * returns id
     * @return 
     */
    @Override
    public int getID(){
        return ID;
    }
    
    /**
     * returns name
     * @return 
     */
    @Override
    public String getName(){
        return NAME;
    }
    
    /**
     * changes name
     * @param name 
     */
    @Override
    public void changeName(String name){
        setName(name);
    }
    @Override
    public void changePassword(int password){
        setPassword(password);
    }
    
    /**
     * compares the parameter user with this class
     * abstract class, written with the idea of polymorphism
     * @param aUser
     * @return if equals returns true,else returns false
     */
    abstract public boolean equals(AbsUsers aUser);
}
