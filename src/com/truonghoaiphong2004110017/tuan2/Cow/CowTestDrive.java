package com.truonghoaiphong2004110017.tuan2.Cow;

public class CowTestDrive {
    public static void main(String[] args) {
        Cow bo1 = new Cow();
        bo1.Name = "bò sữa";
        bo1.Color = "đen trắng";
        bo1.canNang = "45kg";
        bo1.eat();
        bo1.print();

        System.out.println("_________");
        
        Cow bo2 = new Cow();
        bo2.Name = "bò sữa";
        bo2.Color = " nâu";
        bo2.canNang = "50kg";
        bo2.eat();
        bo2.print();

    }
}
