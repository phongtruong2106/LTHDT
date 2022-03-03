package com.truonghoaiphong2004110017.tuan3.buoi2.Animal;

public class AnimalTestDrive {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
        lion.makeNoise();
        lion.sleep();
        lion.roam();

        //cat
        Cat cat = new Cat();
        cat.eat();
        cat.makeNoise();
        cat.sleep();
        cat.chaseButerfly();

        //wolf
        Wolf wolf = new Wolf();
        wolf.eat();
        wolf.sleep();
        wolf.makeNoise();

        //Hippo
        Hippo hippo = new Hippo();
        hippo.eat();
        hippo.sleep();
        hippo.makeNoise();
        hippo.Submersed();

        //Tiger
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.RunSpeed();
        tiger.sleep();
        tiger.roam();

}
}