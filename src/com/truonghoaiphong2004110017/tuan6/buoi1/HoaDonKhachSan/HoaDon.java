package com.truonghoaiphong2004110017.tuan6.buoi1.HoaDonKhachSan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public abstract class HoaDon {
    private String maHoaDon;
    private Date ngayHoaDon;
    private String tenKhachHang;
    private int maPhong;
    private double donGia;
    protected double thanhTien;
    SimpleDateFormat ngayVN = new SimpleDateFormat("dd/MM/yyyy");
    Scanner sc =new Scanner(System.in);
    Scanner scs = new Scanner(System.in);
    protected HoaDon(){

    }

    protected HoaDon(String maHoaDon, Date ngayHoaDon, String tenKhachHang,int maPhong, double donGia, double thanhTien){
        this.maHoaDon = maHoaDon;
        this.ngayHoaDon = ngayHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.maPhong = maPhong;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }
    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }
    public Date getNgayHoaDon() {
        return ngayHoaDon;
    }
    public void setNgayHoaDon(Date ngayHoaDon) {
        this.ngayHoaDon = ngayHoaDon;
    }
    public String getTenKhachHang() {
        return tenKhachHang;
    }
    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }
    public int getMaPhong() {
        return maPhong;
    }
    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }


    protected abstract double thanhTien();

    @Override
    public String toString() {
        return " [MaHoaDon=" + maHoaDon +  ", NgayHoaDon=" + ngayHoaDon + ", tenKH=" + tenKhachHang + ", DonGia" + donGia + ", MaPhong=" + maPhong;
    }
    public void input(){
        System.out.println("mã hóa đơn: ");
        maHoaDon = sc.nextLine();
        System.out.println("ngày hóa đơn: ");
        try {
            ngayHoaDon = ngayVN.parse(sc.nextLine());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("tên khách hàng: ");
        tenKhachHang = sc.nextLine();
        System.out.println("đơn giá: ");
        donGia = scs.nextDouble();
        System.out.println("mã phòng: ");
        maPhong = sc.nextInt();
    }

}
