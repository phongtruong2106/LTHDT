package com.truonghoaiphong2004110017.tuan6.buoi1;


import com.truonghoaiphong2004110017.tuan5.buoi1.Dog;
import com.truonghoaiphong2004110017.tuan5.buoi1.Lion;

public class VetTestDrive {
    public static void main(String[] args) {
         Vet v = new Vet();
         Dog d = new Dog();
         Lion l = new Lion();
         v.giveSgot(d);
         v.giveSgot(l);
         
         
    }
}
