//package com.fourteen;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Stack;
//
//public class Day11_30 {
//    public static void main(String[] args) {
//        String S = "nowpwibfd";
//        System.out.println(new Solution().reorganizeString(S));
//    }
//}
//
//class Solution {
//    public String reorganizeString(String S) {
//        if (S.length() == 1) {
//            return S;
//        }
//        char[] ss = S.toCharArray();
//        int[] temp = new int[26];
//
//        for (int i = 0; i < S.length(); i++) {
//            temp[ss[i] - 'a'] += 1;
//        }
//        int max = 0;
//        for (int i = 1; i < temp.length; i++) {
//            if (temp[max] < temp[i]) {
//                max = i;
//            }
//        }
//
//
//        if (temp[max] > Math.ceil(S.length() / 2.0)) {
//            return "";
//        }
//
//        char[] result = new char[S.length()];
//        for (int i = 0; i < ss.length; i += 2) {
//            if (temp[max] == 0) {
//                while (temp[max] == 0) {
//                    max++;
//                    if (max == 26) {
//                        max = 0;
//                    }
//                }
//            }
//            temp[max]--;
//            result[i] = (char) (max + 'a');
//        }
//
//        int j = 0;
//        for (int i = 1; i < ss.length; i += 2) {
//            if (temp[max] == 0) {
//                while (temp[max] == 0) {
//
//                    max++;
//                    if (max == 26) {
//                        max = 0;
//                    }
//                }
//            }
//            temp[max]--;
//            result[i] = (char) (max + 'a');
//        }
//
//
//        return String.valueOf(result);
//    }
//}