package com.luther.code;

import java.util.LinkedList;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/9/4 9:55
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        LinkedList<ListNode> listA = new LinkedList<>();
        LinkedList<ListNode> listB = new LinkedList<>();
        while (headA != null) {
            listA.addFirst(headA);
            headA = headA.next;
        }
        while (headB != null) {
            listB.addFirst(headB);
            headB = headB.next;
        }
        if (listB.size() == 0)
            return null;
        ListNode result = null;
        for (int i = 0; i < listA.size() && i < listB.size(); i++) {
            if (listA.get(i).equals(listB.get(i))) {
                result = listA.get(i);
            } else {
                break;
            }
        }
        return result;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}

