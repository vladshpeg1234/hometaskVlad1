package com.hillel.hometask2;

public class Calc {
    public static double methodCalc1(double a, double b, double c) {
        double result = a + b * (c / 2);
        return result ;
    }

    public static double  methodCalc2(double  a, double b) {
        double result = (a*a + b*b) % 2 ;
        return result ;
    }

    public static double methodCalc3(double a, double b, double c) {
        double result = (a + b) / 12 * c % 4 + b ;
        return result ;
    }

    public static double methodCalc4 (double a, double b, double c) {
        double result = (a - b * c)/(a + c) % c;
        return result ;
    }


}
