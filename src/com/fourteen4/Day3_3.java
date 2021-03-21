//package com.fourteen4;
//
//import java.util.Arrays;
//
//public class Day3_3 {
//    public static void main(String[] args) {
//        int i = 10;
//        System.out.println(Arrays.toString(new Solution().countBits(i)));
//    }
//}
//
//
//class Solution {
//
//    public boolean isPowerOfTwo(int n) {
//        return n > 0 && (n & (n - 1)) == 0;
//    }
//
//    public int[] countBits(int num) {
//        int[] array = new int[num + 1];
//        array[0] = 0;
//        if (num >= 1)
//            array[1] = 1;
//        if (num >= 2)
//            array[2] = 1;
//        for (int i = 3; i <= num; i++) {
//            if (isPowerOfTwo(i))
//                array[i] = 1;
//            else {
//                int l = Integer.toBinaryString(i).length();
//                array[i] = l - array[(int) Math.pow(2, l) - 1 - i];
//            }
//        }
//
//        return array;
//    }
//}
