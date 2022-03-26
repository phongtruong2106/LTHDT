package com.truonghoaiphong2004110017.tuan6.buoi1.HoaDonKhachSan;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DanhSachHoaDon {
    private List<HoaDon> danhSachHoaDon = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private int slHoaDonTheoGio;
    private int slHoaDonTheoNgay;

    //input thong tin
    public void input(HoaDon hoaDon){
        this.danhSachHoaDon.add(hoaDon);
    }

    //xuat thong tin ra man hinh
    public void output(){
        for (HoaDon hoaDon : danhSachHoaDon){
            System.out.println(hoaDon);
        }
    }

    //sum count hoadon]
    public void tongSl(){
        for (HoaDon hoaDon : danhSachHoaDon){
            if(hoaDon instanceof HoaDonTheoGio){
                this.slHoaDonTheoGio++;
            } else {
                this.slHoaDonTheoNgay++;          
              }
        }

    }

    //trung binh tien hoa don 
    //tat ca nhung ngay ngayHoaDon => 9/2013 se duoc tinh trung binh va xuat ra man hinh
    public double tinhTBTienHD_T9_2013(){
        double tien = 0;
        int dem = 0;
        Calendar calendar = Calendar.getInstance();
        for (HoaDon hoaDon : danhSachHoaDon){
            Date ngayHoaDon = hoaDon.getNgayHoaDon();
            calendar.setTime(ngayHoaDon);
            int month =  calendar.get(Calendar.MONTH);
            int year = calendar.get(Calendar.YEAR);
            if(month == 9 && year == 2013){
                tien += hoaDon.thanhTien();
                dem++;
            }
        }
        return tien/dem;
    }
   
    
}
