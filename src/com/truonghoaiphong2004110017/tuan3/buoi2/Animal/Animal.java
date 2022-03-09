package com.truonghoaiphong2004110017.tuan3.buoi2.Animal;

import java.util.Scanner;

public class Animal {
    private String picture;
    private String food;
    private int hunger;
    Scanner sc= new Scanner(System.in);
    

protected void makeNoise(){
    System.out.println("kêu....");
}

protected void eat(){
    System.out.println("ăn...");
}

protected void sleep(){
    System.out.println("Sleeping ...");
}

protected void roam(){
    System.out.println("Roaming ...");
}
 
}
