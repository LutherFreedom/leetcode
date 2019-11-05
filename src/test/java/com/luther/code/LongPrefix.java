package com.luther.code;

import org.junit.Test;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/7/31 10:30
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class LongPrefix {
    @Test
    public void test() {
        String[] s = new String[]{"a", "ac"};
        if (s.length == 0) {
            return;
        }
        char[] chars = s[0].toCharArray();
        String pre = "";
        for (int i = 0; i < chars.length; i++) {
            for (int j = 1; j < s.length; j++) {
                if (s[j].length() == pre.length()){
                    System.out.println(pre);
                    return;
                }
                if (!s[j].startsWith(pre + chars[i])) {
                    System.out.println(pre);
                    return;
                }
            }
            pre += chars[i];
            System.out.println(pre);
        }
    }

    @Test
    public void test2(){
        String[] s = new String[]{"a", "ac"};
        if (s.length == 0) {
            return;
        }
        int length = s[0].length();
        String pre = "";
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < s.length; j++) {
                if (s[j].length() == pre.length()){
                    System.out.println(pre);
                    return;
                }
                if (s[j].charAt(i) != s[0].charAt(i)) {
                    System.out.println(pre);
                    return;
                }
            }
            pre += s[0].charAt(i);
            System.out.println(pre);
        }
    }
}
