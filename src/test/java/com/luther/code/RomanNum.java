package com.luther.code;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/7/31 10:04
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class RomanNum {
    @Test
    public void test() {
        String romanStr = "IV";
        Map<String, Integer> commonMap = new HashMap<String, Integer>() {
            {
                put("I", 1);
                put("V", 5);
                put("X", 10);
                put("L", 50);
                put("C", 100);
                put("D", 500);
                put("M", 1000);
            }
        };
        Map<String, Integer> speciMap = new HashMap<String, Integer>() {
            {
                put("IV", 2);
                put("IX", 2);
                put("XL", 20);
                put("XC", 20);
                put("CD", 200);
                put("CM", 200);
            }
        };
        char[] chars = romanStr.toCharArray();
        int result = 0;
        for (char c : chars) {
            result += commonMap.get(c + "");
        }

        for (String key : speciMap.keySet()) {
            if (romanStr.contains(key)) {
                result -= speciMap.get(key);
            }
        }

        System.out.println(result);
    }

    @Test
    public void test2() {
        String romanStr = "III";
        Map<String, Integer> commonMap = new HashMap<String, Integer>() {
            {
                put("I", 1);
                put("V", 5);
                put("X", 10);
                put("L", 50);
                put("C", 100);
                put("D", 500);
                put("M", 1000);
                put("IV", 4);
                put("IX", 9);
                put("XL", 40);
                put("XC", 90);
                put("CD", 400);
                put("CM", 900);
            }
        };
        int result = 0;
        for (int i = 0; i < romanStr.length();) {
            if (i + 2 <= romanStr.length() && commonMap.containsKey(romanStr.substring(i, i+2))){
                result+= commonMap.get(romanStr.substring(i, i+2));
                i+=2;
            }else{
                result+= commonMap.get(romanStr.substring(i, i+1));
                i++;
            }
        }
        System.out.println(result);
    }
}
