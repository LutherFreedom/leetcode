package com.luther.code;


import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/9/5 11:01
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class MajorityElement {
   @Test
    public void  test(){
        majorityElement(new int[]{3,3,4});
    }
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            }else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        int maxCount = -1;
        int majorNum = -1;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue()>maxCount){
                maxCount = entry.getValue();
                majorNum = entry.getKey();
            }
        }
        return majorNum;
    }
}
