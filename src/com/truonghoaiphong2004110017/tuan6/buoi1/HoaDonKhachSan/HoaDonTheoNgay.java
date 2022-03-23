package com.truonghoaiphong2004110017.tuan6.buoi1.HoaDonKhachSan;

import java.util.Date;

public class HoaDonTheoNgay extends HoaDon {
    private float soNgayThue;

    public HoaDonTheoNgay(){
        super();
        this.soNgayThue = 0;
    }

    public HoaDonTheoNgay(String maHoaDon, Date ngayHoaDon, String tenKhachHang, int maPhong, double donGia, double thanhTien, float soNgayThue){
        super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia, thanhTien);
        this.soNgayThue = soNgayThue;
    }

    public float getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(float soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    @Override
    protected double thanhTien() {
        if(this.soNgayThue > 7){
            this.thanhTien = soNgayThue * ((getDonGia() * 20) / 100);
        } else {
            this.thanhTien = soNgayThue*getDonGia();
        }

        return thanhTien;
    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.println("nhập só ngày thuê; ");
        this.soNgayThue = sc.nextFloat();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Hoa don theo ngay" +  super.toString() + ", so ngay thue: " + soNgayThue + ", thanh tien: " + thanhTien;
    }
}
