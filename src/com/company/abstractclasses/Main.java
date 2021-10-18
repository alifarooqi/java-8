package com.company.abstractclasses;

import com.company.inheritence.Animal;

public class Main {
    public static void main(String[] args){
//        AbstractAnimal a = new AbstractAnimal(); // Cannot create an object of abstract class
//        Animal b = new Animal(); // Non-abstract class: create an object
//
//        AbstractAnimal a = new Dog();
//        a.makeNoise();

        AbstractAnimal l1 = new Lion();
        CatFamily      l2 = new Lion();
        Lion           l3 = new Lion();

        l1.printAnimal();
        l1.printFurType();
        l1.hunt();

        l2.printFurType();
        l2.hunt();

        l3.hunt();

    }
}
