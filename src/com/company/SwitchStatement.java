package com.company;

public class SwitchStatement {
    public static void main(String[] args){
        int day = 6;

        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thurs");
                break;
            case 5:
                System.out.println("Fri");
                break;
            default:
                System.out.println("Select Day between 1-5");
                break;
        }
    }
}