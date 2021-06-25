//package com.fourteen8;
//
//import java.util.Arrays;
//
//public class Day6_15 {
//    public static void main(String[] args) {
//        int[] arr = {24,69,100,99,79,78,67,36,26,19};
//        System.out.println(new Solution().peakIndexInMountainArray(arr));
//    }
//}
//
//class Solution {
//    public int peakIndexInMountainArray(int[] arr) {
//        int x = Arrays.stream(arr).max().getAsInt();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == x)
//                return i;
//        }
//        return 0;
//    }
//}
