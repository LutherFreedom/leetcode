package com.luther.code;

import org.junit.Test;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/8/5 17:15
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class RemoveDuplicates {
    @Test
    public void test() {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        if (nums.length < 2) {
            return;
        }
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[index++] = nums[i];
            }
        }
        System.out.println(nums.length);
    }
}
