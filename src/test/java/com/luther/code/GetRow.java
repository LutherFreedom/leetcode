package com.luther.code;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/8/28 9:50
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO: 119 杨辉三角2
 */
public class GetRow {
    @Test
    public void test(){
        getRow(3);
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        if (rowIndex == 0) {
            return result;
        }
        for (int i = 1; i < rowIndex + 1; i++) {
            List<Integer> replace = new ArrayList<>();
            replace.add(1);
            for (int j = 1; j < i; j++) {
                replace.add(result.get(j - 1) + result.get(j));
            }
            replace.add(1);
            result = replace;
        }
        return result;
    }
}
