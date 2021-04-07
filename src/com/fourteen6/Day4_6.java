//package com.fourteen6;
//
//public class Day4_6 {
//    public static void main(String[] args) {
//        int[] nums = {2,2,3,3,4,4,5,5,6,6,7,7,7,7,7,7};
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + "\t");
//        }
//
//        int l = new Solution().removeDuplicates(nums);
//        System.out.println();
//
//        for (int i = 0; i < l; i++) {
//            System.out.print(nums[i] + "\t");
//        }
//
//    }
//}
//
//
//class Solution {
//    public int removeDuplicates(int[] nums) {
//        if (nums.length <= 2)
//            return nums.length;
//
//        int first = nums[0];
//        int second = nums[1];
//        int thrid = nums[2];
//        int length = nums.length;
//
//        int p = 2;
//        int s = 1;
//        int preLength = nums.length;
//        while (p < preLength) {
//            if (first == second && second == thrid) {
////                连续三个数相等 先找到下一个不相同的数
//                int temp = thrid;
//                int p2 = p;
//                while (p2 < preLength - 1 && temp == thrid) {
//                    length--;
//                    p2++;
//                    thrid = nums[p2];
//                }
//                if (temp == thrid) {
//                    length--;
//                    break;
//                }
////                将second的下一个数指向third现在所指
//                temp = p2;
//                while (temp < preLength) {
//                    nums[s + 1] = nums[temp];
//                    s++;
//                    temp++;
//                }
//
//            }
//            preLength = length;
//            p++;
//            if (p >= preLength)
//                break;
//            s = p - 1;
//            thrid = nums[p];
//            second = nums[p - 1];
//            first = nums[p - 2];
//        }
//
//        return length;
//    }
//}
