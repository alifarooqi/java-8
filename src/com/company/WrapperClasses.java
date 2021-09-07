package com.company;

public class WrapperClasses {
    public static void main(String[] args){
        Integer i = 1; // i is actually of wrapper class Integer --> 1 int
        int j = 10;

        i = j; // Auto-boxing (int -> Integer)

        j = i; // Auto-boxing (Integer --> int)

        Integer myInt = new Integer(25); // Creating a new Integer Object (not via autoboxing)

        System.out.println(myInt + 25);


        int t = 10;
        String ten = Integer.toString(t);
        System.out.println(t);
        System.out.println(ten);

        Boolean b = new Boolean(true);
        boolean b2 = b.booleanValue(); // Redundant (as we can use Java's autoboxing)

        boolean b3 = Boolean.parseBoolean("true");
        System.out.println(b3);

        Number n = new Double(12.56);
    }
}
