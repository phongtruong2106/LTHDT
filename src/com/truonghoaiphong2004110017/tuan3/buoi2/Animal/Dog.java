package com.truonghoaiphong2004110017.tuan3.buoi2.Animal;

public class Dog extends Canine {
    @Override 
    protected void makeNoise(){
        System.out.println("dog sound...");
    }

    @Override
    protected void eat(){
        System.out.println("Dog eating rice...");
    }

    public void chaseCat(){
        System.out.println("Dog chasing cat.....");
    }

    
}
