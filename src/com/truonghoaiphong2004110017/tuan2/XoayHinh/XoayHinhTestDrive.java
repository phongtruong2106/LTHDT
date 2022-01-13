package com.truonghoaiphong2004110017.tuan2.XoayHinh;

public class XoayHinhTestDrive {
    public static void main(String[] args) {
        XoayHinh square = new XoayHinh();
        square.NameShape = "square";
        square.nhapchuot();
        square.xoayhinh360();
        square.phatAmThanh();

        XoayHinh circle = new XoayHinh();
        circle.NameShape = "circle";
        circle.nhapchuot();
        circle.xoayhinh360();
        circle.phatAmThanh();

        XoayHinh triangle = new XoayHinh();
        triangle.NameShape = "triangle";
        triangle.nhapchuot();
        triangle.xoayhinh360();
        triangle.phatAmThanh();
    }
}
