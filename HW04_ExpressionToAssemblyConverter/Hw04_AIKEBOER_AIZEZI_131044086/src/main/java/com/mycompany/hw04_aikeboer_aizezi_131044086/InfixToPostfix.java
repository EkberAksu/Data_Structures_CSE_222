/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw04_aikeboer_aizezi_131044086;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Akbar Aziz
 */
public class InfixToPostfix {
    /** The operator stack */
    private Stack<Character> operatorStack;
    /** The operators */
    private static final String OPERATORS= "=+-*/";
    /** The precedence of the operators matches order in OPERATORS. */
    private static final int[] PRECEDENCE = {1, 2, 2, 3, 3};
    /** The postfix string */
    private String[] postfix;
    
    /**
     * Convert a string from infix to postfix.
     * @param infix The infix expression
     * @return string
     * @throws SyntaxErrorException
     */
    public String[] convert(String infix[]) throws SyntaxErrorException{
       operatorStack=new Stack<>();
       StringBuilder[] temp = new StringBuilder[100];
       for(int i=0;i<infix.length-1;++i){
        temp[i] = new StringBuilder();
        String[] tokens = infix[i].split("\\s+");
        try{
            // Process each token in the infix string.
            for(String nextToken : tokens){
                char firstChar= nextToken.charAt(0);
                if(nextToken.length()>1){
                    if(firstChar=='-'){
                        firstChar=nextToken.charAt(1);
                    }else{
                        throw new SyntaxErrorException("Unexpected Character"
                            + "Encountered: "+firstChar);
                    }
                }
                //Is it an operand?
                if(Character.isJavaIdentifierStart(firstChar)
                        ||  Character.isDigit(firstChar) ){
                    temp[i].append(nextToken);
                    temp[i].append(' ');
                }//Is it an operator?
                else if(isOperator(firstChar)){
                    processOperator(firstChar, i);
                }
                else{
                    throw new SyntaxErrorException("Unexpected Character"
                            + "Encountered: "+firstChar);
                }
            }//end loop
            //Pop any remaining operators and append them to postfix.
            while(!operatorStack.empty()){
                char op= operatorStack.pop();
                temp[i].append(op);
                temp[i].append(' ');
            }
            //assert: Stack is empty,add the result to the postfix array.
            postfix[i]=temp[i].toString();
        }
        catch(EmptyStackException ex){
            throw new SyntaxErrorException("Syntax Error:The stack is empty");
        }
       }
       try (PrintWriter writer = new PrintWriter("postfix.txt", "UTF-8")) {
           for(int i=0;i<postfix.length;++i){
               writer.println(postfix[i]);
           }
           writer.close();
        }   catch (FileNotFoundException | UnsupportedEncodingException ex) {
            Logger.getLogger(InfixToPostfix.class.getName()).log(Level.SEVERE, null, ex);
        }
       return postfix;
    }
    /**
     * processes through the operator in a specific line 
     * @param op operator character
     * @param line line in input
     */
    private void processOperator(char op,int line){
        if(operatorStack.empty()){
            operatorStack.push(op);
        }else{
            //peek the operator stack and let topOp be top operator.
            char topOp= operatorStack.peek();
            if(precedence(op) > precedence(topOp)){
                operatorStack.push(op);
            }else{
                //Pop all stacked operator with equal or higher
                // precedence than op.
                while(!operatorStack.empty() &&
                        precedence(op)<= precedence(topOp)){
                    operatorStack.pop();
                    postfix[line]+=topOp;
                    postfix[line]+=" ";
                    if(!operatorStack.empty()) //Reset topOp
                        topOp= operatorStack.peek();
                }
                //assert: Operator stack is empty or current operator
                //precedence > top of stack operator precedence.
                operatorStack.push(op);
            }
        }
        
    }
    
    /**
     * Determine whether a character is an operator.
     * @param ch The character to be tested
     * @return true if ch is an operator
     */
    private boolean isOperator(char ch){
        return OPERATORS.indexOf(ch)!= -1;
    }
    /**
     * Determine the precedence of an operator.
     * @param op The operator
     * @return the precedence
     */
    private int precedence(char op){
        return PRECEDENCE[OPERATORS.indexOf(op)];
    }
}
