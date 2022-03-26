package com.truonghoaiphong2004110017.tuan6.buoi1.HoaDonKhachSan;

import java.util.Date;

public class HoaDonTheoNgay extends HoaDon {
    private int soNgayThue;

    public HoaDonTheoNgay(){
        super();
        this.soNgayThue = 0;
    }

    public HoaDonTheoNgay(String maHoaDon, Date ngayHoaDon, String tenKhachHang, int maPhong, double donGia, double thanhTien, int soNgayThue){
        super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
        this.soNgayThue = soNgayThue;
    }

    public float getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    @Override
    protected double thanhTien() {
        double tien = 0;
        if(this.soNgayThue > 7){
            tien = 7 * this.getDonGia() + (this.getDonGia() - 7) * 0.8;
        } else {
            tien = soNgayThue*getDonGia();
        }

        return tien;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Hoa don theo ngay" +  super.toString() + ", so ngay thue: " + soNgayThue;
    }
}
