package com.truonghoaiphong2004110017.tuan3.buoi2;

public class CarTestDrive {
    public static void main(String[] args) {
        Car car = new Car();
        car.setCarPrive(10000);
        car.setCarColor("blue");
        System.out.println("prive: " + car.getCarPrive() + " \n color: " + car.gettCarColor());
    }
}
