package com.company;

public class PrimitiveType {
    public static void main (String... args){
        int i = 10;
        TestClass t = new TestClass();
        t.a = 10;
        t.b = 20;

        increaseBy10(i);
        System.out.println(i);

        increaseBy10(t);
        System.out.println(t.a);
    }

    static int increaseBy10(int j){
        j++;
        return j;
    }

    static int increaseBy10(TestClass j){
        j.a += 10;
        return j.a;
    }
}