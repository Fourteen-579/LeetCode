//package com.fourteen2;
//
//public class Day12_9 {
//    public static void main(String[] args) {
//        int m = 3;
//        int n = 7;
//        System.out.println(new Solution().uniquePaths(m, n));
//    }
//}
//
//class Solution {
//
//    public int tool(int m, int n) {
//        if (m == 1 || n == 1)
//            return 1;
//        return tool(m - 1, n) + tool(m, n - 1);
//    }
//
//    public int uniquePaths(int m, int n) {
//        return tool(m,n);
//    }
//
////    public int uniquePaths(int m, int n) {
////        if (m == 1)
////            return n - 1;
////        if (n == 1)
////            return m - 1;
////        int x = m - 1, y = n - 1;
////        double re1 = 1;
////        double re2 = 1;
////        int max = Math.max(x, y);
////        for (int i = x + y; i > max; i--) {
////            re1 *= i;
////        }
////        for (int i = Math.min(x, y); i >= 1; i--) {
////            re2 *= i;
////        }
////        return (int) (re1 / re2);
////    }
//}
