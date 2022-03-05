package com.truonghoaiphong2004110017.tuan3.buoi2;

import java.util.Scanner;

public class SinhVien {
    //attributes
    private int id;
    private String hoVaTen;
    private float LT;
    private float TH;
    Scanner sc = new Scanner(System.in);
    public SinhVien(){
        
    }
    //constructor
    public SinhVien(int id, String hoVaTen, float LT, float TH)
    {
        this.id = id;
        this.hoVaTen = hoVaTen;
        this.LT = LT;
        this.TH= TH;

    }
    //methods
    public void setId(){
        int id;
        System.out.println("- nhập mssv: ");
        id = sc.nextInt();
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setHoVaTen(){
        String hoVaTen;
        System.out.println("Nhập họ và tên: ");
        sc.nextLine();
        hoVaTen = sc.nextLine();
        this.hoVaTen = hoVaTen;

    }
    public String getHoVaTen(){
        return hoVaTen;
    }
    public void setDiemlT(){
        float LT;
        System.out.println("nhập điểm lt: ");
        LT = sc.nextFloat();
        this.LT = LT;
    }
    public float getDiemLt(){
        return LT;
    }
    public void setDiemTh(){
       float TH;
       System.out.println("nhập điểm TH: ");
       TH =sc.nextFloat();
       this.TH =TH;
    }
    public float getDiemTh(){
        return TH;
    }

    public float DiemTrungBinh(){
        return (this.LT + this.TH)/2;
    }
    public String toString(){
        String str = " MSSV: " +  this.id + " \n Họ và Tên: " + this.hoVaTen + " \n điểm LT: " + this.LT + " \n điểm TH: " + this.TH + " \n Điểm trung bình: %5.2f" + this.DiemTrungBinh(); 
        return str;
    }
}
