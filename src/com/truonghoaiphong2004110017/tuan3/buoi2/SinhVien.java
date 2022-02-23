package com.truonghoaiphong2004110017.tuan3.buoi2;


public class SinhVien {
    //attributes
    private int id;
    private String hoVaTen;
    private float LT;
    private float TH;

    SinhVien(){
        
    }
    //constructor
     SinhVien(int id, String hoVaTen, float LT, float TH)
    {
        this.id = id;
        this.hoVaTen = hoVaTen;
        this.LT = LT;
        this.TH= TH;

    }
    //methods
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    public void setHoVaTen(String hoVaTen){
        this.hoVaTen = hoVaTen;

    }
    public String getHoVaTen(){
        return this.hoVaTen;
    }
    public void setDiemlT(float LT){
        this.LT = LT;
    }
    public float getDiemLt(){
        return this.LT;
    }
    public void setDiemTh(float TH){
        this.TH = TH;
    }
    public float getDiemTh(){
        return this.TH;
    }

    public float DiemTrungBinh(){
        return this.getDiemLt() + this.getDiemTh();
    }
}
