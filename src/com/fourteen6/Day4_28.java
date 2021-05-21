//package com.fourteen6;
//
//public class Day4_28 {
//    public static void main(String[] args) {
//        int c = 0;
//        System.out.println(new Solution().judgeSquareSum(c));
//    }
//}
//
//class Solution {
//    public boolean judgeSquareSum(int c) {
//        int x = 0;
//        int y = (int) Math.sqrt(c);
//        while (x <= y) {
//            double re = x*x+y*y;
//            if (re - c == 0.0)
//                return true;
//            else if (re - c > 0.0) {
//                y--;
//            } else {
//                x++;
//            }
//        }
//        return false;
//    }
//}