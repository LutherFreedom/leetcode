package com.luther.code;

import org.junit.Test;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/8/7 16:12
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class Digits {

    @Test
    public void test() {
        int[] digits = new int[]{1, 2, 9};
        int[] result = plusOne(digits);
        System.out.println("aa");
    }

    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int jinwei = 1;
        for (int i = length - 1; i >= 0; i--) {
            int result = digits[i] + jinwei;
            if (result > 9) {
                jinwei = 1;
                digits[i] = result - 10;
            } else {
                jinwei = 0;
                digits[i] = result;
            }
        }
        if (jinwei > 0) {
            int[] nums = new int[digits.length + 1];
            System.arraycopy(digits, 0, nums, 1, digits.length);
            nums[0] = jinwei;
            return nums;
        } else {
            return digits;
        }
    }


    public int[] plusOne2(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i]%10;
            if (digits[i] != 0){
                return digits;
            }
        }
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }
}
