//package com.fourteen3;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//public class Day12_19 {
//    public static void main(String[] args) {
//        int[][] matrix =
//                {
//  { 5, 1, 9,11},
//  { 2, 4, 8,10},
//  {13, 3, 6, 7},
//  {15,14,12,16}
//};
//
//        new Solution().rotate(matrix);
//    }
//}
//
//class Solution {
//    public void rotate(int[][] matrix) {
//        int length = matrix.length;
//
//        //按行反转
//        for (int i = 0; i < length; i++) {
//            for (int j = 0; j < length / 2; j++) {
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[i][length - 1 - j];
//                matrix[i][length - 1 - j] = temp;
//            }
//        }
//
//        //按逆对角线反转
//        for (int i = 0; i < length; i++) {
//            for (int j = 0; j < length - i - 1; j++) {
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[length - 1 - j][length - 1 - i];
//                matrix[length - 1 - j][length - 1 - i] = temp;
//            }
//        }
//        for(int i=0;i<length;i++){
//            System.out.println(Arrays.toString(matrix[i]));
//        }
//    }
//}
