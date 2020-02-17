package com.codersbay;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] iSort = {5, 4, 64, 564, 675, 87, 322, 4, 56, 56};
        int iArrayLength = iSort.length;
        int iTmp;

        boolean bSwapped;

        do {
            bSwapped = false;
            for (int i = 0; i < iArrayLength - 1; ++i) {
                if (iSort[i] > iSort[i + 1]) {
                    iTmp = iSort[i];
                    iSort[i] = iSort[i + 1];
                    iSort[i + 1] = iTmp;

                    bSwapped = true;
                }
            }
            iArrayLength = iArrayLength - 1;
        } while (bSwapped);
        System.out.println(Arrays.toString(iSort));
    }
}
