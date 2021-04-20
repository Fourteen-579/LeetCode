//package com.fourteen6;
//
//import java.util.Arrays;
//
//public class Day4_15 {
//    public static void main(String[] args) {
//        int[] nums = new int[]{1,2,1,1};
//        System.out.println(new Solution().rob(nums));
//    }
//}
//
////class Solution {
////
////    public int tool(int[] nums, boolean[] isTou, int money, int index) {
////        if (index >= nums.length)
////            return money;
////        int max = money;
////
////        if (isTou[index - 1]) {
////            max = Math.max(max, tool(nums, isTou, money, index + 1));
////        } else {
////            max = Math.max(max, tool(nums, isTou, money, index + 1));
////            if (index == nums.length - 1 && isTou[0]) {
////
////            } else {
////                isTou[index] = true;
////                max = Math.max(max, tool(nums, isTou, money + nums[index], index + 1));
////                isTou[index] = false;
////            }
////        }
////
////        return max;
////    }
////
////
////    public int rob(int[] nums) {
////        if (nums.length == 0)
////            return 0;
////        boolean[] isTou = new boolean[nums.length];
////        Arrays.fill(isTou, false);
////        int re1 = tool(nums, isTou, 0, 1);
////        Arrays.fill(isTou, false);
////        isTou[0] = true;
////        int re2 = tool(nums, isTou, nums[0], 1);
////        return Math.max(re1, re2);
////    }
////}
//
//class Solution {
//    public int rob(int[] nums) {
//        if (nums.length == 1)
//            return nums[0];
//
////        第一位为第几家 第二位为是否偷窃当前家 第三位为是否偷窃第一家
//        int[][][] dp = new int[nums.length][2][2];
//
//        dp[0][0][0] = 0;
//
//        dp[0][1][1] = nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//            dp[i][0][0] = Math.max(dp[i - 1][0][0], dp[i - 1][1][0]);
//            dp[i][1][0] = Math.max(dp[i - 1][0][0] + nums[i], dp[i - 1][0][0]);
//
//            dp[i][0][1] = Math.max(dp[i - 1][0][1], dp[i - 1][1][1]);
//            dp[i][1][1] = Math.max(dp[i - 1][0][1] + nums[i], dp[i - 1][0][1]);
//        }
//
//        return Math.max(Math.max(dp[nums.length-1][0][0],dp[nums.length-1][0][1]),dp[nums.length-1][1][0]);
//    }
//}