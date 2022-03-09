package com.truonghoaiphong2004110017.tuan3.buoi2.Animal;

public class Cat extends Feline{
    @Override
    protected void makeNoise(){
        System.out.println("cat sound.....");
    }

 
    public void chaseButerfly(){
        System.out.println("chasing........");
    }

    public void eat(){
        System.out.println("cat eating fish..");
    }
    
}
