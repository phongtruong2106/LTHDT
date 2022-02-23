package com.truonghoaiphong2004110017.tuan3.buoi2;

import java.util.Scanner;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(2002, "trương hoài phong", 9, 10);
        //sinh viên 2
        SinhVien sv2 = new SinhVien(2004, "denajau", 8,9);
        //sinh viên 3
        SinhVien sv3 = new SinhVien();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập mssv");
        sv3.setId(sc.nextInt());
        System.out.println("nhập họ và tên");
        sv3.setHoVaTen(sc.nextLine());
        System.out.println("nhập điểm lý thuyết: ");
        sv3.setDiemTh(sc.nextFloat());
        System.out.println("nhập điểm thực hành");
        sv3.setDiemlT(sc.nextFloat());

        System.out.printf("%-30s",sv1.getId(), sv1.getHoVaTen(), sv1.getDiemLt(), sv1.getDiemTh(), sv1.DiemTrungBinh());
        System.out.printf("%-30s",sv2.getId(), sv2.getHoVaTen(), sv2.getDiemLt(), sv2.getDiemTh(), sv2.DiemTrungBinh());
        System.out.printf("%-30s",sv3.getId(), sv3.getHoVaTen(), sv3.getDiemLt(), sv3.getDiemTh(), sv3.DiemTrungBinh());
    }
}
