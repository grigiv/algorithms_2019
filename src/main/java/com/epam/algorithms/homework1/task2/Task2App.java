package com.epam.algorithms.homework1.task2;

public class Task2App {
    public static void main(String[] args) {
        LlpQueue llpQueue = new LlpQueue();
        llpQueue.addFirst("1");
        llpQueue.addFirst("2");
        llpQueue.addFirst("3");
        llpQueue.addFirst("4");
        System.out.println(llpQueue.size());
        llpQueue.removeLast();
        System.out.println(llpQueue.size());
        System.out.println(llpQueue.tail());
        System.out.println(llpQueue.head());
    }
}
