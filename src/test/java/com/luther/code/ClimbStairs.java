package com.luther.code;

import org.junit.Test;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/8/9 9:33
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class ClimbStairs {
    @Test
    public void test(){
        System.out.println(climbStairs(4));
    }
    //解答方案：第n阶梯的方案有两种， 及 第n-1阶梯再上一阶梯 或者 第n-2阶梯再上一阶梯， 所以 d(n) = d(n-1) + d(n-2)
    public int climbStairs(int n) {
        int[] d = new int[n];
        d[0] = 1;
        d[1] = 2;
        for (int i = 2; i < n ; i++) {
            d[i] = d[i-1] + d[i-2];
        }
        return d[n-1];
    }
}
