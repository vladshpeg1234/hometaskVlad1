package com.hillel.hometask6;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class Calc {

    public static void multiTable(String[] args) {
        for (int x = 1; x <= 9; ++x) {
            for (int y = 1; y <= 9; ++y) {
                System.out.println("x= " + x + " y= " + y + "  " + x + "*" + y + "=" + x * y + "  ");
            }
        }
    }

    public static void sumFromOne(int a, int b) {
        int totalSum = 0;

        for (int x = a; x <= b; x++) {

            totalSum = totalSum + x;
        }
        System.out.println("Сумма чисел от " + a + " до " + b +" равна " + totalSum);

    }
    public static void allEven(int a, int b) {

        System.out.println("Четные числа в диапазоне от " + a + " до " + b + " :");

        for (int x = a; x < b; x++) {
            if (x % 2 == 0) {

                System.out.print( x + ", ");
            }
        }
    }
    public static void methodHeadTail( int n) {
        int head =0 ;
        int tail = 0 ;
        for (int i = 0; i< n; i++ ) {
            double r = Math.random() ;
            if (r <= 0.5) {
                head++;
            } else {
                tail++;
            }
        }
        System.out.println();
        System.out.println("Количество выпадений Орла и Решки при " + n + " подбрасываниях");
        System.out.println("Орел: " + head);
        System.out.println("Решка: " + tail);
    }
    public static void printDiagonal (int n) {

        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {

                if (i==j) {
                    System.out.print('1');
                } else {
                    System.out.print('0');
                }

            }
        }
    }
    public static void returnAge(int a) {
       Scanner scanner = new Scanner(System.in) ;
        System.out.println("Уважаемый пользователь, введите год своего рождения в формате 4-х цифр ");
         int number = scanner.nextInt();
         int age = 0;

         if (number>a || number<1900) {

             do {
                System.out.println("Ошибка, Введите правильное значение");
                 number = scanner.nextInt();

             } while (number>a || number<1900);
              age = a - number;
             System.out.println(" Ваш возраст " + age);
         } else {
             age = a - number;
             System.out.println(" Ваш возраст " + age);
         }


    }
    public static void sumRandom (int min, int max, int aNam) {
        System.out.println("Сумма случайных " + aNam + " чисел в диапазоне от " + min + " до " + max);
        int sum = 0;
        double random;
        double diapasonNumbers = max - min;
        double minusPart = (0-min)/diapasonNumbers;
        minusPart = Math.abs(minusPart);

        for (int i = 1; i <= aNam; i++ ) {
            random = Math.random();

            if (random <= minusPart  ) {
                int x =  (int) (random * (0 - min +1));
                x = x * (-1);
                System.out.println(x + "  " + random + " -  " + minusPart);
                sum = sum + x ;

            } else {
                int x = (int) (random * (max + 1));
                System.out.println(x + "  " + random+  " + " + minusPart);sum = sum + x ;

            }
        }
        System.out.println(sum);


    }
    public static void lengthString (String[] args) {
        String inStr = "Одесса мой город родной";
        int l = inStr.length();

        for (int i =0; i < l; i++) {
            System.out.println(inStr.charAt(i));
        }

    }




}
