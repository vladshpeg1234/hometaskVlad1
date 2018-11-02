package com.hillel.hometask1;

public class Calc {
    public static int add (int x, int y) {

        int result = x + y ;
        return result ;
    }

    public static int sub(int x, int y) {
        int result = x - y;
        return result ;

    }
    public static int div(int x, int y) {
        int result = x / y ;
        return result;
    }
     public static int mult(int x, int y) {
        int result = x * y ;
        return result;
     }

    public static double sum(double x, double y) {
             double result = x + y;
             return result;

    }
    public static double sub( double x, double y) {
        double result = x / y ;
        return result;

    }
    public static void calcPerimeterArea(int a, int b) {
        int perimeter = 2 * (a + b);
        int area = a * b;
        System.out.println("Perimeter=" + perimeter + "meters");
        System.out.println("Area=" + area + "square meters");
    }

}
