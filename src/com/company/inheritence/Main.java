package com.company.inheritence;

import com.company.ForLoops;

public class Main {
    public static void main(String ...args){
//        Animal a = new Animal();
//        Animal b = new Animal("Pic", 20);
//        Dog d = new Dog("pic", 12);
//        System.out.println(d.picture);
//        System.out.println(d.averageAge);
//        Tiger t = new Tiger();
//        Lion l = new Lion();
//        Animal a = new Tiger(); // Polymorphism
//        Tiger b = new Animal(); // Will throw a compilation error

//        Animal a = new Animal();
//        System.out.println(a.averageAge);
//        Animal b = new Dog();
//        System.out.println(b.averageAge);
//        System.out.println(b.getRandomNumber());

//        Object c = new Dog();
//        System.out.println(c.averageAge);

//        Lion l = new Lion();
//        l.purr();
//
//        Tiger t = new Tiger();
//        t.purr();
//
//        CatFamily cf = new Tiger();
//        cf.purr();
//
//        Animal t2 = new CatFamily(); // Ref variable: superclass; Object: subclass (No need to cast)
//
//        // t2 => Ref variable: Animal
//        CatFamily cf2 = (CatFamily) t2; // Down casting
//        // Casting doesn't change the type of reference variable, just casts the type of Variable
//        cf2.purr();

        Animal a1 = new Tiger();
        CatFamily cf1 = (CatFamily) a1;
        Dog d = (Dog) a1;





    }
}
