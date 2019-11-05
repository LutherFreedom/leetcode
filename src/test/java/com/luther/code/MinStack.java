package com.luther.code;

import java.util.LinkedList;

class MinStack {
    private LinkedList<Integer> node = new LinkedList<>();
    private LinkedList<Integer> helper = new LinkedList<>();

    /**
     * initialize your data structure here.
     */
    public MinStack() {

    }

    public void push(int x) {
        node.addFirst(x);
        if (helper.isEmpty()) {
            helper.addFirst(x);
        } else {
            if (x <= helper.get(0)) {
                helper.addFirst(x);
            }
        }
    }

    public void pop() {
        if (node.isEmpty()){return;}
        int current = node.removeFirst();
        if (current == helper.getFirst() && !helper.isEmpty()){
            helper.removeFirst();
        }
    }

    public int top() {
        if (node.isEmpty()){
            return 0;
        }
        return node.getFirst();
    }

    public int getMin() {
        if (helper.isEmpty()){
            return 0;
        }
        return helper.getFirst();
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(3);
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.pop();
        System.out.println(minStack.getMin());
        System.out.println(minStack);
    }
}