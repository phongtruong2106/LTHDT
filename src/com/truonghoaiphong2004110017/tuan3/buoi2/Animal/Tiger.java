package com.truonghoaiphong2004110017.tuan3.buoi2.Animal;

public class Tiger extends Canine {
    @Override 
    protected void eat(){
        System.out.println("Tiger eating meat");
    }
    @Override
    protected void makeNoise(){
        System.out.println("Tiger eating");
    }

    public void RunSpeed(){
        System.out.println("Tiger run fast");
    }
}
