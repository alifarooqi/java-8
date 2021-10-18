package com.company.abstractclasses;

// This is an abstract class
// NO RELATION TO THE com.company.inheritance package

public abstract class AbstractAnimal {
    String picture;
    int averageAge = 1 + 20;

    public AbstractAnimal(){
        System.out.println("Abstract Animal constructor ()");
    }

    // Non-Abstract method
    public void makeNoise(){
        this.printAnimal();
        System.out.println("Noise...");
    }

    // Abstract method
    abstract void printAnimal();
}
