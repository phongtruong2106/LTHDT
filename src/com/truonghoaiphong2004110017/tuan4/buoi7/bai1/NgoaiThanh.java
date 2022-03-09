package com.truonghoaiphong2004110017.tuan4.buoi7.bai1;

import java.util.Scanner;

public class NgoaiThanh extends ChuyenXe{
    private String noiDen;
    private int soNgay;
    
    Scanner sc = new Scanner(System.in);

    public NgoaiThanh(){
        super();
    }
    public NgoaiThanh(String noiDen, int soNgay){
        super();
        this.noiDen = noiDen;
        this.soNgay = soNgay;
    }

    public void setNoiDen(String noiDen){
        this.noiDen = noiDen;
    }

    public String getNoiDen(){
        return this.noiDen;
    }

    public void setSoNgay(int soNgay){
        this.soNgay = soNgay;
    }

    public int getSoNgay(){
        return this.soNgay;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + ", nơi đến: " + this.noiDen + " , số ngày đi được: " + this.soNgay;
    }

    public void input(){
        super.input();
        System.out.println("nơi đến: ");
        noiDen = sc.nextLine();
        System.out.println("số ngày đi được: ");
        soNgay = sc.nextInt();

    }

}
