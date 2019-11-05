package com.luther.code;

import org.junit.Test;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/9/24 10:04
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class Rotate {

    @Test
    public void test() {
        int[] nums = new int[]{1, 2, 4, 5};
        rotate(nums, 1);
    }

    public void rotate(int[] nums, int k) {
        int doubleLength = nums.length * 2;
        int[] doubleNums = new int[doubleLength];

        System.arraycopy(nums, 0, doubleNums, 0, nums.length);
        System.arraycopy(nums, 0, doubleNums, nums.length, nums.length);
        int offest = nums.length - k % nums.length;

        System.arraycopy(doubleNums, offest, nums, 0, nums.length);
    }
}
