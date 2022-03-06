package com.truonghoaiphong2004110017.tuan3.buoi2.bai5;

import java.util.Scanner;

public class SinhVienTestDrive {
    static Scanner sc= new Scanner(System.in);
    static void Input(SinhVien sv){
        System.out.println("nhập mssv: ");
        sv.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("nhập họ và tên: ");
        sv.setHoTen(sc.nextLine());
        System.out.println("nhập địa chỉ: ");
        sv.setDiaChi(sc.nextLine());
        do{
            System.out.println("nhập số điện thoại(7 số) :");
            sv.setSdt(sc.nextLine());
        } while (sv.getSdt().length() != 7);
    }
    public static void main(String[] args) {
         
    }
}
