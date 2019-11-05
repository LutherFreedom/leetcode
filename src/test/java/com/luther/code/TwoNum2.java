package com.luther.code;

import org.junit.Test;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/9/4 10:13
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO: 167
 */
public class TwoNum2 {
    @Test
    public void test() {
        int[] source = new int[]{2, 7, 11,15};
        twoSum(source, 9);
    }

    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target){
                return new int[]{i+1, j+1};
            }
            if (numbers[i] + numbers[j] < target){
                i++;
            }else{
                j--;
            }
        }
        return new int[0];
    }
}
