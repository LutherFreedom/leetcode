package com.luther.code;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/10/10 11:17
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class ContainsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i< nums.length; i++){
            for (int j = Math.max(i -k , 0); j < i; j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
