package com.company.exceptions;

import java.util.Random;

public class Main {
    public static void throwException(int i)
            throws RuntimeException {
        switch (i) {
            case 1: throw new RuntimeException("This is the runtime exception message");
            case 2: throw new ArithmeticException("Division by zero is not allowed");
            case 3: throw new Error();
//            case 4: throw new Throwable();
        }
    }

    public static int makeRequest() throws NetworkException {
        return request();
    }

    public static int request() throws NetworkException {
        Random rand = new Random();
        int i = rand.nextInt(10);
        if(i > 5){
            return i / 0; // Throws an ArithmeticException (division by zero)
        }
        else if (i > 3) {
            NetworkException e = new NetworkException("hostname.com", "prod", "abc");
            throw e; // Explicit
        }
        else {
//            ArithmeticException e = new ArithmeticException("There was an exception in calculations");
//            throw e;
            return i;
        }
    }

    public static void main(String... a){
        System.out.println("Hello World");

//        int i = 1;
//
//        try {
//            throwException(i);
//        }
//        catch (ArithmeticException r){
//            System.out.println("Caught Runtime exception");
//            System.out.println(r.getMessage());
//        }
//        int response6 = request();

        try {
            int response = request();
            System.out.println("Network response: " + response);

            int response2 = request();


            int response3 = request();


            int response4 = request();


            int response5 = request();
        }
        catch (NetworkException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getHostname());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Goodbye World");
        }
    }
}

/*
    Call Stack:
                method3() // Throws an error (doesn't have any try/catch)
                method2() // The error is passed down the call stack (look for an error handler)
                method1() // Passed down here
                main() // Passed down here

 */