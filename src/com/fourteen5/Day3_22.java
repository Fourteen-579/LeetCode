//package com.fourteen5;
//
//public class Day3_22 {
//    public static void main(String[] args) {
//        int n = 0b00000000000000000000000000001011;
//        System.out.println(new Solution().hammingWeight(n));
//    }
//}
//
//class Solution {
//    // you need to treat n as an unsigned value
//    public int hammingWeight(int n) {
//        String s = Integer.toBinaryString(n);
//
//        int re = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '1') {
//                re++;
//            }
//        }
//
//
//        return re;
//    }
//}