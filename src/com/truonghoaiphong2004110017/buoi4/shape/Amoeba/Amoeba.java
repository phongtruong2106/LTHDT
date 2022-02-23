package com.truonghoaiphong2004110017.buoi4.shape.Amoeba;

public class Amoeba {
    String sound;
    int xPoint;
    int yPoint;

    public Amoeba(String sound, int xPoint, int yPoint){
        this.sound = sound;
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }


    void rotate(){
        System.out.println("Xoay 360 độ at xPoint: "+this.xPoint +" yPoint: "+this.yPoint);
    }

    void playSound(){
        System.out.println("Play sound: "+ this.sound + " music");
    } 
    
}
