package com.truonghoaiphong2004110017.tuan6.buoi1;


import com.truonghoaiphong2004110017.tuan5.buoi1.Animal;
import com.truonghoaiphong2004110017.tuan5.buoi1.Dog;
import com.truonghoaiphong2004110017.tuan5.buoi1.Hippo;
import com.truonghoaiphong2004110017.tuan5.buoi1.Lion;

public class DaHinhMang {
    public static void main(String[] args) {
         Animal danhSachThu[] = new Animal[6];
        Lion lion = new Lion();
        Lion lion2 = new Lion();

        Dog dog = new Dog();
        Dog dog2 = new Dog();
        danhSachThu[0] = lion;
        danhSachThu[1] = lion2;
        danhSachThu[2] = dog;
        danhSachThu[3] = dog2;

        Hippo hippo = new Hippo();
        danhSachThu[4] = hippo;
        Pig pig = new Pig();
        danhSachThu[5] = pig;
        for( Animal animal : danhSachThu){
                animal.makeNoise();//DA - gửi thông điệp = message
            
          }
    }
   
}
