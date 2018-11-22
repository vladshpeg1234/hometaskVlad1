package com.hillel.hometask8;

import com.hillel.Utils.MathHelper;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calc {

    public static void guessNumber(int min, int max) {
        System.out.println("1. Угадать целое число от " + min + " до " + max);
        int aNum = MathHelper.getRandom(min, max); // За пределами цикла!
        Scanner scanner = new Scanner(System.in);
        System.out.println("Уважаемый пользователь, введите целое число от " + min + " до " + max);
        System.out.println(aNum);
        int number = scanner.nextInt();
        if (aNum == number) {
            System.out.println("Поздравляем, число " + aNum + " угадано");
        } else {
            do {
                System.out.print("Вы не угадали.");
                if (number < aNum) {
                    System.out.print(" Ваше чило меньше.");
                } else {
                    System.out.print(" Ваше число больше.");
                }
                System.out.println(" Попытайтесь еще раз ...");
                number = scanner.nextInt();
            } while (number != aNum);
            System.out.println("Поздравляем, число " + aNum + " угадано");
        }
    }

    public static void countDown(int min, int max) {
        System.out.println("2. Обратный отчсет от " + max + " до " + min);
        int a = max;
        for (int i = 0; i <= (max - min); i++) {
            System.out.print(a + "; ");
            a--;
        }


    }

    public static void getFactorial(int f) {
        System.out.println("3. Расчитать факториал числа " + f);
        int f0 = 0;
        int res = 1;
        do {
            int d = res * (f0 + 1);
            f0++;
            res = d;
        } while (f0 < f);
        System.out.println("Факториал числа " + f + " равен " + res);
    }


    public static void arithmeticProg(int first, int delta, int number) {
        System.out.println("4. Вывод арифметической прогрессии с начальным элементом "+ first+ " смещением " +delta+ " и общим количеством элементов " +number);
        for (int i = 1; i <= number; i++) {
            System.out.print(first + "; ");
            first = first + delta;

        }
        System.out.println();
        System.out.println("Всего элементов "+number);
    }
}

