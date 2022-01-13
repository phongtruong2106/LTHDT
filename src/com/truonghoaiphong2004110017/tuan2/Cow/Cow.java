package com.truonghoaiphong2004110017.tuan2.Cow;

public class Cow {
    String Name;
    String Color;
    String canNang;
    boolean GioiTinh;

   
    void eat(){
        System.out.println( Name + " ăn cỏ");
    }

    void keu(){
        System.out.println(Name + " ummm bò ");   
    }

    void print(){
        System.out.println("Name: " + Name +  " \n Color: " + Color + " \n cân nặng: " + canNang + " \n giới tính: " + GioiTinh);
    }
}
