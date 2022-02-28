package com.truonghoaiphong2004110017.tuan3.buoi2.Shapef;



public class Amoeba extends Shape{
    private double xPoint;
    private double yPoint;


    public Amoeba(){}
    /**
     * @param xPoint the xPoint to set
     */
    public void setxPoint(double xPoint) {
        this.xPoint = xPoint;
    }

    /**
     * @param yPoint the yPoint to set
     */
    public void setyPoint(double yPoint) {
        this.yPoint = yPoint;
    }

    @Override
    public void setSound(String sound) {
        super.setSound(sound);
    }
    
    public Amoeba(String sound, double xPoint, double yPoint){
        //this.sound = sound;
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }


    @Override//thay the/ ghi de
    public void rotate() {
        System.out.println("Xoay 360 độ at xPoint: " + this.xPoint + ", yPoint " + this.yPoint);
    }

    @Override
    public void playSound() {
        System.out.println("Play sound .hif: "+ this.getSound() + " music");
    }

}
