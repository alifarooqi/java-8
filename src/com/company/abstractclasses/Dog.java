package com.company.abstractclasses;

public class Dog extends AbstractAnimal {
    public Dog(){
        System.out.println("Dog constructor ()");
    }

    // Overriding the abstract method (Required)
    void printAnimal() {
        System.out.println("Dog");
    }

    // Overriding the non-abstract method (Optional)
    public void makeNoise(){
        System.out.println("Bark Bark...");
    }

}
