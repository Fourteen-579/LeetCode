//package com.fourteen3;
//
//import java.util.Arrays;
//
//public class Day12_24 {
//    public static void main(String[] args) {
//        int[] r = {5, 1, 2, 5, 8, 4, 2, 1, 0, 2, 5, 6, 9, 1, 2, 2, 5, 8, 4, 1, 2, 6, 8, 0, 2, 1, 5, 9, 3, 1, 5, 7, 4, 2, 5, 9, 3};
//        System.out.println(new Solution().candy(r));
//    }
//
//}
//
//class Solution {
//    public int candy(int[] ratings) {
//
//        int sum = 0;
//        int length = ratings.length;
//        int[] candys = new int[length];
//
//        candys[0] = 1;
//        for (int i = 1; i < length; i++) {
//            candys[i] = 1;
//            if (ratings[i] > ratings[i - 1]&&candys[i]<=candys[i-1])
//                candys[i] = candys[i - 1] + 1;
//        }
//
//        sum += candys[length - 1];
//        for (int i = length - 2; i >= 0; i--) {
//            if (ratings[i] > ratings[i + 1]&&candys[i]<=candys[i+1])
//                candys[i] = candys[i + 1] + 1;
//
//            sum += candys[i];
//        }
//        return sum;
//    }
//}
