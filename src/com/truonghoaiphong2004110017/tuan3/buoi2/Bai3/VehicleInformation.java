package com.truonghoaiphong2004110017.tuan3.buoi2.Bai3;

public class VehicleInformation {
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private double gia;

    VehicleInformation(){}

    VehicleInformation(String tenChuXe, String loaiXe, int dungTich, double gia){
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich =dungTich;
        this.gia = gia;
    }
    
    public void setTenChuXe(String tenChuXe){
        this.tenChuXe = tenChuXe;
    }

    public String getTenChuXe(){
        return this.tenChuXe;
    }

    public void setLoaiXe(String loaiXe){
        this.loaiXe = loaiXe;
    }
    public String getLoaiXe(){
        return this.loaiXe;
    }
    public void setDungTich(int dungTich){
        this.dungTich = dungTich;
    }
    public int getDungTich(){
        return this.dungTich;
    }
    public void setGia(double gia){
        this.gia = gia;
    }
    public double getGia(){
        return this.gia;
    }


    public String toString(){
        String str = " Tên chủ xe: " + this.tenChuXe + " \n loại xe: " + this.loaiXe + " \n dung tích: " + this.dungTich + " \n giá xe: " + this.gia; 
        str += "thuế xe (100cc 1%), (100cc -> 200cc 3%), (> 200cc 5%)" + this.thueXe();
        return str;
    }
    public double thueXe(){
        double thueXe;
        if(dungTich <= 100)
         thueXe = gia * 1 / 100;
        else
        if(this.dungTich >= 100 && this.dungTich <= 200){
         thueXe = gia * 3 / 100;
        }
        else
        thueXe = gia * 5 / 100;
        return thueXe;
    }
    

    
}
