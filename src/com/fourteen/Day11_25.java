//package com.fourteen;
//
//import java.util.Arrays;
//import java.util.TreeSet;
//
//public class Day11_25 {
//    public static void main(String[] args) {
//        String s = "aaaabbbbcccc";
//
//        System.out.println(new Solution().sortString(s));
//    }
//}
//
//class Solution {
//    public String sortString(String s) {
//        char[] ss = s.toCharArray();
//        Arrays.sort(ss);
//        String result = "";
//        int nums = 0;
//        while (nums < s.length()) {
//            int i = 0;
//            int length = result.length();
//            if(length!=0)
//            ss = new StringBuffer(String.valueOf(ss)).reverse().toString().toCharArray();
//            while (i < ss.length) {
//                if (result.indexOf(String.valueOf(ss[i]), length) == -1) {
//                    result += String.valueOf(ss[i]);
//                    nums++;
//                    ss = new String(ss).replaceFirst(String.valueOf(ss[i]), "").toCharArray();
//                    --i;
//                }
//                i++;
//            }
//            ss = new StringBuffer(String.valueOf(ss)).reverse().toString().toCharArray();
//            i = 0;
//            length = result.length();
//            while (i < ss.length) {
//                if (result.indexOf(String.valueOf(ss[i]), length) == -1) {
//                    result += String.valueOf(ss[i]);
//                    nums++;
//                    ss = new String(ss).replaceFirst(String.valueOf(ss[i]), "").toCharArray();
//                    --i;
//                }
//
//                i++;
//            }
//        }
//
//        return result;
//    }
//}