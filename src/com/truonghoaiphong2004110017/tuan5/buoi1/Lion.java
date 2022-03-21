package com.truonghoaiphong2004110017.tuan5.buoi1;

public class Lion extends Feline {
    @Override
    protected void eat(){
         System.out.println("lion eating meat");
    }
    @Override
    public void makeNoise(){
        System.out.println("lion sound......");
    }
}
