package com.luther.code;

import org.junit.Test;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/8/6 14:36
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class MaxSubArray {

    @Test
    public void test(){
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    //动态规划
    public int maxSubArray(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int sum = 0;
        int result = nums[0];
        for (int i = 0; i< nums.length; i++){
            if (sum > 0){
                sum += nums[i];
            }else{
                sum = nums[i];
            }
            result = Math.max(result, sum);
        }
        return result;
    }

    //二分法
    public int maxSubArray2(int[] nums){
        return 0;
    }
}
