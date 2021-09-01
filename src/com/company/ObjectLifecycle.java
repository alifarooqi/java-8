package com.company;

import java.util.Date;

public class ObjectLifecycle {
    public static void main(String[] args){
        ObjectLifecycle objRef = new ObjectLifecycle(); // objRef --> object3
        objRef.demo();
        System.gc(); // Calling Garbage Collection (object2)

        objRef = new ObjectLifecycle(); // objRef --> object4
        // Memory Heap: [object3, object4]
        System.gc(); // Calling Garbage Collection (object3)

        // Memory Heap: [object4]

    }

    protected void finalize() {
        System.out.println("In finalize method");
    }

    private void demo() {
        Date ref1 = new Date(); // ref1 --> object1
        Date ref2 = new Date(); // ref2 --> object2
        Date ref3 = ref1;       // ref3 --> object1
        Date ref4 = ref2;       // ref4 --> object2
        // Memory heap: [object1, object2]


        ref1 = null; // Removing the reference
        // Memory heap: [object1, object2]

        ref3 = null; // object1 becomes eligible for Garbage Collection
        // Memory heap: [object1, object2]

        System.gc(); // Calling Garbage Collection (object1)
    }
}
