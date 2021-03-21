//package com.fourteen3;
//
//import java.util.Arrays;
//
//public class Day12_28 {
//    public static void main(String[] args) {
//        int k = 2;
//        int[] p = {3, 2, 6, 5, 0, 3};
//        System.out.println(new Solution().maxProfit(k, p));
//    }
//}
//
//class Solution {
//
//
//    public int maxProfit(int k, int[] prices) {
//        int[][][] dp = new int[prices.length][3][2];
//        dp[0][0][0]=0;
//        dp[0][1][1]=-prices[0];
//        for (int i = 1; i < prices.length; i++) {
//            for (int j = 0; j < 3; j++) {
//
//                //代表有股票
//                dp[i][j][1] = Math.max(dp[i-1][j+1][0] - prices[i], dp[i-1][j][1]);
//
//                //代表手上无股票
//                dp[i][j][0] = Math.max(dp[i-1][j][1] + prices[i], dp[i-1][j][0]);
//
//
//            }
//        }
//
//
//        return dp[prices.length - 1][2][0];
//    }
//}