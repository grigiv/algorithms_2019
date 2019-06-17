package com.epam.algorithms.task2;

import com.epam.algorithms.task1.LinkedListPrototype;

public class LlpQueue {
    private LinkedListPrototype tmpLinkedListPrototype;
    private LinkedListPrototype currentLinkedListPrototype;


    public LlpQueue() {
        currentLinkedListPrototype = new LinkedListPrototype();
    }

    public void addFirst(String value) {
        currentLinkedListPrototype.addFirst(value);
    }

    public void removeLast() {
        tmpLinkedListPrototype = new LinkedListPrototype();
        while (currentLinkedListPrototype.size() > 1) {
            tmpLinkedListPrototype.addFirst(currentLinkedListPrototype.head());
            currentLinkedListPrototype.removeFirst();
        }
        currentLinkedListPrototype.removeFirst();
        while (tmpLinkedListPrototype.size() > 0) {
            currentLinkedListPrototype.addFirst(tmpLinkedListPrototype.head());
            tmpLinkedListPrototype.removeFirst();
        }
    }

    public String head() {
        return currentLinkedListPrototype.head();
    }

    public String tail() {
        tmpLinkedListPrototype = new LinkedListPrototype();
        while (currentLinkedListPrototype.size() > 0) {
            tmpLinkedListPrototype.addFirst(currentLinkedListPrototype.head());
            currentLinkedListPrototype.removeFirst();
        }
        String tail = tmpLinkedListPrototype.head();
        while (tmpLinkedListPrototype.size() > 0) {
            currentLinkedListPrototype.addFirst(tmpLinkedListPrototype.head());
            tmpLinkedListPrototype.removeFirst();
        }
        return tail;
    }

    public int size() {
       return currentLinkedListPrototype.size();
    }
}
