package com.truonghoaiphong2004110017.tuan4.buoi8;

public class Animal {
    private String name;
    
    public  Animal(){
        this.name = "CoBe";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Animal(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal [Name: " + name + "]";
    }
}
