package com.truonghoaiphong2004110017.tuan5.buoi1.bai3;

import java.util.Scanner;

public class ManagementTransaction {
    private int id;
    private String dateTransaction;
    private double unitPrice;
    private int amount;

    Scanner sc = new Scanner(System.in);

    public ManagementTransaction(){
        super();
    }

    public ManagementTransaction(int id, String dateTransaction, double unitPrice, int amount){
        super();
        this.id = id;
        this.dateTransaction = dateTransaction;
        this.unitPrice = unitPrice;
        this.amount = amount;
        
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDateTransaction(String dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public String getDateTransaction() {
        return dateTransaction;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }

    public void input(){
        System.out.println("input id transaction: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("input date transaction: ");
        dateTransaction = sc.nextLine();
        System.out.println("input unit price: ");
        unitPrice = sc.nextDouble();
        System.out.println("input amount: ");
        amount = sc.nextInt();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " ,id transaction: " + this.id + " ,date transaction: " + this.dateTransaction + " ,unit price: " + this.unitPrice + " ,amount: " + this.amount;
    }
}
