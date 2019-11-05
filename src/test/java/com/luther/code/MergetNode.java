package com.luther.code;

import org.junit.Test;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/8/1 10:19
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class MergetNode {
    @Test
    public void test() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode result = new ListNode(0);
        ListNode pre = result;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                pre.next = new ListNode(l2.val);
                l1 = l1.next;
            } else {
                pre.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            pre = pre.next;
        }
        System.out.println(result);
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
