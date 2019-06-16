package com.epam.algorithms.task1;

public class Task1App {
    public static void main(String[] args) {
        LinkedListPrototype linkedListPrototype = new LinkedListPrototype();
        linkedListPrototype.addFirst("1");
        System.out.println(linkedListPrototype.head());
        linkedListPrototype.addFirst("2");
        System.out.println(linkedListPrototype.size());
        linkedListPrototype.addFirst("3");
        linkedListPrototype.addFirst("4");
        linkedListPrototype.removeFirst();
        linkedListPrototype.removeFirst();
        linkedListPrototype.removeFirst();
        System.out.println(linkedListPrototype.size());
        System.out.println(linkedListPrototype.head());
    }
}
