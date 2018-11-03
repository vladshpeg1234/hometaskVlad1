package com.hillel.hometask4;

import java.sql.SQLOutput;

public class Starter {

    public static void main (String [] args ) {

        Calc.methodRate(50, 27.25) ; { //Количество гривен - х, курс - y
            System.out.println();
        }

        int r1 = Calc.methodSum(768) ; {
            System.out.println();
            System.out.println( "2.Сумма цифр целого трехзначного числа = " + r1 );
        }

        Calc.methodFarm(2,3); ; {

        }

        Calc.methodTrains(39.9,60) ; {
            System.out.println();
            System.out.println("4.Задание со столкновением поездов");



        }
        System.out.println("5. Корни квадратного уравнения");
        Calc.methodQuad(1,3,22.2) ; {
            System.out.println();


    }

    }

}
