package com.pandurang;

import java.util.ArrayList;
import java.util.List;

public class Stack<E> {

    private final List<E> collector;
    private int pointer;
    private final int capacity;

    public Stack(int capacity) {
        collector = new ArrayList<>(capacity);
        pointer = -1;
        this.capacity = capacity;
    }

    public void push(E data) {
        pointer++;
        if (isFull()) {
            System.out.println("Stack is full!!");
            System.exit(1);
        }
        collector.add(data);
    }

    public E pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!!");
            System.exit(1);
        }
        E data = collector.get(pointer);
        pointer--;
        return data;
    }

    private boolean isFull() {
        return pointer == (capacity - 1);
    }

    private boolean isEmpty() {
        return pointer == -1;
    }

}
