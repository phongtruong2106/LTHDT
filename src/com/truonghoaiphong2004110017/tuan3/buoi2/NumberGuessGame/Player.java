package com.truonghoaiphong2004110017.tuan3.buoi2.NumberGuessGame;

public class Player {
    //attriubte - state
    //implementation
    private int number = 0;

    //interface

    public int getNumber(){
        return number;
    }

    //method - behavior
    public void guess(){
        number = (int) (Math.random() * 10); //đếm từ 1 đến 10
        System.out.println("I'm guessing " + number);
    }
}
