package com.truonghoaiphong2004110017.buoi4.shape.circle;

public class circleTestDrive {
    public static void main(String[] args) {
        Circle circle = new Circle("sun.aif");
        circle.roate();
        circle.playSound();

        circle.fileSound = "cshbh.aif";
        circle.playSound();
    }
}
