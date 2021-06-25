//package com.fourteen8;
//
//public class Day6_9 {
//    public static void main(String[] args) {
//        int n = 10, minProfit = 5;
//        int[] group = {2, 3, 5};
//        int[] profit = {6, 7, 8};
//        System.out.println(new Solution().profitableSchemes(n, minProfit, group, profit));
//    }
//}
//
//class Solution {
//    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
//
//        int sum = 0;
//        for (int i = 0; i < profit.length; i++) {
//            sum += profit[i];
//        }
//
//        int[][] nums = new int[profit.length][sum + 1];
//        int[][] dp = new int[profit.length][sum + 1];
//
//        //当仅选择一项工作时
//        for (int i = 0; i < profit.length; i++) {
//            //如果当前工作利润大于等于最小利润 并且员工人数也满足
//            if (profit[i] >= minProfit && group[i] <= n) {
//                dp[i][profit[i]] = 1;
//                nums[i][profit[i]] = group[i];
//            }
//        }
//
//
//        for (int i = 1; i < profit.length; i++) {
//
//            for (int j = minProfit; j >= 0 ; j --) {
//                //不选取当前工作
//                dp[i][j] += dp[i - 1][j];
//                nums[i][j] += nums[i - 1][j];
//
//                //如果选取当前工作 员工人数是否能满足
//                if (nums[i - 1][Math.max(j - profit[i],0)] + group[i] <= n) {
//                    dp[i][j] += dp[i - 1][Math.max(j - profit[i],0)];
//                    nums[i][j] = nums[i - 1][Math.max(j - profit[i],0)] + group[i];
//                }
//            }
//
//        }
//
//        int re = 0;
//        for (int i = minProfit; i <= sum; i++) {
//            re += dp[profit.length - 1][i];
//        }
//
//        return re;
//    }
//}
