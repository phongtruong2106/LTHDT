package com.truonghoaiphong2004110017.tuan3.buoi2.bai4;

import java.util.Scanner;

public class Account {
    //khai báo các thuộc tính 
    private long soTK;
    private String tenTk;
    private double soTienTrongTk;
    Scanner sc= new Scanner(System.in);

    //khởi tạo contructor mặc đinh
    public Account(){}

    //khởi tạo constructor tham số
    public Account(long soTK, String tenTk, double soTienTrongTk){
        this.tenTk = tenTk;
        this.soTK = soTK;
        this.soTienTrongTk = soTienTrongTk;
    }
    //get and set
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
    //toString
    public String toString(){ 
        String str = " số tài khoản: "+ soTK + "\n tên tài khoản: " + tenTk + " \n số tiền trong tài khoản: " + soTienTrongTk;
        return str;
    }
    //các phương thức 
    public double napTien(){
        double napTien;
        System.out.println("nhập số tiền muốn nạp: ");
        napTien = sc.nextDouble();
        //số tiền nạp vào lớn hơn 0 
        if(napTien >= 0 ){
            soTienTrongTk = napTien + soTienTrongTk;
            System.out.println("bạn vừa nạp " + napTien + " vào tài khoản.");
        } else {
            //ngược lại nếu số tiền bé hơn 0 thì không hợp lệ
            System.out.println("Số tiền nạp vào không hợp"); 
        }
        return napTien;
    }

    public double rutTien(){
        double rut;
        double phiRut = 10.000;
        System.out.println("nhập số tiền muốn rút: ");
        rut = sc.nextDouble();
        // số tiền rút <= số tiền trong tài khoản + phí
        if(rut <= (soTienTrongTk - phiRut)){
            soTienTrongTk = soTienTrongTk - (rut + phiRut);
            System.out.println("bạn vừa rút: " + rut +  " từ tài khoản .phí là 10.000");

        } else {
            System.out.println("số tiền rút không hợp lệ");
            return rutTien();
        }

        return rut;
    }

    //khởi tạo phương thức in màn hình 
    public void print(){
        System.out.printf("%-10d %-20s %-20s",soTK, tenTk, soTienTrongTk);
    }
}
