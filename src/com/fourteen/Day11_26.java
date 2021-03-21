//package com.fourteen;
//
//import java.util.Arrays;
//
//public class Day11_26 {
//    public static void main(String[] args) {
//        int []nums = {3, 6, 9, 1,13};
//        System.out.println(new Solution().maximumGap(nums));
//    }
//}
//
//class Solution {
//    public int maximumGap(int[] nums) {
//        int count = 0;
//
//        if (nums.length < 2)
//            return count;
//
//        Arrays.sort(nums);
//        count = nums[1] - nums[0];
//        for (int i = 1; i < nums.length - 1; i++) {
//            if (count < (nums[i + 1] - nums[i])) {
//
//                count = nums[i + 1] - nums[i];
//
//            }
//        }
//
//        return count;
//    }
//}