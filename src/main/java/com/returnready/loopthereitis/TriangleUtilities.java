package com.returnready.loopthereitis;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String anyTriangle = "";
        int i; int j;
        for (i = 1; i < numberOfRows; i++) {
            for (j = 1; j <= i; j++) {
                anyTriangle += "*";
            }
            anyTriangle += "\n";
        }

        return anyTriangle;
    }

    public static String getRow(int numberOfStars) {
        String starRow = "";
        for (int i = 0; i < numberOfStars; i++) {
            starRow += "*";
        }

        return starRow;
    }

    public static String getSmallTriangle() {
        String smallTriangle = "";
        int i; int j;
        for (i = 1; i < 5; i++){
            for (j = 1; j <= i; j++) {
                smallTriangle += "*";
            }
            smallTriangle += "\n";
        }


        return smallTriangle;
    }

    public static String getLargeTriangle() {
        String largeTriangle = "";
        int i; int j;
        for (i = 1; i < 10; i++) {
            for (j = 1; j <= i; j++) {
                largeTriangle += "*";
            }
            largeTriangle += "\n";
        }
        return largeTriangle;
    }
}


