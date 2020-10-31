package com.returnready.loopthereitis;



import java.util.ArrayList;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String string = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                string += i + "";
            }
        }
        return string;
    }


    public static String getOddNumbers(int start, int stop) {
        String string = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                string += i + "";
            }
        }
        return string;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String string = "";
        for (int i = start; i < stop; i+=step) {
            string += i*i + "";

        }
        return string;
    }

    public static String getRange(int stop){
        String string = "";
        for (int i = 0; i < stop; i++) {
            string += i + "";
        }
        return string;
    }

    public static String getRange(int start,int stop) {
        String string = "";
        for (int i = start; i < stop; i++) {
            string += i + "";
            System.out.println(string);
        }
        return string;
    }


    public static String getRange(int start, int stop, int step) {
        String string = "";
        for (int i = start; i < stop; i+=step) {
            string += i + "";
        }
        return string;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String string = "";
        for (int i = start; i < stop; i += step) {
            string +=  (int) Math.pow(i, exponent) +"";
        }
        return string;
    }

    public static void main(String[] args) {
        getRange(5, 20);
    }
}
