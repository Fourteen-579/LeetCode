//package com.fourteen2;
//
//public class Day12_3 {
//    public static void main(String[] args) {
//        System.out.println(new Solution().countPrimes(3));
//    }
//}
//
////class Solution {
////
////    public boolean isPer(int n) {
////
////        for (int i = 2; i <= Math.sqrt(n); i++) {
////            if (n % i == 0)
////                return false;
////        }
////        return true;
////    }
////
////    public int countPrimes(int n) {
////
////        if (n == 0 || n == 1 || n == 2)
////            return 0;
////        int count = 1;
////
////        for (int i = 3; i < n; i++) {
////            if (isPer(i)) {
////                count++;
////            }
////        }
////        return count;
////    }
////}
//
//class Solution {
//
//
//    public int countPrimes(int n) {
//
//        if (n <= 2)
//            return 0;
//        int count = 0;
//
//        byte[] nums = new byte[n];
//        for (int i = 2; i < n; i++) {
//            if (nums[i] == -1)
//                continue;
//            count++;
//            for (int j = 2; j * i < n; j++) {
//                nums[j * i] = -1;
//            }
//        }
//
//        return count;
//    }
//}
