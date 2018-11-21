package com.hillel.hometask7;

import javax.imageio.stream.ImageInputStreamImpl;

public class Starter {

    public static void main (String[] args) {
        System.out.println();

        int[] aIntNums = {-10, 20, 34, -11, 100, 20};

        Calc.getMinOfInt(aIntNums);
        System.out.println("Минимальное значение в диапазоне целых чисел " + Calc.getMinOfInt(aIntNums));

        Calc.getMaxOfInt(aIntNums);
        System.out.println("Максимальное значение в диапазоне целых чисел " + Calc.getMaxOfInt(aIntNums));

        System.out.println();

        double[] aDoubleNums = {10.10, 43.543, 0.01, 1.3, 0.1, 43.4, 0.001};

        Calc.getMinOfDouble(aDoubleNums);
        System.out.println("Минимальное значение в диапазоне дробных чисел " + Calc.getMinOfDouble(aDoubleNums));

        Calc.getMaxOfDouble(aDoubleNums);
        System.out.println("Максимальное значение в диапазоне дробных чисел " + Calc.getMaxOfDouble(aDoubleNums));






    }


}
