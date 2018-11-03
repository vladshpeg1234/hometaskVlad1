package com.hillel.hometask3;

public class Calc {
    public static  void evenMethod (double x) {

        double check = x / 2 ;
        double r =  check - (int) check  ;
        System.out.println();

        if (r == 0) {
            System.out.println("The Number " + x + " is even ") ;
        }

        else {
            System.out.println("The Number " + x + " is odd ") ;
        }


    }
}
