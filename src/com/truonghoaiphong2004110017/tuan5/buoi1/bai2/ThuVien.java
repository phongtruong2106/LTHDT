package com.truonghoaiphong2004110017.tuan5.buoi1.bai2;
import java.util.Scanner;

public class ThuVien {
    private int idBook;
    private String dateAdd;
    private double unitPrice;
    private int amount;
    private String publishingHouse;

    Scanner sc = new Scanner(System.in);
    //create constructor default
    public ThuVien(){
        super();
    }

    public ThuVien(int idBook, String dateAdd, double unitPrice, int amount, String publishingHouse){
       super();
        this.idBook = idBook;
        this.dateAdd = dateAdd;
        this.unitPrice = unitPrice;
        this.amount = amount;
        this.publishingHouse = publishingHouse;
    }
    
    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }
    public int getIdBook() {
        return idBook;
    }
    public void setDateAdd(String dateAdd) {
        this.dateAdd = dateAdd;
    }
    public String getDateAdd() {
        return dateAdd;
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
    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }
    public String getPublishingHouse() {
        return publishingHouse;
    }

    @Override
    public String toString() {

        // TODO Auto-generated method stub
        return super.toString() + " ,ID Book: " + this.idBook + " ,Date Add: " + this.dateAdd + " ,Unit Price: " + this.unitPrice + " ,Amount: " + this.amount + " ,Publishing House: " + this.publishingHouse;
    }

    public void input(){
        System.out.println("input id Book: ");
        idBook = sc.nextInt();
        sc.nextLine();
        System.out.println("input Date: ");
        dateAdd = sc.nextLine();
        System.out.println("input Unit Price: ");
        unitPrice = sc.nextDouble();
        System.out.println("input amount: ");
        amount = sc.nextInt();
        System.out.println("input Publishing House : ");
        publishingHouse = sc.nextLine();     
    }

}
