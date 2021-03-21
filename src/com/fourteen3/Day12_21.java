//package com.fourteen3;
//
//public class Day12_21 {
//    public static void main(String[] args) {
//        int[] cost = {10, 15, 20};
//        System.out.println(new Solution().minCostClimbingStairs(cost));
//    }
//}
//
//
//class Solution {
//
//    public int minCostClimbingStairs(int[] cost) {
//        int length = cost.length;
//        int[] m = new int[length + 1];
//        m[0] = cost[0];
//        m[1]=cost[1];
//        for (int i = 2; i < length; i++) {
//            m[i] = Math.min(m[i - 1], m[i - 2])+cost[i];
//        }
//        m[length]=Math.min(m[length - 1], m[length - 2]);
//        return Math.min(m[length], m[length - 1]);
//    }
//}
