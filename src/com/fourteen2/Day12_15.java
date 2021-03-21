//package com.fourteen2;
//
//public class Day12_15 {
//    public static void main(String[] args) {
//        int N = 123440;
//        System.out.println(new Solution().monotoneIncreasingDigits(N));
//    }
//}
//
//class Solution {
//    public int monotoneIncreasingDigits(int N) {
//
//        char[] nums = String.valueOf(N).toCharArray();
//        int i;
//        for (i = 0; i < nums.length - 1; i++) {
//            if (nums[i] <= nums[i + 1]) {
//                nums[i] = nums[i];
//            } else {
//                int j;
//                while (i > 0 && (char) (nums[i] - 1) < nums[i - 1]) {
//                    i--;
//                }
//                nums[i] = (char) (nums[i] - 1);
//                for (j = i + 1; j < nums.length; j++) {
//                    nums[j] = '9';
//                }
//                break;
//            }
//        }
//
//
//        return Integer.parseInt(String.valueOf(nums));
//    }
//}