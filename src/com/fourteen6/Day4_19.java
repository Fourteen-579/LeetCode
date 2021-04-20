//package com.fourteen6;
//
//import java.util.Arrays;
//
//public class Day4_19 {
//    public static void main(String[] args) {
//        int[] nums = new int[]{2,2,2,2,2,2};
//        int val = 2;
//        int l = new Solution().removeElement(nums, val);
//        for (int i = 0; i < l; i++) {
//            System.out.print(nums[i] + "\t");
//        }
//    }
//}
//
//class Solution {
//    public int removeElement(int[] nums, int val) {
//        if (nums.length == 0)
//            return 0;
//        Arrays.sort(nums);
//        int begin = 0;
//        int temp = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == val) {
//                while (i < nums.length && nums[i] == val) {
//                    begin = i++;
//                }
//                break;
//            }
//            temp++;
//        }
//
//        int k = 1;
//        for (int i = temp; i < nums.length; i++) {
//            if (begin + k < nums.length)
//                nums[i] = nums[begin + k++];
//        }
//
//
//        return nums.length - (begin - temp + 1);
//    }
//}