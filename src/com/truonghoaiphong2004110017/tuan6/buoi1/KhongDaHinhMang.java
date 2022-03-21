package com.truonghoaiphong2004110017.tuan6.buoi1;

import com.truonghoaiphong2004110017.tuan3.buoi2.Animal.Cat;
import com.truonghoaiphong2004110017.tuan5.buoi1.Dog;
import com.truonghoaiphong2004110017.tuan5.buoi1.Lion;

public class KhongDaHinhMang {
    public static void main(String[] args) {
        //danh sách quản lí 
        Lion danhSach[]  =  new Lion[3];
        Lion lion = new Lion();
        Lion lion2 = new Lion();
        danhSach[0] = lion;
        danhSach[1] = lion2;
        danhSach[2] = new Lion();
        //IN danh sách
        for(Lion li : danhSach){
            //ràng buộc code sớm
            li.makeNoise();
        }
        Dog danhSach2[] = new Dog[2];
        
    }
}
