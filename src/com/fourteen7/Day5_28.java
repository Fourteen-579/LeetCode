//package com.fourteen7;
//
//public class Day5_28 {
//    public static void main(String[] args) {
//        int[] nums = {4,14,2};
//        int re = new Solution().totalHammingDistance(nums);
//        System.out.println(re);
//    }
//}
//
//
//class Solution {
//    public int totalHammingDistance(int[] nums) {
//        int re = 0;
//
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                re += Integer.bitCount(nums[i] ^ nums[j]);
//            }
//        }
//        return re;
//    }
//}
