package com.truonghoaiphong2004110017.KiemTraCuoiKi;

public abstract class Kho {
    private String maHang;
    private String tenHang;
    private int soLuongTon; 
    private double donGia;


    public Kho(String maHang){
        this.setmaHang(maHang);
    }

    public Kho(String maHang, String tenHang, int soLuongTon, double donGia){
        this.setmaHang(maHang);
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
    }

    //get and set
    private void setmaHang(String maHang){
        if(maHang != null){
            this.maHang = maHang;
        } else {
            System.out.println("không được để rỗng");
        }
    }

    public void setTenHang(String tenHang) {
        if(tenHang != null){
            this.tenHang = tenHang;
        } else {
            System.out.println("không được để rỗng");
        }
    }

    public void setSoLuongTon(int soLuongTon) {
        if(soLuongTon >= 0){
            this.soLuongTon = soLuongTon;
        } else {
            System.out.println("error!! input again");
        }
    }

    public void setDonGia(double donGia) {
       if(donGia > 0 ){
           this.donGia = donGia;
       } else {
           System.out.println("error!! input again");
       }
    }


    public abstract float Vat();


    @Override
    public String toString() {
        return "Kho [donGia=" + donGia + ", maHang=" + maHang + ", soLuongTon=" + soLuongTon + ", tenHang=" + tenHang
                + "]";
    }

    
}   
