//package com.fourteen6;
//
//import java.util.HashSet;
//import java.util.Queue;
//import java.util.Set;
//
//public class Day4_21 {
//    public static void main(String[] args) {
//        String s = "226";
//        System.out.println(new Solution().numDecodings(s));
//    }
//}
//
//
//class Solution {
//
//    public int numDecodings(String s) {
//
//        if (s.charAt(0) == '0')
//            return 0;
//        else if (s.charAt(s.length() - 1) == '0' && Integer.valueOf(s.substring(s.length() - 2)) > 20)
//            return 0;
//
////        第一个为当前到哪一位
////        第二个为当前是   1包括前一位 0不包括前一位
//        int[][] dp = new int[s.length()][2];
//        dp[0][0] = 1;
//        dp[0][1] = 0;
//        for (int i = 1; i < s.length(); i++) {
////            当前位单独分出来
////            1.如果当前为 为0 则不可以单独分出来
////            2.如果当前位 不为0
//            if (s.charAt(i) == '0')
//                dp[i][0] = 0;
//            else
//                dp[i][0] = dp[i - 1][0] + dp[i - 1][1];
//
//
////            当前位和前一个字符组合
////            如果当前位和前一个组合后不满足条件
//            if (Integer.valueOf(s.substring(i - 1, i + 1)) > 26 || s.charAt(i - 1) == '0')
//                dp[i][1] = 0;
//            else {
//                dp[i][1] = dp[i - 1][0];
//            }
//        }
//
//        return dp[s.length() - 1][0] + dp[s.length() - 1][1];
//    }
//}