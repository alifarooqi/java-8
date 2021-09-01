package com.company;

import java.util.Date;

public class PrimitiveTypes {
    public static void main(String[] args) {
        boolean a = false;

        // Numeric type
        byte b = 0;
        short c = 0;
        int d = 0;
        long e = 0;

        float f = 0;
        double g = 0;

        char h = '0';
        char i = '\u0000';


        int i1 = 1;
        long i2 = 1L;

        double d1 = 123.123;
        float d2 = 123.123f;


        int base8 = 077; // with 0 as prefix
        int hexa = 0x77; // with 0x as prefix
        int binary = 0b10; // with 0b as prefix

        Date x; // defaults to null

        Date y = new Date();
        y = null; // Reassign the reference variables to null

    }
}
