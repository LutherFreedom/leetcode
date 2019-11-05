package com.luther.code;

import org.junit.Test;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/8/14 10:12
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class SortedArrayToBST {

    @Test
    public void test() {
    }

    public TreeNode sortedArrayToBST(int[] nums) {
       return sortedArray(nums, 0, nums.length);
    }

    private TreeNode sortedArray(int[] nums, int start, int end) {
        if (start == end) {
            return null;
        }
        int mid = (start + end) >> 1;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = sortedArray(nums, start, mid);
        treeNode.right = sortedArray(nums, mid + 1, end);
        return treeNode;
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
