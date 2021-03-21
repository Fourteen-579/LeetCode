//package com.fourteen2;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Day12_12 {
//    public static void main(String[] args) {
//        int[] nums = {};
//        System.out.println(new Solution().wiggleMaxLength(nums));
//    }
//}
//
//class Solution {
//    public int wiggleMaxLength(int[] nums) {
//
//        if (nums.length <= 1)
//            return nums.length;
//        if (nums.length == 2 && nums[0] != nums[1])
//            return 2;
//        else if (nums.length == 2 && nums[0] == nums[1])
//            return 1;
//
//        int up = 0, down = 0;
//        boolean needUp = true;
//        int i = 1;
//        while (i < nums.length && nums[0] == nums[i]) {
//            i++;
//        }
//        if (i == nums.length)
//            return 1;
//        if (nums[0] > nums[i]) {
//            down++;
//        } else if (nums[0] < nums[i]) {
//            up++;
//            needUp = false;
//        }
//
//        for (; i < nums.length - 1; i++) {
//            if (!needUp && nums[i] > nums[i + 1]) {
//                down++;
//                needUp = true;
//            } else if (needUp && nums[i] < nums[i + 1]) {
//                up++;
//                needUp = false;
//            }
//        }
//
//
//        return up + down + 1;
//    }
//}
