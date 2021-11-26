package com.company.inheritence;

public class Animal {
    public String picture;
    public int averageAge;

    public Animal(){
        System.out.println("Animal constructor ()");
    }

    public Animal(String picture, int averageAge){
        System.out.println("Animal constructor (picture, averageAge)");
        this.picture = picture;
        this.averageAge = averageAge;
    }

    public static void printSomething(){
        System.out.println("Something");
    }

    public String makeNoise() throws Exception {
        return "Noise";
    }

    public Animal makeNewAnimal(){
        return new Animal();
    }

    public String toString(){
        return "Animal: " + this.picture + ", " + this.averageAge;
    }

}
