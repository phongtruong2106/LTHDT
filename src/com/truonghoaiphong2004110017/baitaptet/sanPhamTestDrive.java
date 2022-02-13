package com.truonghoaiphong2004110017.baitaptet;


public class sanPhamTestDrive {
    public static void main(String[] args) {
        sanPham sanpham = new sanPham();
        sanpham.input();
        sanpham.output();

    /*  //bài 2
        sanPham sp1= new sanPham();
        sp1.input();

        sanPham sp2 = new sanPham();
        sp2.input();

        //in 
        sanpham.output();
        System.out.println("_____________");
        sp1.output();
        System.out.println("_____________");
        sp2.output();
    */
        //bài 3
        sanPham sp1 = new sanPham("cocacola", 10.000);
        sp1.output();

        sanPham sp2 = new sanPham("pepsi", 10.000);
        sp2.output();
        
    }
}
