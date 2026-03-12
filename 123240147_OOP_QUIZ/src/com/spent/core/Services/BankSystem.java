/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spent.core.Services;

import com.spent.core.User.User;
import com.spent.core.Accounts.*;
import com.spent.core.exceptions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 *
 * @author Lab Informatika
 */
public class BankSystem {
    private List<User> users;
    private List<Accounts> accounts;
    
    public BankSystem(){
    users = new ArrayList<>();
    accounts = new ArrayList<>();
    }
    public User createuser(String NIK, String name, int age) throws Exception{
    User user = new User(NIK,name, age);
    users.add(user);
    return user;
    }
    public User findbynikUser(String NIK){
    for (User u : users){
    if(u.getNIK().equals(NIK)){
    return u;
    }
    }
    }
}
