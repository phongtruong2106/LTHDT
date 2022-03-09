package com.truonghoaiphong2004110017.tuan4.buoi7.bai1;

import java.util.Scanner;

public class ChuyenXe {
    protected int id;
    protected String HoVaTen;
    protected String soXe;
    protected double doanhThu;

    Scanner sc = new Scanner(System.in);
    //constructor mặc
    public ChuyenXe(){
        super();
        this.id = 0;
        this.HoVaTen = " ";
        this.soXe = " ";
        this.doanhThu = 0;
    }

    //constructor tham số
    public ChuyenXe(int id, String HoVaTen, String soXe, Double doanhThu){
        super();
        this.id = id;
        this.HoVaTen = HoVaTen;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }
    
    //set and get
    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setHoVaTen(String HoVaTen){
        this.HoVaTen = HoVaTen;
    }
    
    public String getHoVaTen(){
        return this.HoVaTen;
    }

    public void setSoXe(String soXe){
        this.soXe = soXe;
    }

    public String getSoXe(){
        return this.soXe;
    }

    public void setDoanhThu(double doanhThu){
        this.doanhThu = doanhThu;
    }

    public double getDoanhThu(){
        return this.doanhThu;
    }

    //khai triển phương thức toString
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " , mã chuyến xe: " + this.id + " , họ và tên tài xế: " + this.HoVaTen + " , số xe: " + this.soXe + " , doanh thu: " + this.doanhThu;
    }

    public void input(){
        System.out.println("nhập mã chuyến xe: ");
        id = sc.nextInt();
        System.out.println("nhập họ và tên tài xế: ");
        HoVaTen = sc.nextLine();
        sc.nextLine();
        System.out.println("nhập số xe: ");
        soXe = sc.nextLine();
        System.out.println("nhập doanh thu: ");
        doanhThu = sc.nextDouble();
    }

}