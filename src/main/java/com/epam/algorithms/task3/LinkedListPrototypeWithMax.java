package com.epam.algorithms.task3;

public class LinkedListPrototypeWithMax {
    private LinkedListElementWithMax firstElement;

    public int size() {
        int s = 0;
        LinkedListElementWithMax currentElement = firstElement;
        while (currentElement != null) {
            s = s + 1;
            currentElement = currentElement.getNext();
        }
        return s;
    }

    public void addFirst(int value) {
        if (firstElement != null) {
            LinkedListElementWithMax newElement = new LinkedListElementWithMax();
            newElement.setValue(value);
            newElement.setNext(firstElement);
            newElement.setMax(value > firstElement.getMax() ? value : firstElement.getMax());
            firstElement = newElement;
        } else {
            firstElement = new LinkedListElementWithMax();
            firstElement.setValue(value);
            firstElement.setMax(value);
        }
    }

    public void removeFirst() {
        if (firstElement != null) {
            firstElement = firstElement.getNext();
        } else {
            System.out.println("LinkedList is empty. Nothing to remove.");
        }
    }

    public Integer head() {
        if (firstElement != null) {
            return firstElement.getValue();
        } else {
            System.out.println("LinkedList is empty.");
            return null;
        }
    }

    public Integer getMax() {
        if (firstElement != null) {
            return firstElement.getMax();
        } else {
            return null;
        }
    }
}

