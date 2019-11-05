package com.luther.code;

import org.junit.Test;

import java.util.*;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/8/14 9:41
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class LevelOrderBottom {

    @Test
    public void test() {
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        orderBottom(root, 0, list);
        Collections.reverse(list);
        return list;
    }

    public void orderBottom(TreeNode node, int level, List<List<Integer>> list) {
        if (node == null) {
            return;
        }
        if (list.size() < level + 1) {
            List<Integer> inner = new ArrayList<>();
            inner.add(node.val);
            list.add(inner);
        } else {
            list.get(level).add(node.val);
        }
        level++;
        orderBottom(node.left, level, list);
        orderBottom(node.right, level, list);
    }

    public void orderBottom(TreeNode node, List<List<Integer>> list) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            int bound = queue.size();
            List<Integer> inn = new ArrayList<>();
            for (int i = 0; i < bound; i++) {
                TreeNode no = queue.poll();
                if (no != null) {
                    inn.add(no.val);
                    queue.add(no.left);
                    queue.add(no.right);
                }
            }
            if (inn.size() > 0) {
                list.add(inn);
            }
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
