package com.luther.code;

import java.util.ArrayList;
import java.util.List;

public class MyStack2 {
    private List<Integer> cache = null;

    /**
     * Initialize your data structure here.
     */
    public MyStack2() {
        cache = new ArrayList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        cache.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        if (!cache.isEmpty()){
            return cache.remove(cache.size() -1);
        }
        return -1;
    }

    /**
     * Get the top element.
     */
    public int top() {
        if (!cache.isEmpty()){
            return cache.get(cache.size() -1);
        }
        return -1;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return cache.isEmpty();
    }
}