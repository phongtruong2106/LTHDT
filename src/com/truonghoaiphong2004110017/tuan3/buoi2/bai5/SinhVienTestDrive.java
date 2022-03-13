package com.truonghoaiphong2004110017.tuan3.buoi2.bai5;

import java.util.Scanner;

public class SinhVienTestDrive {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        SinhVien sVien[] = null;
        System.out.println("-nhập số lượng sinh viên; ");
        int a = sc.nextInt();
        sVien = new SinhVien[a];
        for(int i = 0; i < a; i++){
            System.out.println("nhập sinh viên thứ " + (i + 1) + " : ");
            sVien[i] = new SinhVien();
            sVien[i].Input();
        }
        //sắp xếp theo mã sinh viên
    SinhVien sx = null;
    for( int i = 0; i < a -1; i++){
        for ( int j = i + 1; j < a; j++){
            if(sVien[i].getId() > sVien[j].getId()){
                 sx = sVien[i];
                 sVien[i] = sVien[j];
                 sVien[j] = sx;
                }
           
             }                    
        
        }
        //xuất ra màn hình]
        System.out.println("danh sách sinh viên");

        for(int i = 0; i < a; i++){
            System.out.println(sVien[i].toString());
        }
    }

    
}
