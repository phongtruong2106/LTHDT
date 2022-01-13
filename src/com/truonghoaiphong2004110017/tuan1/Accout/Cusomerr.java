package com.truonghoaiphong2004110017.tuan1.Accout;

import java.util.Scanner;

public class Cusomerr {
      //data
      private String Name;
      private String Address;
  
      //fucntion
      public Cusomerr(){
  
      }
  
      public Cusomerr(String Name, String Address){
          this.Name = Name;
          this.Address = Address;
      }
      
      public String getName(){
          return Name;
      }
  
      public void setName(String Name){
           this.Name = Name;
      }
  
      public String getAddress(){
          return Address;
      }
  
      public void setAddress(String Address){
          this.Address = Address;
      }
  
      public void input(){
          Scanner sc = new Scanner(System.in);
          System.out.println("tên khách hàng: ");
          setName(sc.nextLine());
          System.out.println("địa chỉ: ");
          setAddress(sc.nextLine());
      }
  
      public void output(){
          System.out.println("=>" + getName() + " - " + getAddress());
      }
}
