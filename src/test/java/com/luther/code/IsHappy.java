package com.luther.code;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/9/27 11:28
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class IsHappy {

    private int pownum(int n) {
        int vaule = 0;
        while (n > 0) {
            int bit = n % 10;
            vaule += bit * bit;
            n = n / 10;
        }
        return vaule;
    }

    public boolean isHappy(int n) {
        while (n > 4) {
            n = pownum(n);
        }
        return n == 1;
    }
}

