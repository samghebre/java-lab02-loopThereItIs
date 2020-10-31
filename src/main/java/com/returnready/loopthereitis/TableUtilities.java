package com.returnready.loopthereitis;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        int i, j;
        String string = "";
        for (i = 1; i <=5; i++) {
            for (j = 1; j <= 5; j++) {
                int product = i * j;
                if (product <=  9) {
                    string += "  " + product + " ";
                }else {
                    string += " " + product + " ";
                }
                string += "|";
            }
            string += "\n";

        }
        return string;
    }



    public static String getLargeMultiplicationTable() {
        int i, j;
        String string = "";
        for (i = 1; i <=10; i++) {
            for (j = 1; j <= 10; j++) {
                int product = i * j;
                if (product <=  9) {
                    string += "  " + product + " ";
                }else if (product > 9 && product < 100) {
                    string += " " + product + " ";
                }else {
                    string += product + " ";
                }
                string += "|";
            }
            string += "\n";

        }
        return string;
    }

    public static String getMultiplicationTable(int tableSize) {
        int i, j;
        String string = "";
        for (i = 1; i <=tableSize; i++) {
            for (j = 1; j <= tableSize; j++) {
                int product = i * j;
                if (product <=  9) {
                    string += "  " + product + " ";
                }else if (product > 9 && product < 100) {
                    string += " " + product + " ";
                }else {
                    string += product + " ";
                }
                string += "|";
            }
            string += "\n";

        }
        return string;
    }
}
