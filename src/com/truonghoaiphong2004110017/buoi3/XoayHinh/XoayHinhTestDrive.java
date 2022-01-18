package com.truonghoaiphong2004110017.buoi3.XoayHinh;

public class XoayHinhTestDrive {
    public static void main(String[] args) {
        XoayHinh square = new XoayHinh("square", "click");
        square.print();
        square.xoayhinh360();
        
        XoayHinh circle = new XoayHinh("circle", "no click");
        circle.print();
        circle.xoayhinh360();

       XoayHinh triangle = new XoayHinh("triangle", "click") ;
       triangle.print();
       triangle.xoayhinh360();
    }
}
