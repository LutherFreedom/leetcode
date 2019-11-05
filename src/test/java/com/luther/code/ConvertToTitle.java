package com.luther.code;

import org.junit.Test;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/9/5 9:49
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class ConvertToTitle {
    @Test
    public void test() {
        System.out.println(701 / 26);
        System.out.println(702 % 26);
        convertToTitle(702);
    }

    public String convertToTitle(int n) {
        if (n == 0) {
            return "";
        }

        String[] az = new String[]{
                "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y"
        };
        StringBuffer sb = new StringBuffer();
        while (n > 0) {
            int ans = n % 26;
            sb.insert(0,az[ans]);
            n = ans == 0 ? (n / 26) -1 : n/26;
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
