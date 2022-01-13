package com.truonghoaiphong2004110017.tuan1.Accout;

import java.util.Scanner;

public class Emloye {
     //data
     private String Name;
     private int salary;
 
     //function
 
     public Emloye(){
 
     }
 
     public Emloye(String Name, int salary){
         this.Name = Name;
         this.salary = salary;
     }
 
     public String getName(){
           return Name;
     }
 
     public void setName(String Name){
         this.Name = Name;
     }
 
     public int getSalary(){
         return salary;
     }
 
      public void setSalary(int salary){
       this.salary = salary;
     }
 
     public void input(){
         Scanner sc = new Scanner(System.in);
         System.out.println("tên nhân viên: ");
         setName(sc.nextLine());
         System.out.println("lương : ");
         setSalary(sc.nextInt());
     }
 
     public void output(){
         System.out.println("=>" + getName() + " - " + getSalary());
     }
 
 
}
