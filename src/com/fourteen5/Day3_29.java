//package com.fourteen5;
//
//public class Day3_29 {
//    public static void main(String[] args) {
//        int i = 0b00000010100101000001111010011100;
//        System.out.println(new Solution().reverseBits(i));
//    }
//}
//
//class Solution {
//    // you need treat n as an unsigned value
//    public int reverseBits(int n) {
////        String s = Integer.toBinaryString(n);
////        if (s.length() < 32) {
////            int i = 32 - s.length();
////            String temp = "0";
////            int j = 1;
////            while (j++ < i) {
////                temp += "0";
////            }
////            s = temp+s;
////        }
////        StringBuilder stringBuilder = new StringBuilder(s).reverse();
////        int i = Integer.parseUnsignedInt(stringBuilder.toString(),2);
//        return Integer.reverse(n);
//    }
//}