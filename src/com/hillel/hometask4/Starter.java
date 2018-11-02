package com.hillel.hometask4;

import java.sql.SQLOutput;

public class Starter {

    public static void main (String [] args ) {

        double r = Calc.methodRate(50, 27.25) ; { //Количество гривен - х, курс - y
            System.out.println();
            System.out.println("1.Количество долларов =  " + (r - r % 0.01) );
        }

        int r1 = Calc.methodSum(768) ; {
            System.out.println();
            System.out.println( "2.Сумма цифр целого трехзначного числа = " + r1 );
        }

        Calc.methodFence(2,3) ; {
            
        }

        double r3 = Calc.methodTrains(39.9,60) ; {
            System.out.println();
            System.out.println("4.Задание со столкновением поездов");
            System.out.println();
            boolean result = r3 < 0 ;
            if (result) {
                System.out.println(" При заданной скорости, поезда не столкнутся!");
            } else {
                System.out.println(" При заданной скорости, поезда столкнутся!") ;
            }

        }

        double r4 = Calc.methodQuad(1,2,5) ; {
            System.out.println();
            System.out.println("5.Нахождение корней квадратного уравнения");
            boolean result = r4 < 0 ;
            if (result) {
                System.out.println();
                System.out.println(" Решения не сужествут при заданных коэффициентах, дискриминант меньше 0 и равен " + r4);
            } else  {

                System.out.println(" x1 = " + Calc.methodX1(1,2,5)) ;
                System.out.println(" x2 = " + Calc.methodX2(1,2,5)) ;

            }


    }

    }

}
