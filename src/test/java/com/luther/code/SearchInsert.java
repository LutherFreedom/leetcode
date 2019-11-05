package com.luther.code;

import org.junit.Test;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/8/6 11:37
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class SearchInsert {
    @Test
    public void test() {
        int[] nums = new int[]{1,3,5,6};
        int target = 4;
        System.out.println(searchInsert(nums, target));

    }

    public int searchInsert(int[] nums, int target) {
        if (nums.length == 1) {
            if (target == nums[0]) {
                return 0;
            } else if (target > nums[0]){
                return 1;
            }else{
                return 0;
            }
        }
        boolean isAsc = true; // nums[0] < num[1]
        if (nums[0] > nums[1]) {
            isAsc = false;
        }
        if (isAsc){
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target){
                    return i;
                }
                if (nums[i] > target){
                    return i;
                }
            }
        }else{
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target){
                    return i;
                }
                if (nums[i] < target){
                    return i;
                }
            }
        }
        return nums.length;
    }

    //二分查找
}
