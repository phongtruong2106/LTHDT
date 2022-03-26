package com.truonghoaiphong2004110017.KiemTraCuoiKi;

import java.util.Date;

public class HangThucPham extends Kho{
    public HangThucPham(String maHang) {
        super(maHang);
        //TODO Auto-generated constructor stub
    }

    public HangThucPham(String maHang, String tenHang, int soLuongTon, double donGia, Date ngaySanXuat, Date ngayHetHan, String nhaCungCap){
        super(maHang);
        
    }

    private Date ngaySanXuat;
    private Date ngayHetHan;
    private String nhaCungCap;

    public void setNgayHetHan(Date ngayHetHan) {
        if(ngayHetHan.after(ngaySanXuat)){
              this.ngayHetHan = ngayHetHan;
        } else {
            System.out.println("ngày hết hạn phải sao ngày sản xuất");
        }
      
    }

    @Override
    public float Vat() {
        // TODO Auto-generated method stub
        return 0;
    }

    


}
