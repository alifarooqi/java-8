package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class StringImplementation {
    public static void main(String... a){
        String s2 = new String("string two");

//        System.out.println(s + s2); // Two objects

//        s = new String("new string object");

//        System.out.println("a" + 1);
//        System.out.println("a" + 1 + 2);
//        System.out.println("a" + (1 + 2));
//        System.out.println(1 + 2 + "a" + 1 + 2);
        String s = new String("string");

        // String methods
        System.out.println(s.length());

        System.out.println(s.charAt(2));

        System.out.println(s.indexOf(2)); // Negative value means it doesn't exist
        System.out.println(s.indexOf('t'));
        System.out.println(s.indexOf("tri"));
        System.out.println(s.indexOf("tri", 3));

        System.out.println(s.substring(3));
        System.out.println(s.substring(2, 4)); // [2, 4)


        System.out.println(s.startsWith("tring"));
        System.out.println(s.startsWith("st"));

        System.out.println(s.endsWith("tring"));
        System.out.println(s.endsWith("st"));


        System.out.println(s.contains("st")); // s.contains("st") == (s.indexOf("st") > 0)
        System.out.println(s.contains("STR"));


        System.out.println(s.replace('s', 'z')); // Creating a new string object
        System.out.println(s);

        System.out.println(s.replace("str", "moto"));
        System.out.println(s.replace("str", ""));
        System.out.println(s.replace("r", " "));
        String t = "  __a;;   ";
        System.out.println(t);
        System.out.println(t.trim());


        System.out.println(s.toUpperCase());
        System.out.println("  a12 IUjka jksd   ".toLowerCase().trim());


        System.out.println("   abc abc abc acb abc   ".replace(" ", ""));
//
//        /**
//         * SELECT *
//         *  FROM table
//         *  WHERE sentence IN ("some", "thing", "here")
//         */
//
//        System.out.println(
//                Arrays.toString(
//                        "some thing here".split(" ")
//                )
//        );

        System.out.println(s == "string");
        System.out.println(s.equals("string"));

        System.out.println(s.toLowerCase().equals("String".toLowerCase()));
        System.out.println(s.equalsIgnoreCase("String"));



    }
}
