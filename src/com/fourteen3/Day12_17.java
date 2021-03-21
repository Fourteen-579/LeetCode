//package com.fourteen3;
//
//import java.util.Arrays;
//
//public class Day12_17 {
//    public static void main(String[] args) {
//        int[] p = {1, 3, 2, 8, 4, 9};
//        int fee = 2;
////        [9,8,7,1,2]
////3
//        System.out.println(new Solution().maxProfit(p, fee));
//    }
//}
//
//class Solution {
//    public int maxProfit(int[] prices, int fee) {
//
//        if (prices.length < 2)
//            return 0;
//
//        if (Arrays.stream(prices).max().getAsInt() <= fee)
//            return 0;
//
//        int sell = -prices[0] - fee;
//        int buy = 0;
//        for (int i = 1; i < prices.length; i++) {
//            sell = Math.max(sell, buy - prices[i] - fee);
//            buy = Math.max(sell + prices[i], buy);
//        }
//        return buy;
//    }
//}
