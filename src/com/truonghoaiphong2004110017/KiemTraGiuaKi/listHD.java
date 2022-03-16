package com.truonghoaiphong2004110017.KiemTraGiuaKi;

public class listHD {
    HoaDon hoaDon[] = new HoaDon[100];
    private int countHDn, sum1 = 0, sum2 = 0, dem = 0, sumsl = 0;

    public listHD(){
        countHDn=0;
        for(int i = 0; i <  100; i++){
            hoaDon[i] = new HoaDon();
        }
    }

    public void themHD(int temp)
    {
        if(countHDn>100){
            System.out.println("bo nho da day!!");
        }else{
            if(temp ==1){
                hoaDon[countHDn] = new HoaDonTheoGio();
                HoaDonTheoGio hoaDonTg = new HoaDonTheoGio();
                hoaDonTg.input();
                hoaDonTg.thanhTien = hoaDonTg.thanhTien();
                hoaDon[countHDn] =hoaDonTg;
                sum1 += hoaDonTg.maHoaDon;

            }
            else{
                hoaDon[countHDn] = new HoaDonTheoNgay();
                HoaDonTheoNgay hoaDonTn = new HoaDonTheoNgay();
                hoaDonTn.input();
                hoaDonTn.thanhTien =hoaDonTn.thanhTien();
                hoaDon[countHDn] = hoaDonTn;
                dem++;
                sum2 += hoaDonTn.maHoaDon;
                sumsl += hoaDonTn.thanhTien;
            }
            countHDn++;
        }
    }

    public void HienThiHD(){
        for(int i =0; i < countHDn; i++){
            System.out.println("\n " + (i +1));
            System.out.println(hoaDon[i].toString());
        }
    }
    public void tongSL(){
        System.out.println("tổng sl phong thue theo giơ" + sum1);
        System.out.println("tổng sl phong thue theo ngay" + sum2);
    }

    
}
