package com.truonghoaiphong2004110017.tuan3.buoi2;

public class HinhChuNhat {


    //altribute
    private float chieuDai;
    private float chieuRong;

    //interface

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }

    public String toString(){
        String str = "chiều dài: " + this.chieuDai + " \n chiều rộng: " + this.chieuRong;
        str += "diện tich: " + this.DienTich() + " \n chu vi: " + this.chuVi();

        return str;
    }

    public float tinhChuvi(){
         return (chieuDai + chieuRong) * 2;
     }

    public float DienTich(){
         return this.chieuDai * this.chieuRong;
     }
     public float chuVi(){
         return (this.chieuDai + this.chieuRong) *2;
     }

   
}
