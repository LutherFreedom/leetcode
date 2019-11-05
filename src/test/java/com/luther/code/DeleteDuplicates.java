package com.luther.code;

import org.junit.Test;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/8/9 10:04
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class DeleteDuplicates {

    @Test
    public void test() {

    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next != null ? temp.next.next : null;
            } else {
                temp = temp.next;
            }

        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
