package com.luther.code;

import org.junit.Test;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/8/15 10:09
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class IsBalanced {
    @Test
    public void test() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.left.left = new TreeNode(4);
        treeNode.right = new TreeNode(2);
        treeNode.right.right = new TreeNode(3);
        treeNode.right.right.right = new TreeNode(4);
        isBalanced2(treeNode);
    }

    //找出minLevel 和 maxLevel
    public boolean isBalanced(TreeNode root) {
        return deep(root) != -1;
    }

    public boolean isBalanced2(TreeNode root) {
        if (root == null){
            return Boolean.TRUE;
        }
        int left = level(root.left, 0);
        int right = level(root.right, 0);
        return left != -1 && right != -1 &&Math.abs( left- right) <2;
    }

    public int deep(TreeNode tree) {
        if (tree == null) {
            return 0;
        }
        int left = deep(tree.left);
        if (left == -1) return -1;
        int right = deep(tree.right);
        if (right == -1) return -1;
        if (Math.abs(left - right) > 1) {
            return -1;
        }
        return Math.max(left, right) + 1;
    }

    public int level(TreeNode tree, int level) {
        if (tree == null) {
            return level;
        }
        level++;
        int left = level(tree.left, level);
        if (left == -1){
            return -1;
        }
        int right = level(tree.right, level);
        if (right == -1)return -1;
        if (Math.abs(left -right) > 1){
            return -1;
        }
        return Math.max(left, right);
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
