package com.company;

public class StaticKeyword {

    public static void main(String[] args) {
//        System.out.println(StaticKeyword.count);
//
//        StaticKeyword sk = new StaticKeyword();
//        System.out.println(sk.count); // Alternate way of accessing static variables
//        System.out.println(sk.instanceVariable); // Alternate way of accessing static variables
//        System.out.println(StaticKeyword.count);
//
//        StaticKeyword sk2 = new StaticKeyword();
//        System.out.println(sk2.count); // We normally don't do this
//        System.out.println(sk2.instanceVariable); // We normally don't do this
//        System.out.println(StaticKeyword.count);
//        System.out.println(sk.instanceVariable); // We normally don't do this


        System.out.println(StaticKeyword.staticMethod(56));
        StaticKeyword sk3 = new StaticKeyword();
        System.out.println(sk3.staticMethod(566));
        System.out.println(StaticKeyword.count);
    }

    public static int count = 0;
    public int instanceVariable; // Instance as it has no keyword instance

    public static int staticMethod(int arg){
        System.out.println("This is inside the static method: " + arg);
        count += 10;
//        instanceVariable += 10; // Instance variables cannot be accessed or modified within a static method
        return arg;
    }

    public StaticKeyword(){
        count++;
        instanceVariable = count;
    }

    public int getInstanceVariable(){
        if (instanceVariable != count){
            System.out.println("Count is not the same as instance variable");
        }
        return instanceVariable;
    }
}
