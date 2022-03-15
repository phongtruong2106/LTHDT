package com.truonghoaiphong2004110017.tuan5.buoi1;

public class Dog extends Canine implements Pet, itnName{
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

    @Override
    public void beFriendly() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    } 
}
