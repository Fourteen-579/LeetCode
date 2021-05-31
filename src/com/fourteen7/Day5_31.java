//package com.fourteen7;
//
//public class Day5_31 {
//    public static void main(String[] args) {
//        int n = -64;
//        System.out.println(new Solution().isPowerOfFour(n));
//    }
//}
//
//class Solution {
//    public boolean isPowerOfFour(int n) {
//        long x = n;
//        if (x <= 0)
//            return false;
//        while (x > 1) {
//            if (x / 4 * 4 != x)
//                return false;
//            else
//                x /= 4;
//        }
//        return true;
//    }
//}
