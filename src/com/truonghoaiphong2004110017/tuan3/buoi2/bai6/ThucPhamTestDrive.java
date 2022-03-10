package com.truonghoaiphong2004110017.tuan3.buoi2.bai6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThucPhamTestDrive {
    public static void main(String[] args) throws ParseException {
        ThucPham thucPham = new ThucPham("YT");
        /* thucPham.getMaHang();
        System.out.println(thucPham); */
        Date ngayHienTai = new Date();
        System.out.println(ngayHienTai);

        String ngaySX = "02/03/2022";
        String ngayHH = "18/06/2022";

        SimpleDateFormat ngayVn = new SimpleDateFormat("dd/mm/yyyy");
        ThucPham tp2 = new ThucPham("YTT", "carot", 2_000, ngayVn.parse(ngaySX), ngayVn.parse(ngayHH));

        System.out.println(tp2);
    }
}
