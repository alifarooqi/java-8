package com.company.interfaces;

// Not a class
// All interfaces are abstract => abstract keyword is optional
public interface InterfaceAnimal {
    String picture = null;
    int averageAge = 0;

    static int count = 0;
    static final double PI = 3.142;

    public void printAnimal(); // Abstract method

    public int returnAge(); // Abstract method

    public abstract int increaseAge(int age); // Abstract method

    // Interface abstract methods cannot have body
/*
    public String printAnimal2(){
        return "Hello";
    };
*/

    default void donotTouch(){
        System.out.println("Don't touch my computer");
    }


}
