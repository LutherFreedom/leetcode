package com.luther.code;

import java.util.HashMap;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/9/30 11:48
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> cache = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (cache.get(s.charAt(i)) == null) {
                cache.put(s.charAt(i), t.charAt(i));
                continue;
            }
            if (cache.get(s.charAt(i)) != null && !cache.get(s.charAt(i)).equals(t.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
