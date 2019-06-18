package com.epam.algorithms.homework2.selection;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortApp {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an array of 5 numbers, devided by space:");
        for (int i = 0; i < 5; i++) {
            while (!scanner.hasNextInt()) {
                System.out.println(" Input a number, please!");
                scanner.nextLine();
            }
            array[i] = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        }
        SelectionSort selectionSort = new SelectionSort();
        array = selectionSort.sort(array);
        System.out.println("Final array: " + Arrays.toString(array));
    }
}
