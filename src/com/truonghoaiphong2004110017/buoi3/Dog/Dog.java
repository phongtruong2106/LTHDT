package com.truonghoaiphong2004110017.buoi3.Dog;

public class Dog {
    int Size;
    String breed;
    String name;

    public Dog(int Size, String name){
        this.Size = Size;
        this.name = name;
    }

    public Dog(int Size, String name, String breed ){
        this(Size, name);
        this.breed = breed;
    }

    void bark(){
        if(Size > 14){
            System.out.println("gâu gâu");
        } else {
            System.out.println("yib yib");
        }
    }

    void setBiger(){
        Size += 5;
    }

    void run(){
        System.out.println("run.....");
    }

    void print(){
        System.out.println("name: "+ name + " size: " + Size );
    }
    
}
