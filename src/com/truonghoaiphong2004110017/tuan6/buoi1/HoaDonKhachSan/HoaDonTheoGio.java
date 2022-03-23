package com.truonghoaiphong2004110017.tuan6.buoi1.HoaDonKhachSan;

import java.util.Date;

public class HoaDonTheoGio extends HoaDon{
    private double soGioThue;

    public HoaDonTheoGio(){
        super();
        this.soGioThue = 0;
    }

    public HoaDonTheoGio(String maHoaDon, Date ngayHoaDon, String tenKhachHang,int maPhong, double donGia, double thanhTien, double soGioThue){
        super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia, thanhTien);
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
        if(this.soGioThue <= 24){
            this.thanhTien = soGioThue * getDonGia();
        }
        if(this.thanhTien > 24 && this.thanhTien < 30){
           this.thanhTien = getDonGia()*24;
        }
        if(this.thanhTien >30 ){
            System.out.println("hóa đơn này không dc tính theo giờ");
        }
        return thanhTien;

    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "hoa don theo gio" + super.toString() + ", so gio thue: "  +soGioThue + ", thanh tien: " + thanhTien;
    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.println("nhập số giờ thuê: ");
        this.soGioThue = sc.nextDouble();
    }

    
}
