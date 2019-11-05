package com.luther.code;

import org.junit.Test;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/9/30 10:46
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class CountPrimes {

    @Test
    public void test() {
        countPrimes(499979);
    }

    public int countPrimes(int n) {

        boolean sign[] = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!sign[i - 1]) {
                count ++;
                for (int j = i + i; j < n; j += i) {
                    sign[j-1] = true;
                }
            }
        }
        return count;
    }
}
;