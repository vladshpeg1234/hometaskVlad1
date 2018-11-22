package com.hillel.hometask6;

import com.hillel.Utils.MathHelper;

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

    public static void findIndex() {

        String inStr = "Одесса мой город родной";
        String s = inStr.toLowerCase();
        int l = inStr.length();
        char a = 'о';
        for (int i = 0; i < l; i++) {
            char arr = s.charAt(i);
            if (arr == 'о') {
                System.out.print(i + ", ");
            }
        }
        System.out.println("Длина строки " + l);
    }

    public static void summsRandom (int numbs) {
        int summs = 0;
        for (int i = 1; i <= numbs; i++) {
            int rnd = MathHelper.getRandom(-10,9);

            summs = summs + rnd;
        }
        System.out.println("Сумма случайных " + numbs + " чисел " + " = " + summs);
    }

}
