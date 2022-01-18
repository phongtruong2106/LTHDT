package com.truonghoaiphong2004110017.buoi3.Dog;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog(20 , "husky");
        dog.print();
        dog.bark();
        dog.run();
        dog.setBiger();
        
        
        Dog dog1 = new Dog(14, "chi hua hua");
        dog1.print();
        dog1.bark();
        dog1.run();
        dog.setBiger();
    }
}
