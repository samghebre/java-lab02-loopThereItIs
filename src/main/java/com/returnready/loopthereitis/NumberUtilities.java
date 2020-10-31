package com.returnready.loopthereitis;



import java.util.ArrayList;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String evenResponse = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                evenResponse += i;
            }
        }
        return evenResponse;
    }


    public static String getOddNumbers(int start, int stop) {
        String oddResponse = "";
        for (int i = start; i < stop; i+=2) {
            if (i % 2 != 0) {
                oddResponse += i;
            }
        }
        return oddResponse;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String squaredNum = "";
        for (int i = start; i < stop; i += step) {
            squaredNum += (i * i);
        }
        return squaredNum;
    }

    public static String getRange(int stop){
        String rangeAns = "";
        for (int i = 0; i < stop; i++) {
            rangeAns += i;
        }

        return rangeAns;
    }

    public static String getRange(int start,int stop) {
        String startStopRangeAns = "";
        for (int i = start; i < stop; i++) {
            startStopRangeAns += i;
        }
        return startStopRangeAns;
    }


    public static String getRange(int start, int stop, int step) {
        String rangeWithStep = "";
        for (int i = start; i < stop; i += step) {
            rangeWithStep += i;
        }
        return rangeWithStep;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String expNum = "";
        for (int i = start; i < stop; i += step) {
            expNum += (int) Math.pow(i, exponent) + "";
        }


        return expNum;
    }

    public static void main(String[] args) {
        getRange(5, 20);
    }
}
