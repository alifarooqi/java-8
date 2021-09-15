package com.company;

public class OneDimArray {
    public static void main(String[] args) {
        int[] intArr = new int[10]; // Size of this array is 10

        for(int i: intArr){
            System.out.print(i + ", ");
        }

        System.out.println("");

        int[] intArr2 = new int[]{1,2,3,4,5}; // Size of this array would be 5
        for(int i: intArr2){
            System.out.print(i + ", ");
        }


    }
}
