package com.hillel.hometask2;

import java.sql.SQLOutput;

public class Starter {

    public static void main (String[] args) {
        double r = Calc.methodCalc1(12.5, 1.25,0.125);
        System.out.println("First task = " + r);

        double r1 = Calc.methodCalc2(2D, 3D);
        System.out.println("Second task = " + r1);

        double r2 = Calc.methodCalc3(10.1,45.2,3.3) ;
        System.out.println("Third task = " + r2) ;

        double r3 = Calc.methodCalc4(30, 11.05, 17) ;
        System.out.println("Forth task = " + r3);


    }

}
