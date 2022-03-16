package com.truonghoaiphong2004110017.KiemTraGiuaKi;


public class HoaDonTheoNgay extends HoaDon{
    private int soNgayThue;

    public HoaDonTheoNgay(){
        super();
        this.soNgayThue = 0;
    }

    public HoaDonTheoNgay(int maHoaDon, String ngayHoaDon, String tenKhachHang, double donGia, int maPhong, double thanhTien, int soNgayThue){
        super(maHoaDon, ngayHoaDon, tenKhachHang, donGia, maPhong, thanhTien);
        this.soNgayThue =soNgayThue;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }
    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    public void input(){
        super.input();
        System.out.println("số ngày thuê: ");
        soNgayThue = sc.nextInt();

    }

    public double thanhTien(){
        if(soNgayThue > 7)
            return this.thanhTien = (this.soNgayThue * this.donGia *20) / 100;
        else
            return this.thanhTien = this.soNgayThue * this.donGia;
        
    }

    @Override
    public String toString() {
        return "Hoa Don theo Ngay: " + super.toString() + ", so ngay thue: " + soNgayThue + ", thanh tien: " + thanhTien + "]";
    }

}
