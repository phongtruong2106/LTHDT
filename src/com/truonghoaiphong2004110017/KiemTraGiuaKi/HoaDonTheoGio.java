package com.truonghoaiphong2004110017.KiemTraGiuaKi;

public class HoaDonTheoGio extends HoaDon{

    private int soGioThue;

    public HoaDonTheoGio(){
        super();
        this.soGioThue= 0;
    }

    public HoaDonTheoGio(int maHoaDon, String ngayHoaDon, String tenKhachHang, double donGia, int maPhong, double thanhTien, int soGioThue){
        super(maHoaDon, ngayHoaDon, tenKhachHang, donGia, maPhong, thanhTien);
        this.soGioThue =soGioThue;
    }

    public int getSoGioThue() {
        return soGioThue;
    }
    public void setSoGioThue(int soGioThue) {
        this.soGioThue = soGioThue;
    }

    public void input(){
        super.input();
        System.out.println("số giờ thuê: ");
        soGioThue =sc.nextInt();
    }

    public double thanhTien(){
        if(soGioThue > 24 && soGioThue < 30)
            return this.thanhTien = this.soGioThue * this.donGia;
        else
            System.out.println("không dùng hóa đơn theo giờ");
            return thanhTien;
    }

    @Override
    public String toString() {
        return "Hoa Don Theo Gio: " + super.toString() + ", so gio thue; " + soGioThue +  ", thanh tien: " + thanhTien +"]";
    }
    
}
 