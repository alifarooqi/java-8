package com.company;

public class ForLoops {
    public static void main(String[] args) {
        int count = 0;

        // Normal For Loop
        for (int i=0; i<5; i++) {
            System.out.println("Hello " + i);
        }

        int[] a = {10,9,8,7,6};

        // Printing out the elements of the array
        // 1. Normal for loop
        for (int i=0; i < a.length; i++) {
            System.out.println("I = " + i); // i is the Index of the array
            System.out.println("Normal: " + a[i]); // i is the Index of the array
        }

        // 2. Enhanced For loop
        for (int i: a) {
            System.out.println("I = " + i);
            System.out.println("Enhanced: " + i); // i is the Element in the array
        }
    }
}
