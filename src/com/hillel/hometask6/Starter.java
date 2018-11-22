package com.hillel.hometask6;

import java.sql.SQLOutput;


import static com.hillel.hometask6.Calc.summsRandom;

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
//Rfr ввести все три аргумента  min  max количество???
        Calc.summsRandom(100);

        System.out.println();
        System.out.println("7. Найти индексы вхождения символов");

        Calc.findIndex();

    }


    }



