package com.luther.code;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/8/15 10:53
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class MinDepth {
    public int minDepth(TreeNode root) {
        return level(root) +  1;
    }

    public int level(TreeNode tree) {
        if (tree == null) {
            return 0;
        }
        int left = level(tree.left);
        int right = level(tree.right);
        return tree.left == null || tree.right == null ? left + right + 1 : Math.min(left, right);
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
