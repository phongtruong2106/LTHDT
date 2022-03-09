package com.truonghoaiphong2004110017.tuan4.buoi8;

public class Cow extends Animal{
    double giveMilk;
    public Cow(){
        super();
        this.giveMilk = 500;
    }
    public Cow(double giveMilk, String name){
        super(name);
        this.giveMilk = giveMilk;
    }
    @Override
    public String toString() {
        return "Cow [giveMilk =" + giveMilk + "]" + " Name: " + this.getName() + " " + super.toString();
    }
}
