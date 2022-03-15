package com.truonghoaiphong2004110017.tuan5.buoi1;

public class Circle extends Shape{

    private int radius;
    
    public Circle(int _x, int _y, int _r) {
        super(_x, _y);
        radius = _r;
    }

    @Override
    public void drawn() {
        System.out.println("Draw circle at " + x + "," + y);
    }

    @Override
    public void erase() {
        System.out.println("erase circle at" + x + "," + y);
    }
    
}
