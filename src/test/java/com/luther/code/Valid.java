package com.luther.code;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/7/31 10:54
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class Valid {
    @Test
    public void test() {
        String s = "([)]";
        Map<String, String> map = new HashMap<String, String>() {
            {
                put("(", ")");
                put("[", "]");
                put("{", "}");
            }
        };
        int length = s.length();
        if (length % 2 != 0) {
            System.out.println(false);
            return;
        }

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.empty()) {
                stack.push(s.charAt(i) + "");
                continue;
            }
            if ((s.charAt(i) + "").equals(map.get(stack.get(stack.size() - 1)))) {
                stack.pop();
                continue;
            }else{
                stack.push(s.charAt(i) + "");
            }
        }
        if (stack.size() > 0){
            System.out.println("false");
            return;
        }else{
            System.out.println(true);
        }
    }
}
