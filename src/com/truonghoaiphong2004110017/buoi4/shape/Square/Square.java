package com.truonghoaiphong2004110017.buoi4.shape.Square;

public class Square {
    String fileSound;

    public Square(String fileSound){
        this.fileSound = fileSound;
    }

    void roate(){
        System.out.println("Roating 360");
    }

     void playSound(){
        System.out.println("Play file music" + this.fileSound + " music");
    }
}
