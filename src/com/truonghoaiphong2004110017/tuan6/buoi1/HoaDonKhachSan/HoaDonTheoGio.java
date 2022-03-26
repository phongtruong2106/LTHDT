package com.truonghoaiphong2004110017.tuan6.buoi1.HoaDonKhachSan;

import java.util.Date;

public class HoaDonTheoGio extends HoaDon{
    private double soGioThue;

    public HoaDonTheoGio(){
        super();
        this.soGioThue = 0;
    }

    public HoaDonTheoGio(String maHoaDon, Date ngayHoaDon, String tenKhachHang,int maPhong, double donGia, double thanhTien, double soGioThue){
        super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
        this.soGioThue = soGioThue;
    }

    public double getSoGioThue() {
        return soGioThue;
    }

    public void setSoGioThue(double soGioThue) {
        this.soGioThue = soGioThue;
    }

    @Override
    protected double thanhTien() {
        double tien = 0;
        if(this.soGioThue <= 24){
            tien = soGioThue * getDonGia();
        }
        if(this.soGioThue > 24 && this.soGioThue < 30){
           tien = getDonGia()*24;
        }
        if(this.soGioThue >30 ){
            System.out.println("hóa đơn này không dc tính theo giờ");
        }
        return tien;

    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "hoa don theo gio" + super.toString() + ", so gio thue: "  +soGioThue ;
    }
    
}
