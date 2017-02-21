/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw04_aikeboer_aizezi_131044086;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Akbar Aziz
 */
public class PostfixToAssambly {
   Stack<Integer> registers;
   ArrayList<Object> postfix[];
   
   public PostfixToAssambly(String[] postfixStr){
       for(int i=0;i<postfix.length;++i){
            String[] tokens = postfixStr[i].split("\\s+");
            // Process each token in the infix string.
            for(String nextToken : tokens){
                if(nextToken.length()>1){
                    Operand oprnd= new Operand(nextToken);
                    postfix[i].add(oprnd);
                }
                char firstChar= nextToken.charAt(0);
                //Is it an operand?
                if("+-/*=".indexOf(firstChar) != -1) {
                   Operator op=new Operator(firstChar);
                   postfix[i].add(op);
                }//it is an operator
                else{
                    Operand oprnd= new Operand(nextToken);
                    if(exists(oprnd)!=null){
                        postfix[i].add(exists(oprnd));
                        continue;
                    }
                    postfix[i].add(oprnd);
                }
            }
        }
        for(int i=8;i>=0; ++i){
            registers.add(i);
        }
    }
   /**
    * converts postfix string arrays to assembly codes,
    * and write them to a output file
    * @throws SyntaxErrorException
    * @throws OutOfRegisterLimitException
    * @throws DivisionByZeroException 
    */
   public void toAssambly()throws SyntaxErrorException,
                                  OutOfRegisterLimitException,
                                  DivisionByZeroException {
       try {
           try (PrintWriter writer = new PrintWriter("output.asm", "UTF-8")) {
               Operator op;
               Operand lhs, rhs;
               for(int i=0;i< postfix.length; ++i){
                   for(int j=0;j<postfix[i].size();++j){
                       if(postfix[i].get(j) instanceof Operator){
                           op = (Operator)postfix[i].remove(j);
                           rhs= (Operand)postfix[i].remove(j-1);
                           lhs= (Operand)postfix[i].remove(j-2);
                           int rgistr;
                           switch (op.getOprtr()) {
                               case '=':
                                   if(Character.isDigit(lhs.getOprnd().charAt(i) )){
                                       throw new SyntaxErrorException("Unexpected Character"
                                               + "Encountered: "+lhs.getOprnd().charAt(i));
                                   }    if(!registers.empty()){
                                       rgistr=registers.pop();
                                   }else{
                                       throw new OutOfRegisterLimitException("No available register.");
                                   }    if(rhs.isRegistered()){
                                       writer.println("move     $t"+rgistr+",$t"+rhs.getRegister());
                                       registers.add(rhs.getRegister());
                                       lhs.setRegister(rgistr);
                                   }else{
                                       writer.println("li        $t"+rgistr+","+rhs.getOprnd());
                                       lhs.setRegister(rgistr);
                                   }    j-=2;
                                   break;
                               case '+':
                               {
                                   int m=0,k=0;
                                   if(!lhs.isRegistered()){
                                       if(!registers.empty()){
                                           rgistr=registers.pop();
                                       }else{
                                           throw new OutOfRegisterLimitException("No available register.");
                                       }
                                       lhs.setRegister(rgistr);
                                       m=1;
                                   }        if(!rhs.isRegistered()){
                                       if(!registers.empty()){
                                           rgistr=registers.pop();
                                       }else{
                                           throw new OutOfRegisterLimitException("No available register.");
                                       }
                                       rhs.setRegister(rgistr);
                                       k=1;
                                   }        if(Character.isDigit(lhs.getOprnd().charAt(i) )){
                                       writer.println("li        $t"+lhs.getRegister()+","+lhs.getOprnd().charAt(i));
                                   }        if(Character.isDigit(rhs.getOprnd().charAt(i) )){
                                       writer.println("li        $t"+rhs.getRegister()+","+rhs.getOprnd().charAt(i));
                                   }        if(!registers.empty()){
                                       rgistr=registers.pop();
                                   }else{
                                       throw new OutOfRegisterLimitException("No available register.");
                                   }        writer.println("add      $t"+rgistr+",$t"+lhs.getRegister()+",$t"+rhs.getRegister());
                                   if(m==1) registers.add(lhs.getRegister());
                                   if(k==1) registers.add(rhs.getRegister());
                                   Operand temp=new Operand("",rgistr);
                                   postfix[i].add(j-2, temp);
                                   j-=2;
                                   break;
                               }
                               case '-':
                               {
                                   int m=0,k=0;
                                   if(!lhs.isRegistered()){
                                       if(!registers.empty()){
                                           rgistr=registers.pop();
                                       }else{
                                           throw new OutOfRegisterLimitException("No available register.");
                                       }
                                       lhs.setRegister(rgistr);
                                       m=1;
                                   }        if(!rhs.isRegistered()){
                                       if(!registers.empty()){
                                           rgistr=registers.pop();
                                       }else{
                                           throw new OutOfRegisterLimitException("No available register.");
                                       }
                                       rhs.setRegister(rgistr);
                                       k=1;
                                   }        if(Character.isDigit(lhs.getOprnd().charAt(i) )){
                                       writer.println("li        $t"+lhs.getRegister()+","+lhs.getOprnd().charAt(i));
                                   }        if(Character.isDigit(rhs.getOprnd().charAt(i) )){
                                       writer.println("li        $t"+rhs.getRegister()+","+rhs.getOprnd().charAt(i));
                                   }        if(!registers.empty()){
                                       rgistr=registers.pop();
                                   }else{
                                       throw new OutOfRegisterLimitException("No available register.");
                                   }        writer.println("sub      $t"+rgistr+",$t"+lhs.getRegister()+",$t"+rhs.getRegister());
                                   if(m==1) registers.add(lhs.getRegister());
                                   if(k==1) registers.add(rhs.getRegister());
                                   Operand temp=new Operand("",rgistr);
                                   postfix[i].add(j-2, temp);
                                   j-=2;
                                   break;
                               }
                               case '*':
                               {
                                   int m=0,k=0;
                                   if(!lhs.isRegistered()){
                                       if(!registers.empty()){
                                           rgistr=registers.pop();
                                       }else{
                                           throw new OutOfRegisterLimitException("No available register.");
                                       }
                                       lhs.setRegister(rgistr);
                                       m=1;
                                   }        if(!rhs.isRegistered()){
                                       if(!registers.empty()){
                                           rgistr=registers.pop();
                                       }else{
                                           throw new OutOfRegisterLimitException("No available register.");
                                       }
                                       rhs.setRegister(rgistr);
                                       k=1;
                                   }        if(Character.isDigit(lhs.getOprnd().charAt(i) )){
                                       writer.println("li        $t"+lhs.getRegister()+","+lhs.getOprnd().charAt(i));
                                   }        if(Character.isDigit(rhs.getOprnd().charAt(i) )){
                                       writer.println("li        $t"+rhs.getRegister()+","+rhs.getOprnd().charAt(i));
                                   }        if(!registers.empty()){
                                       rgistr=registers.pop();
                                   }else{
                                       throw new OutOfRegisterLimitException("No available register.");
                                   }        writer.println("mult     $t"+lhs.getRegister()+",$t"+rhs.getRegister());
                                   writer.println("mflo     $t"+rgistr);
                                   if(m==1) registers.add(lhs.getRegister());
                                   if(k==1) registers.add(rhs.getRegister());
                                   Operand temp=new Operand("",rgistr);
                                   postfix[i].add(j-2, temp);
                                   j-=2;
                                   break;
                               }
                               case '/':
                               {
                                   int m=0,k=0;
                                   if(!lhs.isRegistered()){
                                       if(!registers.empty()){
                                           rgistr=registers.pop();
                                       }else{
                                           throw new OutOfRegisterLimitException("No available register.");
                                       }
                                       lhs.setRegister(rgistr);
                                       m=1;
                                   }        if(!rhs.isRegistered()){
                                       if(!registers.empty()){
                                           rgistr=registers.pop();
                                       }else{
                                           throw new OutOfRegisterLimitException("No available register.");
                                       }
                                       rhs.setRegister(rgistr);
                                       k=1;
                                   }        if(Character.isDigit(lhs.getOprnd().charAt(i) )){
                                       writer.println("li        $t"+lhs.getRegister()+","+lhs.getOprnd().charAt(i));
                                   }        if(Character.isDigit(rhs.getOprnd().charAt(i) )){
                                       if(rhs.getOprnd().charAt(i)=='0'){
                                           throw new DivisionByZeroException("denominator == 0!");
                                       }
                                       writer.println("li        $t"+rhs.getRegister()+","+rhs.getOprnd().charAt(i));
                                   }        if(!registers.empty()){
                                       rgistr=registers.pop();
                                   }else{
                                       throw new OutOfRegisterLimitException("No available register.");
                                   }        writer.println("div      $t"+lhs.getRegister()+",$t"+rhs.getRegister());
                                   writer.println("mflo     $t"+rgistr);
                                   if(m==1) registers.add(lhs.getRegister());
                                   if(k==1) registers.add(rhs.getRegister());
                                   Operand temp=new Operand("",rgistr);
                                   postfix[i].add(j-2, temp);
                                   i-=2;
                                   break;
                               }
                               default:
                                   break;
                           }
                       }
                   }
                } 
               writer.close();}
        }catch (FileNotFoundException ex) {
           Logger.getLogger(PostfixToAssambly.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(PostfixToAssambly.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
   /**
    * checks if a specific operand exists in postfix array
    * @param oprnd a operand
    * @return returns the operand if found, otherwise returns null pointer
    */
   private Operand exists(Operand oprnd){
       for(int i=0;i< postfix.length; ++i){
             for(int j=0;j<postfix[i].size();++j){
                 if(postfix[i].get(j) instanceof Operand){
                     Operand temp=(Operand)postfix[i].get(j);
                     if(temp.equals(oprnd)) return temp;
                 } 
             }
       }
       return null;
   }
}
