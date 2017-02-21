/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw04_aikeboer_aizezi_131044086;

/**
 *
 * @author Akbar Aziz
 */
public class DivisionByZeroException extends ArithmeticException {
    /** Construct a DivisionByZeroException with the specified
         * message.
         * @param message The message
         */
        DivisionByZeroException(String message){
            super(message);
        }
}
