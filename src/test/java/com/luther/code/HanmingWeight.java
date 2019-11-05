package com.luther.code;

import org.junit.Test;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/9/26 17:01
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class HanmingWeight {
    @Test
    public void test() {
        System.out.println(hammingWeight(32));
    }

    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            int temp = n >> i;
            temp = temp & 1;
            if ((temp | 0) == 1) {
                count++;
            }
        }
        return count;
    }
}
