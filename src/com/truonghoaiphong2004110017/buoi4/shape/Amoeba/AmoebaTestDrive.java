package com.truonghoaiphong2004110017.buoi4.shape.Amoeba;

public class AmoebaTestDrive {
    public static void main(String[] args) {
        System.out.println("Hình Amoeba");
        Amoeba amoeba = new Amoeba("Mùa đông", 7, 2);
        amoeba.rotate();
        amoeba.playSound();
    }
}
