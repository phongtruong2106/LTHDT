package com.truonghoaiphong2004110017.tuan3.buoi2;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(2002, "Trương Hoài Phong", 10, 7);
        SinhVien sv2 = new SinhVien(2001, "jo jo", 8, 9);
        SinhVien sv3 = new SinhVien();
        sv3.setId();
        sv3.setHoVaTen();
        sv3.setDiemlT();
        sv3.setDiemTh();
        System.out.printf("%-30s %-30s%6s %6s %6s \n", "MSSV", "Hovaten", "ĐTH", "ĐLT", "ĐTB");
        System.out.printf("%-30s %-30s %5.2f %5.2f %5.2f \n", sv1.getId(), sv1.getHoVaTen(), sv1.getDiemTh(), sv1.getDiemLt(), sv1.DiemTrungBinh());
        System.out.printf("%-30s %-30s %5.2f %5.2f %5.2f \n", sv2.getId(), sv2.getHoVaTen(), sv2.getDiemTh(), sv2.getDiemLt(), sv2.DiemTrungBinh());
        System.out.printf("%-30s %-30s %5.2f %5.2f %5.2f \n", sv3.getId(), sv3.getHoVaTen(), sv3.getDiemLt(), sv3.getDiemTh(), sv3.DiemTrungBinh());
    }
}
