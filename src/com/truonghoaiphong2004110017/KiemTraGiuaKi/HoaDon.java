package com.truonghoaiphong2004110017.KiemTraGiuaKi;

import java.util.Scanner;

public class HoaDon {
    protected int maHoaDon, maPhong;
    protected String ngayHoaDon, tenKhachHang;
    protected double donGia, thanhTien;
    Scanner sc = new Scanner(System.in);

    protected HoaDon(){
        this.maHoaDon = 0;
        this.ngayHoaDon = "";
        this.tenKhachHang = "";
        this.donGia = 0;
        this.maPhong = 0;
        this.thanhTien = 0;
    }

    protected HoaDon(int maHoaDon, String ngayHoaDon, String tenKhachHang, double donGia, int maPhong, double thanhTien){
        this.maHoaDon = maHoaDon;
        this.ngayHoaDon = ngayHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.donGia =donGia;
        this.maPhong = maPhong;
        this.thanhTien = thanhTien;
    }
    protected int getMaHoaDon() {
        return maHoaDon;
    }
    protected void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }
    protected String getNgayHoaDon() {
        return ngayHoaDon;
    }
    protected void setNgayHoaDon(String ngayHoaDon) {
        this.ngayHoaDon = ngayHoaDon;
    }
    protected String getTenKhachHang() {
        return tenKhachHang;
    }
    protected void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }
    protected double getDonGia() {
        return donGia;
    }
    protected void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    protected int getMaPhong() {
        return maPhong;
    }
    protected void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }
    protected double getThanhTien() {
        return thanhTien;
    }

    protected void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
    protected void input(){
        System.out.println("mã hóa đơn: ");
        maHoaDon = sc.nextInt();
        sc.nextLine();
        System.out.println("ngày hóa đơn: ");
        ngayHoaDon = sc.nextLine();
        System.out.println("tên khách hàng: ");
        tenKhachHang = sc.nextLine();
        System.out.println("đơn giá: ");
        donGia = sc.nextDouble();
        System.out.println("mã phòng: ");
        maPhong = sc.nextInt();
    }

    @Override
    public String toString() {
        return " [MaHoaDon=" + maHoaDon +  ", NgayHoaDon=" + ngayHoaDon + ", tenKH=" + tenKhachHang + ", DonGia" + donGia + ", MaPhong=" + maPhong;
    }


}
