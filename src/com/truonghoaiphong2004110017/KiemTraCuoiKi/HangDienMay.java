package com.truonghoaiphong2004110017.KiemTraCuoiKi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HangDienMay extends Kho {
     private Date ngayBaoHanh;
     private int congXuat;

     SimpleDateFormat ngayVN = new SimpleDateFormat("dd/MM//yyyy");

     public HangDienMay(String maHang, String tenHang, int soLuongTon, double donGia, Date ngayBaoHanh,int congXuat ){
          super(maHang, tenHang, soLuongTon, donGia);
          this.ngayBaoHanh = ngayBaoHanh;
          this.congXuat = congXuat;
     }

     public void setCongXuat(int congXuat) {
         if(congXuat > 0){
              this.congXuat = congXuat;
         } else {
              System.out.println("error!! nhập số > 0 ");
         }
     }

     @Override
     public float Vat() {
          // TODO Auto-generated method stub
          return 0;
     }

     @Override
     public String toString() {

          // TODO Auto-generated method stub
          return "Hang Dien May: [ngay bao hanh; " + ngayVN.format(ngayBaoHanh) + ", công xuat: " + congXuat +  "]"+ super.toString();
     }
}
