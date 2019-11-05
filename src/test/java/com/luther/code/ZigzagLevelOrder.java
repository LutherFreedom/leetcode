package com.luther.code;

import java.util.ArrayList;
import java.util.List;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/8/13 10:59
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class ZigzagLevelOrder {
//    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//
//    }

    private void order(LevelOrder.TreeNode node, int level, List<List<Integer>> list) {
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
