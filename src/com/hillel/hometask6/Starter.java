package com.hillel.hometask6;

import java.sql.SQLOutput;

public class Starter {
    public static void main (String[] args) {

        System.out.println("1. Сумма чисел в диапазоне");

        Calc.sumFromOne(1,100);
        System.out.println();

        System.out.println("2. Четные числа в заданном диапазоне");

        Calc.allEven(1,100);
        System.out.println();
        System.out.println();
        System.out.println("3. Количество выпадений Орла и Решки");

        Calc.methodHeadTail(2000);
        System.out.println();


        System.out.println("4. Печать диагонали квадрата при заданной длине стороны");

        Calc.printDiagonal(11);
        System.out.println();
        System.out.println();

        System.out.println("5. Определить возраст пользователя на заданный год в зависимоти от года рождения");

       Calc.returnAge(2018);
        System.out.println();

        System.out.println("6. Определить сумму всех целых чисел в диапозоне при заданном количестве ");

        Calc.sumRandom(-5,5, 10);

        System.out.println();
        System.out.println("7. Найти индексы вхождения символов");

            String inStr = "Одесса мой город родной";
            int l = inStr.length();
            char a = 'о';
            for (int i =0; i < l; i++) {
                char b = inStr.charAt(i);
                if (a==b) {
                    System.out.print( i +", ");
                }
            }
            System.out.println("Длина строки " + l);

       // System.out.println("7. Найти индексы вхождения символов");

       // String inStr1 = "Одесса мой город родной";
        //int l1 = inStr1.length();
        //char a1 = 'о';
        //char  b1 = 'О';
        ////boolean comp = a1.equalsIgnoreCase(b1) ;
        //for (int i =0; i < l1; i++) {
         //    char z = inStr.charAt(i);
        //    if (a1==z || comp == true) {
        //        System.out.print( i +", ");
        //    }
        //}
        //System.out.println("Длина строки " + l1);

    }

}
