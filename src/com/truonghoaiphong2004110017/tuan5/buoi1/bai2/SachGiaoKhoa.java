package com.truonghoaiphong2004110017.tuan5.buoi1.bai2;

public class SachGiaoKhoa extends ThuVien {
    private String status;
    private double thanhTien;
    private int n;

    public SachGiaoKhoa(){
        super();
    }

    public SachGiaoKhoa(String status, double thanhTien, int n){
        super();
        this.status = status;
        this.thanhTien = thanhTien;
        this.n = n;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setN(int n) {
        this.n = n;
    }
    public int getN() {
        return n;
    }

    public String Status(int x){
        switch(n){
            case 1: 
                status = "Old Book";
                break;
            case 2:
                status = "New Book";
                break;
            default:
                System.out.println("error! again");
        }
        return status;
    }

    public void input(){
        super.input();
        System.out.println("choice status Book: (1 Old Book) (2 New Book)");
        n = sc.nextInt();
    }

    public double thanhTien(){
        if(status == "Old Book"){
            thanhTien = (this.getAmount() * this.getUnitPrice() * 50) /100;
        }else{
            thanhTien = this.getAmount() + this.getUnitPrice();
        }
        return thanhTien;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " ,Status: " + this.Status(n)+ " ,Thành Tiền: " + thanhTien();
    }

}
