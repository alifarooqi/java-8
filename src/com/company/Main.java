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

    }

}
