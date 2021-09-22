package com.company;

public class MultiDimArray {
    public static void main(String[] args) {
        int[][] a = new int[5][];

//        a[0]; // Null

        char[] list = "xo_xo_xoo".toCharArray();

        System.out.println("---------------");
        for (int j=0; j<3; j++){
            System.out.println(Character.toString(list[0 + j*3]) + list[1 + j*3] + list[2 + j*3]);
        }

        System.out.println("---------------");
        for (int j=0; j<3; j++){
            for (int k=0; k<3; k++){
//                System.out.print(Character.toString(list[k + j*3]));
                System.out.print("J=" + j + " K=" + k);
                System.out.println(" SUM=" + (k + j*3));
            }
            System.out.println("");
        }


    }
}
