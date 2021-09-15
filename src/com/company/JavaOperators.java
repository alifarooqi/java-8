package com.company;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class JavaOperators {
    public static void main(String[] args){
        int i = 5;
        int j = 2;

        System.out.println(i/j);

        double d = 10.000001;

        System.out.println(i + d); // i is converted to double, and then added to d
        System.out.println(i/d);

        // ++ and -- operators
        // variable++ or ++variable
        int a = 5;
        int b = 5;

        System.out.println(a++);
        System.out.println(a);

        System.out.println(++b);
        System.out.println(b);

        System.out.println(a++ + 10/--a);
        // (5 + 10/--a) [ a = 6]
        // (5 + 10/5) [ a = 5 ]
        System.out.println(a);

        int c = 10;
        long c2 = 10L;

        int c3 = (int)(c * c2);
        int c4 = c * (int)c2;

//        c = c + c2;  // This won't compile
        c += c2; // c = c + c2

        int e;
        int e2 = e = 5;
        System.out.println(e);
        System.out.println(e2);

    }
}
