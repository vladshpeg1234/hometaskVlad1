package com.hillel.hometask1;

public class Starter {

    public static void main(String[] args) {

        int r = Calc.add(5, 7) ;

        System.out.println("x+y= " + r);

        int r1 = Calc.sub(100,35);

        System.out.println("x-y= " + r1);

        int r2 = Calc.div(200, 50) ;

        System.out.println("x/y= " + r2);

        int r3 = Calc.mult(33,3);

        System.out.println("x*y= " + r3);

        double r4 = Calc.sum(10.2, 12.1);

        System.out.println("Fractional Sum = " + r4);

        double result = Calc.sub(100D,40D);

        System.out.println("Double Sub = " + result);

         Calc.calcPerimeterArea(2,5);



    }
}
