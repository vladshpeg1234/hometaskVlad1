package com.hillel.hometask4;

public class Calc {

public static double methodRate( double x, double y ) {

    double rateBacks = x / y;
    return rateBacks;
}
public static int methodSum( int x) {

    int result = ( x - x % 100 ) /100 + (x % 100 - x % 10 ) / 10 + (x % 10) ; // Кажая цифра отделена сложением
    return result ;
}
public static double methodFence( double x  , double y ) {

    double fence = ( x + y ) * 2 ;
    return fence ;
}
public static double methodField( double x  , double y ) {

    double field = x * y ;
    return field ;
}

public static double methodTrains( double v1 , double v2) {

    double crashTime1 = 4 / v1 ;
    double crashTime2 = 6 / v2 ;
    double result = crashTime1 - crashTime2 ;
    return result ;
}
public static double methodQuad(double a, double b, double c) {

    double d = b*b - 4 * a * c ;
    return d ;
}
public static double methodX1(double a, double b, double c) {

    double d = b * b - 4 * a * c ;
    double dis = Math.sqrt(d) ;
    double x1 =  ((-1) * b + dis) / ( 2 * a) ;
    return x1 ;
}

public static double methodX2(double a, double b, double c) {

    double d = b * b - 4 * a * c;
    double dis = Math.sqrt(d);
    double x2 = ((-1) * b - dis) / (2 * a);
    return x2;

}


}