package com.epam.algorithms.homework2.selection;

import java.util.Arrays;

public class SelectionSort {

    public int[] sort(int[] array) {
        int tmp;
        for (int i = 0; i < array.length; i++) {
            int kMin = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[kMin]) {
                    kMin = j;
                }
            }
            tmp = array[i];
            array[i] = array[kMin];
            array[kMin] = tmp;
            System.out.println("Current result: " + Arrays.toString(array));
        }
        return array;
    }
}
