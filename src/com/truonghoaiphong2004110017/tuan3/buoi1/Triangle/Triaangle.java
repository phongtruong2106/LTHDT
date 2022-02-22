package com.truonghoaiphong2004110017.tuan3.buoi1.Triangle;

public class Triaangle {

    //altribute
    private String fileSound;

    //metho
    //interface
    public String getSound(){
        return this.fileSound;
    }

    public void setGetSquare(String fileSound)
    {
        this.fileSound = fileSound;
    }
    void roate(){
        System.out.println("Roating 360");

    }

    void playSound(){
        System.out.println("Play file  " + this.fileSound + " music");
    }

}
