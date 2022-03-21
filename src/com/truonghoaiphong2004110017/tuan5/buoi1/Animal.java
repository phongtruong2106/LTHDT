package com.truonghoaiphong2004110017.tuan5.buoi1;

import java.util.Scanner;

public abstract class Animal {
    private String picture;
    private String food;
    private int hunger;                                               
    Scanner sc= new Scanner(System.in);
    

public abstract void makeNoise();
protected abstract void eat();

protected void sleep(){
    System.out.println("Sleeping ...");
}

protected void roam(){
    System.out.println("Roaming ...");
}
}
