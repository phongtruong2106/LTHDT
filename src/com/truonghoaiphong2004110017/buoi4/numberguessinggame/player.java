package com.truonghoaiphong2004110017.buoi4.numberguessinggame;

public class player {
    //number
    int number = 0;
    public void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("tôi đoán " + number);
    }
    //guess
}
