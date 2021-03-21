//package com.fourteen5;
//
//
//public class Day3_16 {
//    public static void main(String[] args) {
//        System.out.println(new Solution().generateMatrix(1));
//    }
//}
//
//
//class Solution {
//
//
//    public int[][] generateMatrix(int n) {
//        int[][] array = new int[n][n];
//
//        int lmin = 0, hmin = 0;
//        int lmax = n - 1, hmax = lmax;
//        int i, nums = 1;
//        int n2 = n * n;
//        while (nums <= n2) {
//
//            for (i = lmin; i <= lmax; i++)
//                array[hmin][i] = nums++;
//
//            if (++hmin > hmax) break;
//
//            for (i = hmin; i <= hmax; i++)
//                array[i][lmax] = nums++;
//
//
//            if (--lmax < lmin) break;
//
//            for (i = lmax; i >= lmin; i--)
//                array[hmax][i] = nums++;
//
//
//            if (--hmax < hmin) break;
//
//            for (i = hmax; i >= hmin; i--)
//                array[i][lmin] = nums++;
//
//            if (++lmin > lmax) break;
//        }
//
//        return array;
//    }
//}