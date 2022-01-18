package com.truonghoaiphong2004110017.buoi3.XoayHinh;

public class XoayHinh {
    String name;
    String click;


    public XoayHinh(String name, String click) {
        this.name = name;
        this.click = click;
    }

    void xoayhinh360(){
        if(click == "click"){
            System.out.println("xoay 360 độ");
            this.phatAmThanh();
        } else {
            System.out.println("không xoay");
        }
        
    }

    void phatAmThanh(){
        System.out.println("âm thanh xoay");
    }

    void print(){
        System.out.println(name);
    }
}
