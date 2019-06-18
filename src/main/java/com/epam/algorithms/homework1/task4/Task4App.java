package com.epam.algorithms.homework1.task4;

import com.epam.algorithms.homework1.task1.LinkedListPrototype;

import java.util.Scanner;

public class Task4App {
    public static void main(String[] args) {
        boolean isBalanced = true;
        Scanner scanner = new Scanner(System.in);
        LinkedListPrototype linkedListPrototype = new LinkedListPrototype();
        System.out.println(" Input a string, please!");
        String inputString = scanner.nextLine();
        label:
        for (int i = 0; i < inputString.length(); i++) {
            switch (inputString.charAt(i)) {
                case '(':
                    linkedListPrototype.addFirst(String.valueOf(inputString.charAt(i)));
                    break;
                case '{':
                    linkedListPrototype.addFirst(String.valueOf(inputString.charAt(i)));
                    break;
                case '[':
                    linkedListPrototype.addFirst(String.valueOf(inputString.charAt(i)));
                    break;
                case ')':
                    if (linkedListPrototype.head() != null && linkedListPrototype.head().equals("(")) {
                        linkedListPrototype.removeFirst();
                    } else {
                        isBalanced = false;
                        break label;
                    }
                    break;
                case '}':
                    if (linkedListPrototype.head() != null && linkedListPrototype.head().equals("{")) {
                        linkedListPrototype.removeFirst();
                    } else {
                        isBalanced = false;
                        break label;
                    }
                    break;
                case ']':
                    if (linkedListPrototype.head() != null && linkedListPrototype.head().equals("[")) {
                        linkedListPrototype.removeFirst();
                    } else {
                        isBalanced = false;
                        break label;
                    }
                    break;
            }
        }
        System.out.println("String is balanced: " + isBalanced);
    }
}
