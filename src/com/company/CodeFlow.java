package com.company;

// Superclass: Constructors
public class CodeFlow extends Constructors {
    static int a; // (#2)
    int b; // (#4)

    // Static Initializer (#3)
    static {
        System.out.println("Inside the static initializer of CodeFlow");
        a = 100;
        System.out.println(a);
    }

    // Instance Initializer (#5)
    {
       b = 50;
       System.out.println("Inside the instance initializer " + b);
    }

    CodeFlow(){
        System.out.println("Inside the Constructor of CodeFlow"); // (#6)
    }

    public static void main(String[] args){
        System.out.println("Start of main");
        CodeFlow c = new CodeFlow();
    }

}
