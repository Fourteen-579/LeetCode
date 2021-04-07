//package com.fourteen5;
//
//import java.util.Arrays;
//
//public class Day3_30 {
//    public static void main(String[] args) {
//        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
//        int target = 13;
//        System.out.println(new Solution().searchMatrix(matrix, target));
//    }
//}
//
//class Solution {
//    public boolean searchMatrix(int[][] matrix, int target) {
//        for (int i = 0; i < matrix.length; i++) {
//            int o =Arrays.binarySearch(matrix[i], target);
//            if (o<=-1) {
//                return true;
//            }
//        }
//        return false;
//    }
//}