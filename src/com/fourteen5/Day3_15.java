//package com.fourteen5;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Day3_15 {
//    public static void main(String[] args) {
//        int[][] m = {{1,2}};
//        System.out.println(new Solution().spiralOrder(m));
//    }
//}
//
//class Solution {
//
//
//    public List<Integer> spiralOrder(int[][] matrix) {
//        List<Integer> list = new ArrayList<>();
//        int m = matrix.length;
//        int n = matrix[0].length;
//
//        int lmin = 0, hmin = 0;
//        int lmax = n - 1, hmax = m - 1;
//        int i = 0;
//        while (lmin <= lmax && hmin <= hmax) {
//
//            for (i = lmin; i <= lmax; i++)
//                list.add(matrix[hmin][i]);
//
//            if (++hmin > hmax) break;
//
//            for (i = hmin; i <= hmax; i++)
//                list.add(matrix[i][lmax]);
//
//            if (--lmax < lmin) break;
//
//            for (i = lmax; i >= lmin; i--)
//                list.add(matrix[hmax][i]);
//
//            if (--hmax < hmin) break;
//
//            for (i = hmax; i >= hmin; i--)
//                list.add(matrix[i][lmin]);
//
//            if (++lmin > lmax) break;
//        }
//
//        return list;
//    }
//}