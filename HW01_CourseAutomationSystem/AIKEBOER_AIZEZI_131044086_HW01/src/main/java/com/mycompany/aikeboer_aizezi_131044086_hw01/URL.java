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
public class URL extends Documents{
    String Address;
    
    public URL(){
        super();
        Address="Nothing";
    }
    public URL(String title,String discription,String address){
        super(title,discription);
        Address=address;
    }
    public void setAddress(String address){
        Address=address;
    }
    public String getAddress(){
        return Address;
    }
    
    @Override
    public String toString(){
        String url="Title: "+NAME;
        url+="link address: "+Address;
        url+=Discription;
        
        return url;
    }
}
