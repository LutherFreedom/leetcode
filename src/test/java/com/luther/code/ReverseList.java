package com.luther.code;

import org.junit.Test;

import java.util.LinkedList;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/10/9 10:26
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class ReverseList {
    @Test
    public void test(){
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        ListNode result = reverseList2(listNode);
        System.out.println("aaa");
    }
    public ListNode reverseList2(ListNode head) {
       return reverse(head, null);
    }

    private ListNode reverse(ListNode head, ListNode cache) {
        if (head == null){
            return cache;
        }
        ListNode node = new ListNode(head.val);
        node.next = cache;
        cache = node;
        ;
        return reverse(head.next, cache);
    }

    public ListNode reverseList(ListNode head) {
        LinkedList<Integer> list = new LinkedList();
        while (head != null) {
            list.addFirst(head.val);
            head = head.next;
        }

        ListNode result = null;
        ListNode a = null;
        while (!list.isEmpty()) {
            if (result == null) {
                result = new ListNode(list.poll());
                a = result;
            } else {
                a.next = new ListNode(list.poll());
                a = a.next;
            }
        }
        return result;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
