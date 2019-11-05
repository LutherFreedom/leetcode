package com.luther.code;

import org.junit.Test;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/9/10 10:07
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class Title2Number {
    @Test
    public void test() {
        titleToNumber("AB");
    }

    public int titleToNumber(String s) {
        String arr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        s = s.toUpperCase();
        int sum = 0;
        for (int i = s.length()-1; i >-1; i--) {
            int index = arr.indexOf(s.charAt(i));
            if (index > -1) {
                sum += (index + 1) * Math.pow(26, s.length() -1 -i);
            }
        }
        return sum;
    }
}
