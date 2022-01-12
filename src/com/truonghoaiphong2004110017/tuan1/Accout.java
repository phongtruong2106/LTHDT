package com.truonghoaiphong2004110017.tuan1;

public class Accout {
     //data
     int acc_number;
     int acc_balance;
 
     //operation
     //functions
 
     void deposit(int amount){
         
         acc_balance += amount;
 
     }
 
     void withdraw(int amount){
         acc_balance -= amount;
     }
 
     void show(){
           //show
           System.out.println("thông tin tài khoản: ");
           System.out.println("acc number: " + acc_number);
           System.out.println("acc balance: " + acc_balance);
     }
}
