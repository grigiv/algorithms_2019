package com.epam.algorithms.task2;

import com.epam.algorithms.task1.LinkedListPrototype;

public class LlpQueue {
    LinkedListPrototype linkedListPrototype;

    public LlpQueue() {
        linkedListPrototype = new LinkedListPrototype();
    }

    public void addFirst(String value) {
        linkedListPrototype.addFirst(value);
    }

    public void removeLast() {

    }

    public String head() {
        return "";
    }

    public String tail() {
        return "";
    }

    public int size() {
       return linkedListPrototype.size();
    }
}
