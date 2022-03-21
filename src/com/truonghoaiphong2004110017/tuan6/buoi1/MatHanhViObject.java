package com.truonghoaiphong2004110017.tuan6.buoi1;

import java.util.ArrayList;
import java.util.List;


import com.truonghoaiphong2004110017.tuan5.buoi1.Dog;
import com.truonghoaiphong2004110017.tuan5.buoi1.Pet;

public class MatHanhViObject {
    public static void main(String[] args) {
        List<Pet> l = new ArrayList();
        Dog dog = new Dog();
        l.add(dog);
        Pet pet = l.get(0);
        //mất hành vi
        //lấy lại hành vi - ep kieu
        Dog dog2 = (Dog)pet; //cú pháp ép kiểu
        dog2.makeNoise();
        dog2.chaseCat();
    }
}
