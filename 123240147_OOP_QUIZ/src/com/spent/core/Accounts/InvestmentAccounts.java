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
public class InvestmentAccounts extends Accounts {
    public InvestmentAccounts(String number, User owner, double initial){
    super(number, initial, owner);
    }
    @Override
    public void transfer(Accounts targetAccounts, double amount) throws Exception{
        if (amount > balance) {
            throws new Exception("Insufficient balance!");
        }
        this.balance -= amount;
        targetAccounts.deposit(amount);
    }
}
