//package com.fourteen3;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//
//public class Day12_23 {
//    public static void main(String[] args) {
//        String s = "lleettccododeii";
//        System.out.println(new Solution().firstUniqChar(s));
//    }
//}
//
//class Solution {
//    public int firstUniqChar(String s) {
//        if(s.length()==0)
//            return -1;
//        else if(s.length()==1)
//            return 0;
//        int index = 0;
//        int i = 0;
//        for (; i < s.length() - 1; i++) {
//            if(s.charAt(i)=='|')
//                continue;
//            index = s.indexOf(s.charAt(i), i + 1);
//            if (index == -1)
//                break;
//            else{
//                s=s.replace(s.charAt(i),'|');
//            }
//        }
//        if(s.charAt(i)=='|')
//            i=-1;
//        return i;
//    }
//}
