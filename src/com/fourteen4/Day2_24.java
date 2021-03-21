//package com.fourteen4;
//
//public class Day2_24 {
//    public static void main(String[] args) {
//        int[][] A= {{1,1,0},{1,0,1},{0,0,0}};
//        System.out.println(new Solution().flipAndInvertImage(A));
//    }
//}
//
//class Solution {
//    public int[][] flipAndInvertImage(int[][] A) {
//        int length = A.length;
//        for (int i = 0; i < length; i++) {
//            for (int j = 0; j < length / 2; j++) {
//                int temp = A[i][j];
//                A[i][j] = A[i][length - j - 1];
//                A[i][length - j - 1] = temp;
//            }
//            for (int j = 0; j < length; j++) {
//                if (A[i][j] == 1)
//                    A[i][j] = 0;
//                else
//                    A[i][j] = 1;
//            }
//        }
//        return A;
//    }
//}