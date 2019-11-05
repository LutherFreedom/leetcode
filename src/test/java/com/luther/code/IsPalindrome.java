package com.luther.code;

import org.junit.Test;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/8/30 11:42
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class IsPalindrome {
    @Test
    public void test(){
        isPalindrome("A man, a plan, a canal: Panama");
    }
    public boolean isPalindrome(String s) {
        if (s== null || s.length() == 0){
            return true;
        }
        s = s.toLowerCase();
        char[] cs = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i =0; i<cs.length; i++){
            if (isAlphanumeric(cs[i])){
                sb.append(cs[i]);
            }
        }
        String before = new String(sb);
        return sb.reverse().toString().equals(before);
    }

    private boolean isAlphanumeric(char c){
        return (c>= 'a' && c<='z') || (c>='0' && c<= '9');
    }
}
