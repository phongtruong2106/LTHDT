package com.truonghoaiphong2004110017.buoi3.AccoutBank;

public class AccoutTest {
    public static void main(String[] args) {
         Accout accoutCusomer = new Accout("Trương hoài phong", "Tiền Giang", 154825,0 );
         accoutCusomer.printC();
         accoutCusomer.deposit(1000000);
         accoutCusomer.withdraw(10000);

         Accout accoutEmloyee = new Accout("nguyễn văn B", 100000, 156648, 0);
         accoutEmloyee.printE();
         accoutEmloyee.luongthangnay();
         
        
    }
}
