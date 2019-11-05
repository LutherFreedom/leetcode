package com.luther.code;

import org.junit.Test;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/9/29 9:55
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class RemoveElement203 {

    @Test
    public void test() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(6);
        node.next.next.next = new ListNode(3);
        node.next.next.next.next = new ListNode(6);
        ListNode b = new ListNode(-1);
        b.next = node;
        b.next = b.next.next;

        ListNode c = node;


        System.out.println(1);

//        removeElements(node, 6);
    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode current = pre;
        while (current.next!=null){
            if (current.next.val == val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return pre.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
