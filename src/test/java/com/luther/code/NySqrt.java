package com.luther.code;

import org.junit.Test;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/8/8 10:39
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO:
 */
public class NySqrt {

    @Test
    public void test(){
        System.out.println(46340 * 46340 <= 2147395600);
        System.out.println(46341*46341);
//        mySqrt(2147395600);
    }
    public int mySqrt(int x) {
        if (x == 0){
            return 0;
        }
        if (x==1){
            return 1;
        }
        int mid = x / 2;
        for (int i = 0; i< mid + 1; i++){
            if (i*i <= x && ((i+1)*(i+1) > x || (i+1)*(i+1) < 0)){
                return i;
            }
        }
        return -1;
    }
}
