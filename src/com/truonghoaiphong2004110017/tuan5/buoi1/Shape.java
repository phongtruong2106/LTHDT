package com.truonghoaiphong2004110017.tuan5.buoi1;

abstract public class Shape {
    protected int x, y;
    Shape(int _x, int _y){
        x = _x;
        y = _y;
    }
    abstract public void drawn();
    abstract public void erase();
    public void moveTo(int _x, int _y){
        erase();
        x = _x;
        y = _y;
        drawn();
    }
}
