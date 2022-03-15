package com.truonghoaiphong2004110017.tuan5.buoi1;

public class AnimalTestDrive {
    public static void main(String[] args) {
         Animal animal = new Dog();
         animal.makeNoise();
         animal.eat();
         animal.sleep();
         Animal animal2 = new Hippo();
         animal2.makeNoise();
         animal2.eat();
         animal2.sleep();
    }
}
