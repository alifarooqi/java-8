package com.company;

public class ScopeOfVariables {
    public static void main(String[] args) {
        int localVariable = 5; // Primitive

        System.out.println(localVariable);

        System.out.println(ScopeOfVariables.classVariable);
        System.out.println(classVariable);

        ScopeOfVariables v = new ScopeOfVariables(); // Local Variable (Non-primitive)

        if (v.instanceVariable) {
            System.out.println("Instance Variable is true");
        }

        for (int i=0; i < 5; i++) {

            ScopeOfVariables x = new ScopeOfVariables();

            System.out.println(x.instanceVariable);
            System.out.println(x.instanceVariable2);

        }
//        System.out.println(x.instanceVariable2); // Will not work
        System.out.println(v.instanceVariable2);

    }


    // Instance Variable (part of the Object)
    boolean instanceVariable = true;
    double instanceVariable2;

    // Static/Class variables
    static int classVariable = 8;


    // Constructor
    public ScopeOfVariables(){
        int localVariable2 = 10;
//        System.out.println(localVariable); // Out of scope
        System.out.println(localVariable2); // Within scope

        // keyword this is optional, but we use it with instance variables
        this.instanceVariable2 = localVariable2;
        instanceVariable2 = 20.56;

        System.out.println(ScopeOfVariables.classVariable);
        System.out.println(classVariable);

    }

}
