package com.company.interfaces;

public class Main {
    public static void printLivingAge(LivingCreatures l) {
        System.out.println(l.age);
    }

    public static void printAnimalPicture(InterfaceAnimal a) {
        System.out.println(a.picture);
    }

    public static void main(String... a){
        System.out.println(InterfaceAnimal.count);

        IntDog d = new IntDog();
//        d.printSuperClassMethod(); // SuperClass
//        d.printAnimal(); // AnimalInterface (body in IntDog)
//        d.donotTouch(); // AnimalInterface (default)
//        System.out.println(d.age);

        printAnimalPicture(d);
        printLivingAge(d);
    }
}
