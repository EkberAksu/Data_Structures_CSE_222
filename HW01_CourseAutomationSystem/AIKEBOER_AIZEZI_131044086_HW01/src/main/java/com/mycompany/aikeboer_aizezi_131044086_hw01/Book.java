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
public class Book extends Documents{
   String Author;
   int Size;
   String PublishedDate;
   
   public Book(){
       super();
       Author="NoName";
       Size=0;
       PublishedDate="Empty";
   }
   public Book(String author,int size,String pubDate,String name,String discrp){
       super(name,discrp);
       Author=author;
       Size=size;
       PublishedDate=pubDate;
   }
   public void setAuthor(String author){
       Author=author;
   }
   public void setSize(int size){
       Size=size;
   }
   public void setPubDate(String date){
       PublishedDate=date;
   }
   public String getAuthor(){
       return Author;
   }
   public int getSize(){
       return Size;
   }
   public String getPubDate(){
       return PublishedDate;
   }
   @Override
   public String toString(){
       String book="Name : "+NAME;
       book+="\nAuthor : "+Author;
       book+="\nPublshed date : "+PublishedDate;
       book+="\nDiscription : "+Discription;
       
       return book;
   }
}
