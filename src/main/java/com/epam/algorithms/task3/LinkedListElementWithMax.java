package com.epam.algorithms.task3;

class LinkedListElementWithMax {

    private Integer value;
    private LinkedListElementWithMax next;
    private Integer max;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public LinkedListElementWithMax getNext() {
        return next;
    }

    public void setNext(LinkedListElementWithMax next) {
        this.next = next;
    }

    public Integer getMax() { return max; }

    public void setMax(Integer max) { this.max = max; }
}
