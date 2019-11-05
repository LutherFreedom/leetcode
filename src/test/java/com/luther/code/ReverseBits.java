package com.luther.code;

import org.junit.Test;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/9/24 10:23
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class ReverseBits {

    @Test
    public void test() {
        reverseBits(6);
    }

    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int temp = n >> i;
            temp = temp & 1;
            System.out.println(temp);
            temp = temp << (31-i);
            result |= temp;
        }
        return result;
    }
}
