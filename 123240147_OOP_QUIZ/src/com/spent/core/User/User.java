/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spent.core.User;

import com.spent.core.exceptions.Exception;
/**
 *
 * @author Lab Informatika
 */
public class User {
    private String name;
    private String NIK;
    private int age;
public User(String name, String NIK, int age) throws Exception{
if (age < 17){
throw new Exception("User must be atleast 17 years old");
}    
this.name = name;
this.NIK = NIK;
this.age = age;
}
public String getname(){return name;}
public String getNIK(){return NIK;}
public int getAge(){return age;}

}
