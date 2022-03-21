package com.truonghoaiphong2004110017.tuan6.buoi1;

import java.util.ArrayList;
import java.util.List;

import com.truonghoaiphong2004110017.tuan3.buoi1.dog;
import com.truonghoaiphong2004110017.tuan3.buoi2.Animal.Cat;
import com.truonghoaiphong2004110017.tuan3.buoi2.Animal.Lion;
import com.truonghoaiphong2004110017.tuan5.buoi1.Dog;
import com.truonghoaiphong2004110017.tuan5.buoi1.DogRoBo;
import com.truonghoaiphong2004110017.tuan5.buoi1.Pet;

public class DaHinhPet {
    public static void main(String[] args) {
        List<Pet> list = new ArrayList<>();
        Pet dsPet[] = new Pet[2];

        DogRoBo dogRoBo = new DogRoBo();
        Dog dog = new Dog();

        list.add(dog);
        list.add(dogRoBo);
        for(Pet pet : list){
            pet.beFriendly();
        }
    }
}
