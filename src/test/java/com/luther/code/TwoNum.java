package com.luther.code;

import org.junit.Test;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/7/30 10:39
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class TwoNum {

    @Test
    public void test(){
        System.out.println(new String(-109 + ""));
        int[] nums = new int[]{1,6,4,8,0};
        System.out.println(twoSum(nums, 9));
    }
    private int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i< nums.length -1; i++){
            if(nums[i] > target){
                continue;
            }
            result[0] = i;
            int a = nums[i];
            int b = target - nums[i];
            for(int j = i+1; j< nums.length; j++){
                if(b == nums[j]){
                    result[1] = j;
                    return result;
                }
            }
        }
        return new int[2];
    }
}
