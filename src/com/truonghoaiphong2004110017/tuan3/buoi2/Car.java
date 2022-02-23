package com.truonghoaiphong2004110017.tuan3.buoi2;


public class Car {

    //
    private String carColor;
    private double carPrive = 0.0;


    //interface
    public void setCarColor(String carColor){
        this.carColor = carColor;


    }
    public String gettCarColor(){
        return this.carColor;
}
    public void setCarPrive(double carPrive){
        this.carPrive = carPrive;

    }

    public double getCarPrive(){
        return this.carPrive;
    }
}
