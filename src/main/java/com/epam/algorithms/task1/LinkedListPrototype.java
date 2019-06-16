package com.epam.algorithms.task1;

public class LinkedListPrototype {
    private LinkedListElement firstElement;

    public int size() {
        int s = 0;
        LinkedListElement currentElement = firstElement;
        while (currentElement != null) {
            s = s + 1;
            currentElement = currentElement.getNext();
        }
        return s;
    }

    public void addFirst(String value) {
        if (firstElement != null) {
            LinkedListElement newElement = new LinkedListElement();
            newElement.setValue(value);
            newElement.setNext(firstElement);
            firstElement = newElement;
        } else {
            firstElement = new LinkedListElement();
            firstElement.setValue(value);
        }
    }

    public void removeFirst() {
        if (firstElement != null) {
            firstElement = firstElement.getNext();
        } else {
            System.out.println("LinkedList is empty. Nothing to remove.");
        }
    }

    public LinkedListElement head() {
        return firstElement;
    }
}

