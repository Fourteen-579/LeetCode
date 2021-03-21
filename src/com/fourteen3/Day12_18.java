//package com.fourteen3;
//
//import java.util.Arrays;
//
//public class Day12_18 {
//    public static void main(String[] args) {
//        String s = "aeaeaea";
//        String t = "aaaaeeee";
//        System.out.println(new Solution().findTheDifference(s,t));
//    }
//}
//
//class Solution {
//    public char findTheDifference(String s, String t) {
//        char[] temp = s.toCharArray();
//        Arrays.sort(temp);
//        String newS = new String(temp);
//
//        char[] temp1 = t.toCharArray();
//        Arrays.sort(temp1);
//        String newT = new String(temp1);
//        int i;
//        for (i = 0; i < newS.length(); i++) {
//            if (newS.charAt(i) != newT.charAt(i)) {
//                break;
//            }
//        }
//        return newT.charAt(i);
//    }
//}