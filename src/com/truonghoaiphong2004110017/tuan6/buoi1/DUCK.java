package com.truonghoaiphong2004110017.tuan6.buoi1;
import static java.lang.System.*;
public class DUCK {
    private int size;
    private String name;
    public static int dem = 0;

//khoi static
static{
    out.println("lew lew");
}

    public DUCK(int size){
        this.size = size;
        demVit();//dùng chung cho tất cả object cùng 1 class
    }
    public static int getDem() {
        return dem;
    }
    public static void setDem(int dem) {
        DUCK.dem = dem;
    }

    private void demVit(){
        dem++;
    }

    public DUCK(){
        demVit();
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
}
