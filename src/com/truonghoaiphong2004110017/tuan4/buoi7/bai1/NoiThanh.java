package com.truonghoaiphong2004110017.tuan4.buoi7.bai1;

import java.util.Scanner;

public class NoiThanh extends ChuyenXe{
    private double soKm;
    private int soTuyen;

    Scanner sc= new Scanner(System.in);
    //construction mặc định 
    public NoiThanh(){
        super();
    }
    //construction có tham số
    public NoiThanh(double soKm, int soTuyen){
        super();
        this.soKm = soKm;
        this.soTuyen = soTuyen;
    }

    public void setSoKm(double soKm){
        this.soKm = soKm;
    }

    public double getSoKm(){
        return this.soKm;
    }

    public void setSoTuyen(int soTuyen){
        this.soTuyen = soTuyen;
    }

    public int getSoTuyen(){
        return this.soTuyen;
    }

    @Override
    public String toString() {
        return super.toString() + " , số tuyến: " + this.soTuyen + " , số km đi được: " + this.soKm;
    }

    public void input(){
        super.input();
        System.out.println("nhập số tuyến: ");
        soTuyen = sc.nextInt();
        System.out.println("nhập số km đi được: ");
        soKm = sc.nextDouble();
    }


}
