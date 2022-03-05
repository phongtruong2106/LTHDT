package com.truonghoaiphong2004110017.tuan3.bai4;

public class Account {
    private long soTK;
    private String tenTk;
    private double soTienTrongTk;

    public Account(){}

    public Account(long soTK, String tenTk, double soTienTrongTk){
        this.tenTk = tenTk;
        this.soTK = soTK;
        this.soTienTrongTk = soTienTrongTk;
    }

    public void setSoTk(long soTK){
        this.soTK = soTK;
    }
    public long getSoTK(){
        return this.soTK;
    }
    public void setTenTK(String tenTK){
        this.tenTk = tenTK;
    }
    public String getTenTK(){
        return this.tenTk;
    }
    public void setSoTienTrongTK(double soTienTrongTk){
        this.soTienTrongTk = soTienTrongTk;
    }
    public double getSoTienTrongTK(){
        return this.soTienTrongTk;
    }

    public String toString(){
        String str = " số tài khoản" + this.soTK + " \n tên Tài Khoản: " + this.tenTk + " \n số tiền còn trong tài khoản: " + this.soTienTrongTk; 
        return str;
    }
}
