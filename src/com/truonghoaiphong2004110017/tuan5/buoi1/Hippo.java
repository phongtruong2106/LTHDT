package com.truonghoaiphong2004110017.tuan5.buoi1;

public class Hippo extends Animal{
    @Override
    protected void eat(){
        System.out.println("Hippo eating grass..");

    }

    @Override
    protected void makeNoise(){
        System.out.println("Hippo sound....");
    }

    public void Submersed(){
        System.out.println("Hippo under water for a quarter of an hour");
    }
}
