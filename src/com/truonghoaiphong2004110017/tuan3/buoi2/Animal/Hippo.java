package com.truonghoaiphong2004110017.tuan3.buoi2.Animal;

public class Hippo extends Canine {
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
