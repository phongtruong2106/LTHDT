package com.truonghoaiphong2004110017.tuan1;

public class AccoutTest {
    public static void main(String[] args) {
        Accout account = new Accout();
        account.show();
        account.deposit(500);
        account.show();
        account.withdraw(200);
        account.show();

        Cusomerr cusomerr = new Cusomerr();
        cusomerr.input();
       
        Emloye emloye = new Emloye();
        emloye.input();


        cusomerr.output();
        emloye.output();
    }
}
