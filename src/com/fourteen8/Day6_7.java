//package com.fourteen8;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Stack;
//
//public class Day6_7 {
//    public static void main(String[] args) {
//        int[] nums = {2, 2, 2, 2, 2};
//        int target = 3;
//        System.out.println(new Solution().findTargetSumWays(nums, target));
//    }
//}
//
//class Solution {
//
//    public int tool(int[] nums, int target, int index, int re, int temp, int[] sum) {
//        if (index >= nums.length) {
//            if (temp == target)
//                return re + 1;
//            return re + 0;
//        }
//
//        if (Math.abs(target - temp) <= sum[index]) {
//
//            re = tool(nums, target, index + 1, re, temp + nums[index], sum);
//
//            re = tool(nums, target, index + 1, re, temp - nums[index], sum);
//
//        }
//
//        return re;
//    }
//
//    public int findTargetSumWays(int[] nums, int target) {
//        int[] sum = new int[nums.length];
//        sum[nums.length - 1] = nums[nums.length - 1];
//        for (int i = nums.length - 2; i >= 0; i--) {
//            sum[i] = sum[i + 1] + nums[i];
//        }
//
//        int re = 0;
//        if (sum[0] >= Math.abs(target))
//            re = tool(nums, target, 0, 0, 0, sum);
//        return re;
//    }
//}
