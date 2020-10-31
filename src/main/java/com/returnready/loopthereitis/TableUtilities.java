package com.returnready.loopthereitis;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String smallMtable = "";
        int i; int j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
               int product = i * j;
               if (product <= 9) {
                   smallMtable += "  " + product + " ";
               }else {
                   smallMtable += " " + product + " ";
               }
               smallMtable += "|";
            }
            smallMtable += "\n";
        }
        return smallMtable;
    }



    public static String getLargeMultiplicationTable() {
        String largeMtable = "";
        int i; int j;
        for (i = 1; i <=10; i++) {
            for (j = 1; j <= 10; j++) {
                int product = i * j;
                if (product <= 9) {
                    largeMtable += "  " + product + " ";
                }else if (product > 9 && product < 100) {
                    largeMtable += " " + product + " ";
                }else {
                    largeMtable += "" + product + " ";
                }
                largeMtable += "|";
            }
            largeMtable += "\n";
        }

        return largeMtable;
    }

    public static String getMultiplicationTable(int tableSize) {
        String mTable = "";
        int i; int j;
        for (i = 1; i <= 20; i++) {
            for (j = 1; j <= 20; j++) {
                int product = i * j;
                if (product <= 9) {
                    mTable += "  " + product + " ";
                }else if (product > 9 && product < 100) {
                    mTable += " " + product + " ";
                }else {
                    mTable += "" + product + " ";
                }
                mTable += "|";
            }
            mTable += "\n";
        }
        return mTable;
    }
}
