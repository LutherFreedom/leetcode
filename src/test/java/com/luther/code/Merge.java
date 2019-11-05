package com.luther.code;

import org.junit.Test;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/8/9 10:20
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class Merge {
    @Test
    public void test() {
        int[] nums1 = new int[]{ 0};
        int[] nums2 = new int[]{1};
        merge(nums1, 0, nums2, 1);
        System.out.println(1);
        ;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0){
            return;
        }
        if (m == 0){
            while (n > 0){
                nums1[n -1] = nums2[n-1];
                n --;
            }
            return;
        }
        while (n > 0) {
            if (m == 0 || nums2[n - 1] > nums1[m - 1]) {
                nums1[m + n - 1] = nums2[n - 1];
                nums2[n - 1] = 0;
                n--;
                continue;
            }
            nums1[m + n - 1] = nums1[m - 1];
            nums1[m - 1] = 0;
            m = m > 0 ? m - 1 : m;
        }
    }
}
