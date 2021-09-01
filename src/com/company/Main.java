package com.company;

import java.util.Date; //Explicit import
import java.sql.*; // Implicit import

import java.lang.*; // Redundant

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world");

        Date d = new Date();

        java.sql.Date d2 = new java.sql.Date(123123123);

        int Boolean = 12;
        System.out.println(Boolean);

        String a = "jasd";

        TestClass t = new TestClass();
        t.a = 100; // Write
        t.b = 50; // Write
        System.out.println(t.a + t.b); // Read
        new TestClass();
        t.TestClass();

    }

}
