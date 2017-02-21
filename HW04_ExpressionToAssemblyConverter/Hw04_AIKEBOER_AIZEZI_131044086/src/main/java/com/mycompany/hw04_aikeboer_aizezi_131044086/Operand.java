/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw04_aikeboer_aizezi_131044086;

import java.util.Objects;

/**
 *operand class which includes register id of the operand
 * package visibility
 * @author Akbar Aziz
 */
class Operand {
    private final String operand;
    private int register;
    private boolean isRegistered;
    
    public Operand(String oprnd){
        isRegistered= false;
        operand = oprnd;
    }
    public Operand(String oprnd,int rgistr){
        operand = oprnd;
        setRegister(rgistr);
    }
    
    public String getOprnd(){
        return operand;
    }
    /**
     * sets the register
     * @param RegisterNo register address
     * @return true if registerNo is between 0 and 8,otherwise returns false.
     */
    public boolean setRegister(int RegisterNo){
        if(RegisterNo>8 || RegisterNo<0)
            return false;
        isRegistered= true;
        register = RegisterNo;
        return true;
    }
    /**
     * returns register number if already registered
     * @return register no if registered,otherwise -1.
     */
    public int getRegister(){
        if(isRegistered)
            return register;
        return -1;
    }
    
    public boolean isRegistered(){
        return isRegistered;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.operand);
        return hash;
    }
    
    @Override
    public boolean equals(Object o){
        if (o == null) return false;
        if (o == this) return true;
        if (!(o instanceof Operand))return false;
        Operand other = (Operand)o;
        return operand.equals(other.getOprnd());
    }
}
