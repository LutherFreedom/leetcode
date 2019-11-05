package com.luther.code;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/9/27 11:08
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class Rob {
    public int rob(int[] nums) {
        int preMax = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = Math.max(preMax + nums[i], sum);
            preMax = sum;
        }
        return sum;
    }
}
