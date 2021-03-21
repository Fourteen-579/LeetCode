//package com.fourteen3;
//
//import java.util.Arrays;
//
//public class Day12_25 {
//    public static void main(String[] args) {
//        int[] g = {1, 2};
//        int[] s = {1, 2,3};
//        System.out.println(new Solution().findContentChildren(g, s));
//    }
//}
//
//class Solution {
//    public int findContentChildren(int[] g, int[] s) {
//        int child = 0;
//
//        Arrays.sort(g);
//        Arrays.sort(s);
//
//        for (int i = 0, j = 0; i < s.length && j < g.length; ) {
//            if (s[i] >= g[j]) {
//                child++;
//
//                j++;
//            }
//            i++;
//        }
//        return child;
//    }
//}