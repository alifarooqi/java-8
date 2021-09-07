package com.company;

public class JavaOperators {
    public static void main(String[] args){
        int i = 5;
        int j = 2;

        System.out.println(i/j);

        double d = 10.000001;

        System.out.println(i + d); // i is converted to double, and then added to d
        System.out.println(i/d);

    }
}
