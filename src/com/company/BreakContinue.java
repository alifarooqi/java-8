package com.company;

public class BreakContinue {
    public static void main(String[] args) {
        String a[] = {"a", "b", "c", "d", "e"};
//        for(int i = 0; i< a.length; i++){
//            if(i%2 == 0) {
//                System.out.println(a[i]);
//            }
//        }

//        for(int i = 0; i< a.length; i++){
//            if(i%2 == 0) {
//                continue;
//            }
//            System.out.println(a[i]);
//        }
//
//        for(int i = 0; i< a.length; i++){
//            if(i%2 == 0) {
//                break;
//            }
//            System.out.println(a[i]);
//        }

//        for (int i=0; i < 10; i++){
//            if (i%2 ==0){
//                System.out.println("Continuing out when i=" + i);
//                continue;
//            }
//            System.out.println("I is Odd " + i );
//        }
//        for (int i=0; i < 10; i++){
//            if (i%2 ==0 && i > 4){
//                System.out.println("Breaking out when i=" + i);
//                break;
//            }
//            System.out.println("I is " + i );
//        }


//        for (int i = 0; i< 10; i++){
//            /// Break/Continue for the i loop
//            for (int j=0; j<10; j++){
//                if (i + j > 10){
//                    break;
//                }
//                System.out.println("i = " + i + " j = " + j);
//                System.out.println("i + j = " + (i + j));
//
//            }
//            /// Break/Continue for the i loop
//        }

        OUTER: for (int i = 0; i< 10; i++){
            /// Break/Continue for the i loop
            INNER: for (int j=0; j<10; j++){
                if (i + j > 10){
                    System.out.println("BREAKING with " + i + " " + j);
                    break OUTER;
                }
                System.out.print("i = " + i + " | j = " + j);
                System.out.println(" | i + j = " + (i + j));

            }
            /// Break/Continue for the i loop
        }


    }
}
