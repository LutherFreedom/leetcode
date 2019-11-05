package com.luther.code;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/8/28 9:27
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO: 118 杨辉三角
 */
public class Generate {
    @Test
    public void test(){
        generate(5);
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if (numRows == 0) {
            return result;
        }
        for (int i = 1; i < numRows + 1; i++) {
            List<Integer> innerList = new ArrayList<>();
            innerList.add(1);
            if (i == 1) {
                result.add(innerList);
                continue;
            }
            List<Integer> preList = result.get(i - 2);
            for (int j = 1; j < i - 1; j++) {
                innerList.add(preList.get(j -1) + preList.get(j));
            }
            innerList.add(1);
            result.add(innerList);
        }
        return result;
    }
}
