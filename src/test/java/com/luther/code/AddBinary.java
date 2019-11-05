package com.luther.code;

import org.junit.Test;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/8/8 9:22
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class AddBinary {

    @Test
    public void test() {

        System.out.println(addBinary("11", "1"));
    }

    public String addBinary(String a, String b) {
        if (a.length() > b.length()) {
            String temp = "";
            for (int i = 0; i < a.length() - b.length(); i++) {
                temp += "0";
            }
            b = temp + b;
        }

        if (b.length() > a.length()) {
            String temp = "";
            for (int i = 0; i < b.length() - a.length(); i++) {
                temp += "0";
            }
            a = temp + a;
        }
        int jinwei = 0;
        String reuslt = "";
        for (int i = a.length() -1; i >=0; i--) {
            int current = Integer.parseInt(String.valueOf(a.charAt(i)));
            current = current +Integer.parseInt(String.valueOf(b.charAt(i)))+ jinwei;
            if (current == 2){
                current =0;
                jinwei = 1;
            }
            else if (current == 3){
                current = 1;
                jinwei = 1;
            }
            else {
                jinwei = 0;
            }
            reuslt = current + reuslt;
        }
        if (jinwei > 0){
            reuslt = "1"+reuslt;
        }
        return reuslt;
    }


}
