package com.luther.code;

import org.junit.Test;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/8/7 14:42
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class LengthOfLastWord {

    @Test
    public void test() {
        System.out.println(lengthOfLastWord("a "));
    }

    public int lengthOfLastWord(String s) {
        char SPACE = ' ';
        s = s.trim();
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (SPACE == c) {
                    count = 0;
            } else {
                count++;
            }
        }
        return count;
    }
}
