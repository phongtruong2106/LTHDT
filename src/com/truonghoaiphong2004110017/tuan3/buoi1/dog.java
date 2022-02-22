package com.truonghoaiphong2004110017.tuan3.buoi1;

public class dog {
    
    //altribute
   private int size;
   private String breed;
   private String name;

    //method??

    public void setSize(int size){
        if(size > 0){
            this.size = size;
        } else {
            System.out.println("Size không hợp lệ");
        }
        
    }
    public int getSize(){
        return this.size;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getBreed(){
        return this.breed;
    }

    //
    public void getName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
