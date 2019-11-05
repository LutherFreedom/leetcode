package com.luther.code;

import org.junit.Test;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/8/5 17:38
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class RemoveElement {
    @Test
    public void test() {
        int[] nums = new int[]{0,1,2,2,3,0,4,24};
        int val = 2;
        removeElement(nums, val);

    }

    private int removeElement(int[] nums, int val) {
        if (nums.length < 2) {
            return nums.length;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
