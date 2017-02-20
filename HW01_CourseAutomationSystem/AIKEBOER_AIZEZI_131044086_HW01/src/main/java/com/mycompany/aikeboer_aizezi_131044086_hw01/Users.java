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
public interface Users {
    public void setID(int id);
    public void setName(String name);
    public void setPassword(int password);
    public String getName();
    public int getID();
    public void changeName(String name);
    public void changePassword(int password);
}
