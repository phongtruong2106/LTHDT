package com.truonghoaiphong2004110017.tuan4.buoi7.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class ChuyenXeTestDrive {
    public static void main(String[] args) {
        ArrayList<NoiThanh> arrNoiThanh = new ArrayList<>();
        ArrayList<NgoaiThanh> arrNgoaiThanh = new ArrayList<>();
        int soChuyenNoiThanh , soChuyenNgoaiThanh;
        double doanhThuNoiThanh = 0, doanhThuNgoaiThanh = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số chuyến nội thành: ");
        soChuyenNoiThanh =sc.nextInt();
        System.out.print("nhập số chuyến ngoài thành: ");
        soChuyenNgoaiThanh = sc.nextInt();
        System.out.println("nhập thông tin xe nội thành: ");
        for(int i = 0; i < soChuyenNoiThanh ; i++){
            System.out.println("nhập thông tin chuyến nội thành thứ : " + (i + 1) + " : ");
            NoiThanh noiThanh = new NoiThanh();
            noiThanh.input();
            doanhThuNoiThanh += noiThanh.getDoanhThu();
            arrNoiThanh.add(noiThanh);
        }

        System.out.println("nhập thông tin ngoại thành: ");
        for(int i = 0; i < soChuyenNgoaiThanh; i++){
            NgoaiThanh ngoaiThanh  =  new NgoaiThanh();
            ngoaiThanh.input();
            doanhThuNgoaiThanh += ngoaiThanh.getDoanhThu();
            arrNgoaiThanh.add(ngoaiThanh);
        }

        System.out.println("_________Thông tin chuyến nội thành________");
        for(int i = 0; i < arrNoiThanh.size(); i++){
            System.out.println(arrNoiThanh.get(i).toString());
        }

        System.out.println("_________Thông tin chuyến ngoại thành________");
        for(int i = 0; i< arrNgoaiThanh.size(); i++){
            System.out.println(arrNgoaiThanh.get(i).toString());
        }

        System.out.println("doanh thu chuyến nội thành: " + doanhThuNoiThanh);
        System.out.println("doanh thu chuyến ngoại thành: " + doanhThuNgoaiThanh);

    }
}
