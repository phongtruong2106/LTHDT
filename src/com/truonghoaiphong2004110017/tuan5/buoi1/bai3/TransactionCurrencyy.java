package com.truonghoaiphong2004110017.tuan5.buoi1.bai3;

public class TransactionCurrencyy extends ManagementTransaction{
    private double exchangeRate;
    private String currency;
    private int n;
    private double thanhTien;

    public TransactionCurrencyy(){
        super();
    }
    public TransactionCurrencyy(double exchangeRate, String currency, int n, double thanhTien){
        super();
        this.exchangeRate = exchangeRate;
        this.currency = currency;
        this.n = n;
        this.thanhTien =thanhTien;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
    public double getExchangeRate() {
        return exchangeRate;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getCurrency() {
        return currency;
    }
    public void setN(int n) {
        this.n = n;
    }
    public int getN() {
        return n;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
    public double getThanhTien() {
        return thanhTien;
    }
    public String Currency(int x){
        switch(n){
            case 1: 
                currency = "USD";
                break;
            case 2:
                currency = "Euro";
                break;
            case 3:
                currency = "VietNam";
                break;
            default:
                System.out.println("error! again");
        }
        return currency;
    }

    public void input(){
        super.input();
        System.out.println("input exchang rate: ");
        exchangeRate =sc.nextInt();
        System.out.println("choice currency: (1 USD) (2 EURO) (3 VIETNAM)");
        n = sc.nextInt();
    }

    public double ThanhTien(){
        if(currency == "USD, EURO"){
            thanhTien = this.getAmount() * this.getUnitPrice() * this.getExchangeRate();
        } else {
            thanhTien = this.getAmount() * this.getUnitPrice();
        }
        return thanhTien;
    }
}
