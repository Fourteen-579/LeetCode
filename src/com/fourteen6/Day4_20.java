//package com.fourteen6;
//
//public class Day4_20 {
//    public static void main(String[] args) {
//        String i = "";
//        String j = "";
//        System.out.println(new Solution().strStr(i,j));
//    }
//}
//
//class Solution {
//    public int strStr(String haystack, String needle) {
//        if (needle.length() == 0)
//            return 0;
//        int length = needle.length();
//        for (int i = 0; i <= haystack.length(); i++) {
//            if ((i + length) <= haystack.length() && haystack.substring(i, length+i).equals(needle))
//                return i;
//        }
//        return -1;
//    }
//}