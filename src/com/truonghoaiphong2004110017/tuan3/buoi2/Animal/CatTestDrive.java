package com.truonghoaiphong2004110017.tuan3.buoi2.Animal;

public class CatTestDrive {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeNoise();//override
        cat.sleep();
        cat.chaseButerfly();//thêm
    }
}
