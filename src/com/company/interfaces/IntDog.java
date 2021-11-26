package com.company.interfaces;

public class IntDog extends SuperClass implements InterfaceAnimal, LivingCreatures {
    public IntDog(){
        System.out.println("This is the constructor of IntDog()");
    }

    public IntDog(int averageAge){
        System.out.println("This is the constructor of IntDog(averageAge: " + averageAge + ")");
    }

    public void printAnimal() {
        System.out.println("Printing Dog");
    }

    public int returnAge() {
        return 0;
    }

    public int increaseAge(int age) {
        return 0;
    }

    public static void someStaticMethod() {
        System.out.println("Some Static Method");
    }

    // Default methods don't have to be implemented
//    public void donotTouch() {
//        InterfaceAnimal.super.donotTouch();
//    }
}
