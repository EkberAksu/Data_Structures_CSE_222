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
public class File extends Documents{
    private int Size;
    private String Type;
    
    public File(){
        super();
        Size=0;
        Type="Nothing";
    }
    public File(int size,String type, String name,String discription){
        super(name,discription);
        Size=size;
        Type=type;
    }
    public void setSize(int size){
        Size=size;
    }
    public void setType(String type){
        Type=type;
    }
    public int getSize(){
        return Size;
    }
    public String  getType(){
        return Type;
    }
    
    @Override
    public String toString(){
        String file=NAME+"."+Type;
        file+="  (Size : "+Size+")\n";
        file+=Discription;
        
        return file;
    }
}
