package com.truonghoaiphong2004110017.tuan5.buoi1.bai3;

public class TradingGold extends ManagementTransaction{
    private String kingOfGold;
    private double thanhTien;

    public TradingGold(){
        super();
    }
    public TradingGold(String kingOfGold, double thanhTien){
        super();
        this.thanhTien =thanhTien;
        this.kingOfGold =kingOfGold;
    }

    public void setKingOfGold(String kingOfGold) {
        this.kingOfGold = kingOfGold;
    }

    public String getKingOfGold() {
        return kingOfGold;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public double thanhTien(){
        return thanhTien = this.getAmount() + this.getUnitPrice();
    }

    public void input(){
        super.input();
        System.out.println("input king of gold: ");
        kingOfGold = sc.nextLine();
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " ,king of gold" + this.kingOfGold + " ,Thành tiền" + this.thanhTien();
    }
}
