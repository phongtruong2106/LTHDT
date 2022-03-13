package com.truonghoaiphong2004110017.tuan3.buoi2.Bai3;

import java.util.Scanner;

public class VehicleTestDrive {
   static Scanner sc = new Scanner(System.in);
    //input
  public static void main(String[] args) {
    VehicleInformation car[] = null;
    int a = 0;
    int choice;
    do{
      System.out.println("__________MENU_________");
      System.out.println("1/ nhập thông tin");
      System.out.println("2/ xuất thông tin ");
      System.out.println("3/ thoát");
      choice = sc.nextInt();
      switch(choice){
        case 1:
        {
          System.out.println("nhập lượng xe muốn nhập: ");
          a = sc.nextInt();
          car = new VehicleInformation[a];
          for(int i = 0; i < a; i++){
             System.out.println("nhập thông tin xe thứ " + (i + 1) + ": ");
             car[i] = new VehicleInformation();
             car[i].input();
          }
          break;
        }
        case 2: {
          System.out.println("thông tin xe");
          for(int i = 0; i < a; i++){
            car[i].print();
          }
          break;
        }
        case 3: 
        System.out.println("exiting.........");
        return;
      }
      System.out.println("quay lại menu?(1:yes/0:no): ");
      choice = sc.nextInt();
    }while(choice == 1);
  }
}
