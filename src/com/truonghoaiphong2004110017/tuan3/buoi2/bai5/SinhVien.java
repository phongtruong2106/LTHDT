package com.truonghoaiphong2004110017.tuan3.buoi2.bai5;

import java.util.Scanner;

public class SinhVien {
    //khai báo các thuộc tính 
    private int id;
    private String hoTen;
    private String diaChi;
    private String sdt;

    //khởi tạo contructor mặc đinh
    public SinhVien(){
    }

    //khởi tạo constructor tham số
    public SinhVien(int id, String hoTen, String diaChi, String sdt){
        this.id = id;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }
    //get and set
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    public String getHoTen(){
        return this.hoTen;
    }
    public void setDiaChi(String diaChi){
        this.diaChi = diaChi;
    }
    public String getDiaChi(){
        return this.diaChi;
    }
    public void setSdt(String sdt){
        this.sdt = sdt;
    }
    public String getSdt(){
        return this.sdt;
    }
    //toString
    public String toString(){
        String str = " MSSV: " + id + " \n họ và tên" + hoTen + " \n địa chỉ: " + diaChi + " \n số điện thoại: " + sdt;
        return str;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập mssv: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("nhập họ và tên: ");
        hoTen = sc.nextLine();
        System.out.println("nhập địa chỉ: ");
        diaChi =sc.nextLine();
        do{
            System.out.println("nhập số điện thoại(7 số) :");
            sdt = sc.nextLine();
        } while (sdt.length() != 7);
    }
    //in
    public void print(){
        System.out.printf("%-5d %-20s %-15s %-15s", id, hoTen, diaChi, sdt);
    }

}
