package com.hillel.hometask7;

public class Calc {


    public static  int getMinOfInt( int [] aIntNums) {

        int min = aIntNums[0];
        for (int i = 0; i < aIntNums.length; i++) {


            if (min > aIntNums[i]) {
                min = aIntNums[i];
            }
        }
        return min;
    }
    public static  int getMaxOfInt( int [] aIntNums) {

        int max = aIntNums[0];
        for (int i = 0; i < aIntNums.length; i++) {

            if (max < aIntNums[i]) {
                max = aIntNums[i];
            }
        }
        return max;
    }
    public static  double getMinOfDouble ( double [] aDoubleNums) {

        double min = aDoubleNums[0];
        for (int i = 0; i < aDoubleNums.length; i++) {


            if (min > aDoubleNums[i]) {
                min = aDoubleNums[i];
            }
        }
        return min;
    }
    public static  double getMaxOfDouble ( double [] aDoubleNums) {

        double max = aDoubleNums[0];
        for (int i = 0; i < aDoubleNums.length; i++) {


            if (max < aDoubleNums[i]) {
                max = aDoubleNums[i];
            }
        }
        return max;
    }
}
