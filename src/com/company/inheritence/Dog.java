package com.company.inheritence;

public class Dog extends Animal {
    // Overriding instance variable
    public int averageAge = 10;

    public Dog() {
        super(); // Redundant line of code
        System.out.println("Dog constructor ()");
//        System.out.println(this.averageAge);
//        System.out.println(super.averageAge);
    }

    public Dog(String picture, int averageAge){
        super(picture, averageAge); // Explicit call
        System.out.println("Dog constructor (picture, averageAge)");
        System.out.println(this.picture);
        System.out.println(this.averageAge);
    }

    // This is simple overriding of the method
    public String makeNoise() throws ArithmeticException {
        if (this.averageAge < 0)
            throw new ArithmeticException();

        return "Bark";
    }

    // Overriding
    public Tiger makeNewAnimal(){
        return new Tiger();
    }

    public int getRandomNumber() { return 5; }


}
