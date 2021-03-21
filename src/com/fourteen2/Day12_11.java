//package com.fourteen2;
//
//public class Day12_11 {
//    public static void main(String[] args) {
//        String a = "RDDRDDDDD";
//        System.out.println(new Solution().predictPartyVictory(a));
//    }
//}
//
//class Solution {
//    public String predictPartyVictory(String senate) {
//
//        StringBuilder s = new StringBuilder(senate);
//
//        int index = 0;
//        for (int i = 0; s.length() > 1; i++) {
//            if (i >= s.length())
//                i = 0;
//            if (s.charAt(i) == 'R') {
//                if ((index = s.indexOf("D", i)) != -1) {
//                    s = s.deleteCharAt(index);
//                } else {
//                    if ((index = s.indexOf("D")) != -1) {
//                        s = s.deleteCharAt(index);
//                    } else {
//                        return "Radiant";
//                    }
//                }
//            } else if (s.charAt(i) == 'D') {
//                if ((index = s.indexOf("R", i)) != -1) {
//                    s = s.deleteCharAt(index);
//                } else {
//                    if ((index = s.indexOf("R")) != -1) {
//                        s = s.deleteCharAt(index);
//                    } else {
//                        return "Dire";
//                    }
//                }
//            }
//        }
//
//        return s.charAt(0) == 'R' ? "Radiant" : "Dire";
//    }
//}
