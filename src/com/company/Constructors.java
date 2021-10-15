package com.company;

public class Constructors {
    String name;
    int age;

    public Constructors(String name, int age){
        this.name = name;
        this.age = age;
    }
    // Static Initializer of the parent class (#1)
    static {
        System.out.println("Inside the static initializer of Constructors");
    }


    public Constructors(){
//        this.name = "Some name";
//        this.age = 10;
//        System.out.println("auhgsdkj"); // This will throw out the error
        this("Some name", 100); // Line 7
        System.out.println("Inside the constructor of the Constructors class");
    }

    public Constructors(String name){
        this(name, 100); // Line 7
    }

    public Constructors(int age){
        this("Some name", age); // Line 7
    }

    public static void main(String... args){
        Constructors c = new Constructors(); // Line 12
        System.out.println(c.name);
        System.out.println(c.age);

        Constructors c2 = new Constructors("Ali", 123); // Line 7
        System.out.println(c2.name);
        System.out.println(c2.age);

        Constructors c3 = new Constructors("Ali 2"); // Line 18
        System.out.println(c3.name);
        System.out.println(c3.age);

        Constructors c4 = new Constructors(12); // Line 22
        System.out.println(c4.name);
        System.out.println(c4.age);
    }
}
