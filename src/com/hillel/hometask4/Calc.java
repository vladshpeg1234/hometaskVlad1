package com.hillel.hometask4;

public class Calc {

public static void methodRate( double x, double y ) {

    double rateBacks = x / y;
    System.out.println();
    System.out.println("1. За " + x + " грн вы получите " + (rateBacks - rateBacks % 0.01) + " долл по курсу " + y);
}
public static int methodSum( int x) {

    int result = ( x - x % 100 ) /100 + (x % 100 - x % 10 ) / 10 + (x % 10) ; // Кажая цифра отделена сложением
    return result ;
}

public static void methodFarm(double a, double b) {
        double fence  = 2 * (a + b);
        double field = a * b;
        System.out.println();
        System.out.println("3.Участок");
        System.out.println("- Длина забора = " + fence + " метр");
        System.out.println("- Площадь газона = " + field + " метр кв");

}

public static void methodTrains( double v1 , double v2) {

    double crashTime1 = 4 / v1 ;
    double crashTime2 = 6 / v2 ;
    double time = crashTime1 - crashTime2 ;

    System.out.println();
    boolean r = time  < 0 ;
    if (r) {
        System.out.println(" При заданных скоростях V1 = " + v1 + " и  V2 = " + v2 + " поезда не столкнутся!");
    } else {
        System.out.println(" При заданных скоростях V1 = " + v1 + " и  V2 = " + v2 + "поезда столкнутся!");
        System.out.println();
    }
}

public static void methodQuad(double a, double b, double c) {

    double d = b * b - 4 * a * c;
    double dis = Math.sqrt(d);

    boolean result = d < 0;

    if (result) {
        System.out.println();
        System.out.println(" Решения не сужествут при заданных коэффициентах, дискриминант меньше 0 и равен " + d);
    } else {
        double x1 = ((-1) * b + dis) / (2 * a);
        double x2 = ((-1) * b - dis) / (2 * a);

        System.out.println(" x1 = " + x1);
        System.out.println(" x2 = " + x2);
    }
}

}


