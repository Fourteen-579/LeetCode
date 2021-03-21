//package com.fourteen2;
//
//public class Day12_7 {
//    public static void main(String[] args) {
//        int[][]  A={{0,0,1,1},{1,0,1,0},{1,1,0,0}};
//        System.out.println(new Solution().matrixScore(A));
//    }
//}
//
//class Solution {
//
//
//    public int matrixScore(int[][] A) {
//        int result = 0;
//        int[] sum = new int[A[0].length];
//
//        for (int i = 0; i < A.length; i++) {
//            if (A[i][0] == 0) {
//                for (int j = 0; j < A[0].length; j++) {
//                    if (A[i][j] == 0)
//                        A[i][j] = 1;
//                    else
//                        A[i][j] = 0;
//                }
//            }
//        }
//
//        for (int i = 0; i < A[0].length; i++) {
//            for (int j = 0; j < A.length; j++) {
//                sum[i] += A[j][i];
//            }
//            if (sum[i] <= A.length / 2) {
//                for (int k = 0; k < A.length; k++) {
//                    if (A[k][i] == 0)
//                        A[k][i] = 1;
//                    else
//                        A[k][i] = 0;
//                }
//            }
//        }
//        StringBuilder s = new StringBuilder();
//
//        for (int i = 0; i < A.length; i++) {
//            for (int j = 0; j < A[0].length; j++) {
//                s.append(A[i][j]);
//            }
//            result += Integer.parseInt(s.toString(),2);
//            s.delete(0,s.length());
//        }
//
//
//        return result;
//
//    }
//}