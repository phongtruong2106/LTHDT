package com.truonghoaiphong2004110017.baitaptet.bai1;

import java.util.Scanner;



public class sanPham {
    String tenSp;
    double donGia;
    double giamGia;
    double thueNhapKhau;
    

    public sanPham(){

    }

    public sanPham(String tenSp, double donGia){
        this.tenSp = tenSp;
        this.donGia = donGia;
    }

    public sanPham(String tenSp, double donGia, double giamGia){
        this(tenSp, donGia);
        this.giamGia = giamGia;
    }


    //phương thức nhập data
    public String getTenSp(){
        return tenSp;
    }
    public void setTenSp(String tenSp){
        this.tenSp = tenSp;
    }

    public double getDonGia(){
        return donGia;
    }
    public void setDonGia(double donGia){
        this.donGia = donGia;
    }
    public double getGiamGia(){
        return giamGia;
    }
    public void setGiamGia(double giamGia){
        this.giamGia = giamGia;
    }

    public void getThueNhapKhau(double thueNhapKhau){
        thueNhapKhau = 10 * donGia /100;
        System.out.println(" => thuế nhập khẩu: " + thueNhapKhau);
    }

    //xuất and nhập
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("tên sản phẩm: ");
        setTenSp(sc.nextLine());
        System.out.println("đơn giá: ");
        setDonGia(sc.nextDouble());
        System.out.println("giảm giá: ");
        setGiamGia(sc.nextDouble());
    }

    public void output(){
        System.out.println(" => tên sản phẩm: " + getTenSp() + "\n => đơn giá: " + getDonGia() + "\n => giảm giá: " + getGiamGia());
        getThueNhapKhau(thueNhapKhau);
    }
   
}
