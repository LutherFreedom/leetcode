package com.luther.code;

import org.junit.Test;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/9/26 17:08
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class TrailingZeroes {

    @Test
    public void test() {
        trailingZeroes(1808548329);
    }

    public int trailingZeroes(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int temp = i;
            while (temp > 0 && temp % 5 == 0) {
                count++;
                temp = temp / 5;
            }
        }
        return count;
    }
}
