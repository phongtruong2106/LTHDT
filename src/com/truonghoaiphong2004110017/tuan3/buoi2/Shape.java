package com.truonghoaiphong2004110017.tuan3.buoi2;

public class Shape {
    private String sound;

    public Shape(){}

    /**
     * @param sound the sound to set
     */
    public void setSound(String sound) {
        this.sound = sound;
    }

    /**
     * @return the sound
     */
    public String getSound() {
        return sound;
    }

    public Shape(String sound) {
        this.sound = sound;
    }

    public void rotate() {
        System.out.println("Xoay 360 độ");
    }

    public void playSound() {
        System.out.println("Play sound .aif: " + this.sound + " music");
    }
}
