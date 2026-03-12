/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spent.core.Accounts;

import com.spent.core.User.User;
import com.spent.core.exceptions.Exception;
/**
 *
 * @author Lab Informatika
 */
public abstract class Accounts {
    protected String number;
    protected double balance;
    protected User owmer;
    
    public Accounts(String number, double initial, User owner){
    this.balance = initial;
    this.number = number;
    this.owmer = owner;
    }
    
    public String getnumber(){return number;}
    public double getbalance(){return balance;}
    public User getOwner(){return owmer;}
    
    public void deposit(double amount){
    if (amount > 0){
    balance += amount;
    }
    }
    public abstract void transfer(Accounts targetAccounts, double amount) throws Exception;
    public double checkbalance(){
    return balance;
    }
}
