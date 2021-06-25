//package com.fourteen8;
//
//public class Day6_8 {
//    public static void main(String[] args) {
//        int[] s = {1,2};
//        System.out.println(new Solution().lastStoneWeightII(s));
//    }
//}
//
//class Solution {
//    public int lastStoneWeightII(int[] stones) {
//        int sum = 0;
//        for (int i = 0; i < stones.length; i++) {
//            sum += stones[i];
//        }
//        int temp = sum / 2;
//        int[] dp = new int[temp + 1];
//        dp[0] = 0;
//        for (int i = stones[0]; i <=temp; i++) {
//            dp[i] = stones[0];
//        }
//
//        for (int i = 1; i < stones.length; i++) {
//            for (int j = stones[i]; j <= temp; j--) {
//                dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
//            }
//        }
//
//        return sum - 2 * dp[temp];
//    }
//}
