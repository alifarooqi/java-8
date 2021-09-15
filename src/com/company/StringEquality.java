package com.company;

public class StringEquality {
    public static void main(String[] args){
        String a = new String("abcd");
        String b = new String("abcd");

        System.out.println(a == b);

        String c = a;

        System.out.println(a == c);

        System.out.println(a.equals(b));

    }
}
