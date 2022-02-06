package com.truonghoaiphong2004110017.buoi4.shape.Square;

public class SquareTestDrive {
    public static void main(String[] args) {
        Square square = new Square("superidol.aif");
        square.playSound();
        square.roate();

        square.fileSound = "theme.aif";
        square.playSound();
    }
}
