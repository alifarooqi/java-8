package com.company;

public class TestClass {
    int a;
    int b;

    protected int c;

    public TestClass() {
        System.out.println("This is a constructor");
    }

    public void TestClass() { // Not a constructor (just another method)
        System.out.println("This is not a constructor");
    }
}
