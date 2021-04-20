//package com.fourteen6;
//
//import java.math.BigDecimal;
//import java.util.Arrays;
//
//public class Day4_17 {
//    public static void main(String[] args) {
//        int[] nums = {2147483646, 2147483647};
//        int k = 3, t = 3;
//        System.out.println(new Solution().containsNearbyAlmostDuplicate(nums, k, t));
//    }
//}
//
//
//class Solution {
//    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
//
//        int i = 0, j = i + 1;
//        while (i < nums.length - k || (nums.length <= k && i < nums.length-1)) {
//            if (j - i > k) {
//                i++;
//                j = i + 1;
//            } else {
//                BigDecimal num_j = new BigDecimal(nums[j]);
//                BigDecimal num_i = new BigDecimal(nums[i]);
//                BigDecimal decimal = num_i.subtract(num_j).abs();
//                if (decimal.compareTo(new BigDecimal(t)) <= 0) {
//                    return true;
//                }
//                j++;
//            }
//        }
//        return false;
//    }
//}