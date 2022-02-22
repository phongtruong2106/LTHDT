package com.truonghoaiphong2004110017.tuan3.buoi1;



public class DogTestDrive {
    public static void main(String[] args) {
        dog Dog = new dog();
        Dog.setSize(3);
        Dog.setBreed("duc");
        Dog.getName("lulu");

        System.out.println("size of dog:" + Dog.getSize() + " \nname of dog: " + Dog.getName() + " \nbreed of dog: " + Dog.getBreed());
    }
}
