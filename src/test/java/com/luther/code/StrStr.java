package com.luther.code;

import org.junit.Test;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/8/5 17:57
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class StrStr {

    @Test
    public void test() {
        System.out.println(strStr("mississippi", "issip"));
    }
    private int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }
        if (haystack == null || haystack.length() == 0
                || haystack.length() < needle.length()){
            return -1;
        }
        char[] source = haystack.toCharArray();
        char[] target = needle.toCharArray();
        int index = -1;
        outloop:
        for (int i = 0; i < source.length - target.length + 1; i++) {
            if (source[i] != target[0]) {
                continue;
            }
            for (int j = 0; j < target.length; j++) {
                if (source[i + j] != target[j]) {
                    continue outloop;
                }
            }
            index = i;
            break;
        }
        return index;
    }
}
