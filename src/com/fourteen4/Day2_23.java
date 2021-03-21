//package com.fourteen4;
//
//import java.util.Arrays;
//
//public class Day2_23 {
//    public static void main(String[] args) {
//        int []customers = {7,7,1,0,2,1,5,2,3,6,9,5,5};
//        int []grumpy = {0,1,0,1,0,1,0,0,1,0,1,0,1};
//        int X = 3;
//        System.out.println(new Solution().maxSatisfied(customers,grumpy,X));
//    }
//}
//
//class Solution {
//    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
//        int max = 0;
//        int length = customers.length;
//        for (int i = 0; i < length; i++) {
//            if (grumpy[i] == 0) {
//                max += customers[i];
//            }
//        }
//        if (length == X) {
//            max = Arrays.stream(customers).sum();
//        } else {
//            int max_ever = max;
//            int max_max = 0;
//            for (int i = 0; i <= length-X; i++) {
//                max_ever = max;
//                for (int j = 0; j < X && (j+i) < length; j++) {
//                    if (grumpy[j+i] == 1) {
//                        max_ever += customers[i+j];
//                    }
//                }
//                if (max_ever > max_max)
//                    max_max = max_ever;
//            }
//            max = max_max;
//        }
//        return max;
//    }
//}