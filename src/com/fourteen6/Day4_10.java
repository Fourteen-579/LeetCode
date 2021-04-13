//package com.fourteen6;
//
//public class Day4_10 {
//    public static void main(String[] args) {
//        System.out.println(new Solution().isUgly(-2147483648));
//    }
//}
//
//
//class Solution {
//    public boolean isUgly(int n) {
//        if (n == 1)
//            return true;
//        else if (n <= 0)
//            return false;
//        while (n > 1) {
//            if (n % 2 == 0)
//                n /= 2;
//            else if (n % 3 == 0)
//                n /= 3;
//            else if (n % 5 == 0)
//                n /= 5;
//            else
//                return false;
//        }
//        return true;
//    }
//}