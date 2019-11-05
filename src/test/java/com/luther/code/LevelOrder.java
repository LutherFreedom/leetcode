package com.luther.code;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/8/13 9:48
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class LevelOrder {
    @Test
    public void test() {
        levelOrder(new TreeNode(1));
    }

    //迭代方法
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int bound = 1;
        List<List<Integer>> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < bound; i++) {
                TreeNode tree = queue.poll();
                list.add(tree.val);
                if (tree.left != null) {
                    queue.add(tree.left);
                }
                if (tree.right != null) {
                    queue.add(tree.right);
                }
            }
            bound = queue.size();
            result.add(list);
        }
        return result;
    }

    //递归方法
    public List<List<Integer>> levelOrder2(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        boolean left = true;
        List<List<Integer>> list = new ArrayList<>();
        order(root, 0, list);
        return list;
    }

    private void order(TreeNode node, int level, List<List<Integer>> list) {
        if (node == null) {
            return;
        }
        if (list.size() < level + 1) {
            List<Integer> innerList = new ArrayList<>();
            innerList.add(node.val);
            list.add(innerList);
        } else {
            list.get(level).add(node.val);
        }
        ++level;
            order(node.left, level, list);
            order(node.right, level, list);

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
