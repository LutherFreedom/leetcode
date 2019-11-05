package com.luther.code;

import org.junit.Test;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/7/30 10:53
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class ReverseInt {
    @Test
    public void test() {
        System.out.println(doReverse2(1534236469));
    }

    private int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        if (x > 0) {
            return doReverse(x);
        } else {
            return -doReverse(-x);
        }
    }

    private int doReverse(int y) {
        if (y < 0)
            return 0;
        String a = y + "";
        String result = "";
        char[] chars = a.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == 0 && "".equals(result)) {
                continue;
            }
            result += chars[i];
        }
        long l = Long.valueOf(result);
        if (l > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) l;
    }

    private int doReverse2(int x) {
        int ans = 0;
        while (x != 0) {
            int pop = x % 10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }

            ans = ans * 10 + pop;
            x /= 10;
        }
        return ans;
    }
}
