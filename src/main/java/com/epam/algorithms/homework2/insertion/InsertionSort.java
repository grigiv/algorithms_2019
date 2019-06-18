package com.epam.algorithms.homework2.insertion;

import java.util.Arrays;

public class InsertionSort {

    public int[] sort(int[] array) {
        int tmp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if(array[j] < array[j-1]) {
                    tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                } else {
                    break;
                }
            }
            System.out.println("Current result: " + Arrays.toString(array));
        }
        return array;
    }
}
