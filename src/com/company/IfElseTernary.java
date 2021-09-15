package com.company;

public class IfElseTernary {
    public static void main(String[] args){
        int x;
        int y = ( x = 5 ) + 2;
//          y = (   5   ) + 2;
//          y = 7;

        System.out.println(x > y);

        if (x > y) {
            System.out.println(x--);
        } else {
            System.out.println(--y);
        }

        System.out.println("X: " + x); // X: 4
        System.out.println("Y: " + y--); // Y:

        short z = x > y ? (short) 4 : (short) 20;

        System.out.println(z);


    }
}
