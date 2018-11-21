package com.hillel.hometask5;

import javax.swing.*;
import java.sql.SQLOutput;

public class Calc {

    public static void monthSeason (int n) {

        if (( n < 3) || (n==12)) {
            System.out.println("Winter");
        } else if (n < 6) {
            System.out.println("Spring");
        } else if (n < 9) {
            System.out.println("Summer");
        } else if (n < 12) {
            System.out.println("Autumn");
        }
        System.out.println("Incorrect Month number!");

    }



    public static void monthSeasonsSwitch (int n) {

        switch (n) {
            case 1 :
                System.out.println("Winter");
                break;
            case 2 :
                System.out.println("Winter");
                break;
            case 3 :
                System.out.println("Spring");
                break;
            case 4 :
                System.out.println("Spring");
                break;
            case 5 :
                System.out.println("Spring");
                break;
            case 6 :
                System.out.println("Summer");
                break;
            case 7 :
                System.out.println("Summer");
                break;
            case 8 :
                System.out.println("Summer");
                break;
            case 9 :
                System.out.println("Autumn");
                break;
            case 10 :
                System.out.println("Autumn");
                break;
            case 11 :
                System.out.println("Autumn");
                break;
            case 12 :
                System.out.println("Winter");
                break;

                default:
                    System.out.println("Incorrect Month number!");


        }
    }
    public static void bitDivByFour(long number){
        long d = number >> 2 ;
        System.out.println(d);

    }


}
