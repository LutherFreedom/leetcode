package com.luther.code;

import java.util.LinkedList;

public class MyStack {
    private LinkedList<Integer> cache = new LinkedList();
    /** Initialize your data structure here. */
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        cache.addFirst(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return cache.pop();
    }
    
    /** Get the top element. */
    public int top() {
        return cache.getFirst();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return cache.isEmpty();
    }
}