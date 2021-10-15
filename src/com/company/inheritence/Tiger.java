package com.company.inheritence;

public class Tiger extends CatFamily {
    String name = "MY tiger";
    int averageAge = 20; // Instance variable hiding super class instance variable

    public Tiger(){
        System.out.println("Tiger constructor ()");
    }

    public String getName(){
        String name = "Ali"; // Local variable hides the instance variable
        return this.name;
    }

    public void setName(String name){ // Local variable hides the instance variable
        System.out.println(name);
        System.out.println(this.name);
    }

    public static void printSomething(){
        System.out.println("Something else");
    }
    public void printAverageAge(){
        int averageAge = 30;
        System.out.println(super.averageAge); // Created first
        System.out.println(this.averageAge); // Created after super class instance variable
        System.out.println(averageAge);
    }

    public static void main(String ...args){
        Animal t = new Tiger();
//        System.out.println(t.getName());
//        t.setName("Some name");
//
//        t.printAverageAge();

        Tiger.printSomething();
        Animal.printSomething();
        Lion.printSomething();
    }



}
