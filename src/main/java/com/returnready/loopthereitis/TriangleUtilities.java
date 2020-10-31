package com.returnready.loopthereitis;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String starTriangle = "";
        for (int i = 1; i < numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                starTriangle += "*";
            }
            starTriangle += "\n";
        }
        return starTriangle;
    }

    public static String getRow(int numberOfStars) {
        String starsLine = "";
        for (int i = 1; i <= numberOfStars; i++) {
            starsLine += "*";
        }
        return starsLine;
    }

    public static String getSmallTriangle() {
        String starTriangleSmall = "";
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                starTriangleSmall += "*";
            }
            starTriangleSmall += "\n";
        }
        return starTriangleSmall;
    }

    public static String getLargeTriangle() {
        String starTriangleLarge = "";
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                starTriangleLarge += "*";
            }
            starTriangleLarge += "\n";
        }
        return starTriangleLarge;
    }
}


