package com.truonghoaiphong2004110017.tuan5.buoi1.bai2;

public class SachThamKhao extends ThuVien{
    private double thanhTien, thue;

     
    public SachThamKhao(){

    }

    public SachThamKhao(double thanhTien, double thue){
        this.thanhTien = thanhTien;
        this.thue = thue;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    public double getThue() {
        return thue;
    }

    public void input(){
        super.input();
        System.out.println("input tax: ");
        thue = sc.nextDouble();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + ",TAX: " + this.thue + " ,thành tiền: " + thanhTien();
    }

    public double thanhTien(){
        return thanhTien = this.getUnitPrice() *  this.getUnitPrice() + this.thue;
    }

}
