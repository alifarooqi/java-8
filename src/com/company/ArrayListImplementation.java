package com.company;

import com.company.inheritence.Animal;
import com.company.inheritence.Dog;

import java.util.*;

public class ArrayListImplementation {
    public static void main(String... args){
//        ArrayList a = new ArrayList(); // Default => Initial capacity: 10; Element type: Object
//        a.add(5);
//        a.add(6);
//        a.add(7);
//        a.add("String");
//        a.add(new Animal("pic", 45));
//
//        System.out.println(a);
//
//        ArrayList b = new ArrayList(20); // Initial capacity: 20; Element type: Object
//        ArrayList c = new ArrayList(a); // Same as that of ArrayList a
//
//        ArrayList<String> d = new ArrayList(); // Initial capacity: 10; Element type: String
//        ArrayList<Integer> e = new ArrayList(); // Initial capacity: 10; Element type: Integer
//
//        // Add an element
//        d.add("Some string"); //
//        d.add("Some string else"); //
//        System.out.println(d);
//
//        // Length (Size)
//        System.out.println(d.size());
//
//        // Update
//        d.set(1, "Updated String");
//        System.out.println(d);
//
//        // Delete
//        String removedElement = d.remove(0);
//        System.out.println(removedElement);
//        System.out.println(d);
//        System.out.println(d.size());
//
//        // Contains
//        System.out.println(d.contains("ASD"));
//        System.out.println(d.contains("Updated String"));
//
//        // Clear
//        d.clear();
//        System.out.println(d);
//        System.out.println(d.size());
//
//        // Equals
//        System.out.println(a == c); // Check the memory reference
//        System.out.println(a.equals(c));



        Integer[] arr = new Integer[]{1,2,3,5, 19, 6, 3,3,3}; // Primitive Java Array (of non-primitive data type)
        int[] arr2 = {1,2,3,5, 19, 6, 3,3,3}; // Primitive Java Array (of primitive data type)

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,45,6,34,545,34,5)); // List

//        ArrayList<Integer> arrayList = Arrays.asList(arr); // Compilation Error\\

        List<String> list2 = Arrays.asList("this", "is", "some", "list");

        Arrays.sort(arr);
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));


        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
