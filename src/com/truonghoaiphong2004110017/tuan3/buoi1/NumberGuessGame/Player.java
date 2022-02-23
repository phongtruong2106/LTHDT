package com.truonghoaiphong2004110017.tuan3.buoi1.NumberGuessGame;

public class Player {
       //number
       int number = 0;
       public void guess(){
           number = (int) (Math.random() * 10);
           System.out.println("tôi đoán " + number);
       }
       //guess
}
