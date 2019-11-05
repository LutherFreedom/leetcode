package com.luther.code;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/10/15 10:22
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
         revert(root);
         return root;
    }

    private void revert(TreeNode tree) {
        if (tree == null) {
            return;
        }
        TreeNode left = tree.left;
        TreeNode right = tree.right;
        revert(left);
        revert(right);
        tree.right = left;
        tree.left = right;

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
