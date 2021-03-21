//package com.fourteen;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class Day11_27 {
//    public static void main(String[] args) {
//        int a[] = {1,1,-1,-1};
//        int b[] = {-1,-1,1,1};
//        int c[] = {1,-1,0,-1};
//        int d[] = {1,1,-1,1} ;
//        System.out.println(new Solution().fourSumCount(a, b, c, d));
////[-1,-1]
////[-1,1]
////[-1,1]
////[1,-1]
////[0,1,-1]
////[-1,1,0]
////[0,0,1]
////[-1,1,1]
//    }
//}
//
//
//class Solution {
//    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
//        int nums = 0;
//        int length =A.length;
//        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for (int i = 0; i < length; i++) {
//            for (int j = 0; j < length; j++) {
//                Integer result = map.put(0 - C[i] - D[j], 1);
//                if (result != null) {
//                    map.replace(0 - C[i] - D[j],result+1);
//                }
//            }
//
//        }
//        for (int i = 0; i < length; i++) {
//            for (int j = 0; j < length; j++) {
//                if(map.containsKey(A[i]+B[j])){
//                    nums+=map.get(A[i]+B[j]);
//                }
//            }
//        }
//        return nums;
//    }
//}