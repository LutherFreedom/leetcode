package com.luther.code;

/**
 * All rights Reserved, Designed by Luther
 *
 * @auther: Luther
 * @createdTime: 2019/8/30 11:14
 * @version： 0.0.1
 * @copyRight: @2019
 * TODO: 121. 买卖股票的最佳时机
 * 122. 买卖股票的最佳时机 II
 */
public class MaxProfit {
    /**
     * 121
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                profit = profit > (prices[i] - min) ? profit : prices[i] - min;
            }
        }
        return profit;
    }

    /**
     * 122
     *
     * @param prices
     * @return
     */
    public int maxProfit2(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i - 1]) {
                continue;
            } else {
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}
