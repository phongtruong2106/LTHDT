package com.truonghoaiphong2004110017.tuan3.buoi2.bai6;

import java.util.Date;
import java.util.Locale;

public class ThucPham {
    private int id;
    private String name;
    private double donGia;
    private Date nSX, nHH;

    //khởi tạo constructor mặc định
    public ThucPham(){
    }

    //khởi tạo constructor có tham số
    public ThucPham(int id, String name, double donGia, Date nSX, Date nHH){
        this.id = id;
        this.name = name;
        this.donGia = donGia;
        this.nSX =nSX;
        this.nHH = nHH;
    }

    //set and get
    public void setMaHang(int id){
        this.id = id;
    }
    public int getMaHang(){
        return this.id;
    }

    public void setTenHang(String name){
        this.name = name;
    }
    public String getTenHang(){
        return this.name;
    }

    public void setDonGia(double donGia){
        this.donGia = donGia;
    }
    public double getDonGia(){
        return this.donGia;
    }

    public void setNSX(Date nSX){
        this.nSX = nSX;
    }
    public Date getNSX(){
        return this.nSX;
    }

    public void setNHH(Date nHH){
        this.nHH = nHH;
    }

    public Date getNHH(){
        return this.nHH;
    }

/*//khởi tạo phương thức toString
    public String toString(){
        //sử dụng phương thức locale để biến đổi theo tiền tệ việt
        Locale lcVN = new Locale("vi", "VN");
        
    } */
}
