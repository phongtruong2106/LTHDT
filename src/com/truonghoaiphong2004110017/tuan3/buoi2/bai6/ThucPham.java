package com.truonghoaiphong2004110017.tuan3.buoi2.bai6;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ThucPham implements Serializable{
    private String id;
    private String name;
    private double donGia;
    private Date nSX, nHH;

  //khởi tạo constructor
    public ThucPham(String id){
        this.setMaHang(id);
    }

    //set and get
    private void setMaHang(String id){
        if (id != null){
             this.id = id;
        } else {
            System.out.println("không được để rỗng");
        }
       
    }
    public String getMaHang(){
        return this.id;
    }

    public void setTenHang(String name){
        if( name != null){
            this.name = name;
        } else {
            System.out.println("không được để rỗng");
        }
        
    }
    public String getTenHang(){
        
        return this.name;
    }

    public void setDonGia(double donGia){
        if(donGia > 0){
            this.donGia = donGia;
        } else {
            System.out.println("không hợp lệ");
        }
        
    }
    public double getDonGia(){
        return this.donGia;
    }

    public void setNSX(Date nSX){
        if(nSX != null){
            this.nSX = nSX;
        } else {
            System.out.println("không được để rỗng!!");
        }
        
    }
    public Date getNSX(){
        return this.nSX;
    }

    public void setNHH(Date nHH){
        if(nHH != null){
             if(nHH.after(nSX)){
             this.nHH = nHH;
        } else {
            System.out.println("ngày hết hạn phải sau ngày sản xuất!1");
        }
        } else {
            System.out.println("không được để rỗng!!");
        }
       
       
    }

    public Date getNHH(){
        return this.nHH;
    }

    @Override
    public String toString() {
        //dd//MM/yyyy
        SimpleDateFormat ngayVn = new SimpleDateFormat("dd/mm/yyyy");

        //n

        return "ThucPham [donGia=" + donGia + ", id=" + id + ", nHH=" + ngayVn.format(nHH) + ", nSX=" + ngayVn.format(nSX) + ", name=" + name + "]";
    }

    public ThucPham(String id, String name, double donGia, Date nSX, Date nHH) {
        this.setMaHang(id);
        this.name = name;
        this.donGia = donGia;
        this.nSX = nSX;
        this.setNHH(nHH);
    }

    public boolean kiemTraHSD(){
        boolean isHetHan = false;
        Date ngayHienTai = new Date();
        if(nHH.before(ngayHienTai)){
            isHetHan = true;
        }
        return isHetHan;
    }

    

}
