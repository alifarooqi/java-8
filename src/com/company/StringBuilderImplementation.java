package com.company;

import java.util.*;

public class StringBuilderImplementation {
    public static void main(String... a){
        StringBuilder sBuilder = new StringBuilder(); // String s = "";
        System.out.println(sBuilder.length());
        sBuilder.append("This is my string: "); // String s2 = s + "This is my string: "
        sBuilder.append(123);
        System.out.println(sBuilder.length());
        System.out.println(sBuilder);

        sBuilder.insert(0, "--This is inserted--"); // sBuilder.append(""--This is inserted--"")
        System.out.println(sBuilder);

        StringBuilder sBuilder2 = new StringBuilder("--This is inserted--This is my string: 123");
        System.out.println(sBuilder.equals(sBuilder2));
        System.out.println(sBuilder == sBuilder2);

        System.out.println(sBuilder.toString().equals(sBuilder2.toString()));
        System.out.println(sBuilder.toString() == sBuilder2.toString());

        // Java 11 (not part of java 8)
        System.out.println(sBuilder.compareTo(sBuilder2)); // string1 === string2 (then 0)


        System.out.println(sBuilder.charAt(5));
        System.out.println(sBuilder.substring(5, 8));
        System.out.println(sBuilder.substring(5));

        System.out.println(sBuilder.indexOf("is"));
        System.out.println(sBuilder.indexOf("is", 5));

        sBuilder.deleteCharAt(0);
        System.out.println(sBuilder);
        sBuilder.delete(3, 8); // [3,8)
        System.out.println(sBuilder);

        // Reverse
        System.out.println(sBuilder.reverse());

        StringBuffer sBuffer = new StringBuffer();
    }
}
