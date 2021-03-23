//package com.fourteen5;
//
//import java.util.*;
//
//public class Day3_21 {
//    public static void main(String[] args) {
//        int[][] m = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
//        new Solution().setZeroes(m);
//        for(int i=0;i<m.length;i++){
//            System.out.println(Arrays.toString(m[i]));
//        }
//    }
//}
//
//class Solution {
//    public void setZeroes(int[][] matrix) {
//        Map<Integer, Integer> map1 = new HashMap<>();
//        Map<Integer, Integer> map2 = new HashMap<>();
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (matrix[i][j] == 0) {
//                    map1.put(i, 0);
//                    map2.put(j, 0);
//                }
//            }
//        }
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (map1.containsKey(i) || map2.containsKey(j)) {
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//
//    }
//}
