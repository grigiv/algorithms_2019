package com.epam.algorithms.task3;


public class Task3App {
    public static void main(String[] args) {
        LinkedListPrototypeWithMax linkedListPrototype = new LinkedListPrototypeWithMax();
        linkedListPrototype.addFirst(10);
        linkedListPrototype.addFirst(2);
        linkedListPrototype.addFirst(30);
        linkedListPrototype.addFirst(4);
        linkedListPrototype.addFirst(5);
        linkedListPrototype.removeFirst();
        System.out.println(linkedListPrototype.size());
        System.out.println(linkedListPrototype.head());
        System.out.println(linkedListPrototype.getMax());
    }
}
