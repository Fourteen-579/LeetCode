//package com.fourteen4;
//
//import java.util.Arrays;
//import java.util.Stack;
//
//public class Day3_6 {
//    public static void main(String[] args) {
//        int[] nums = {1,2,3,2,1};
//        System.out.println(Arrays.toString(new Solution().nextGreaterElements(nums)));
//    }
//}
//
//class Solution {
//    public int[] nextGreaterElements(int[] nums) {
//        if (nums.length == 0)
//            return new int[0];
//        int[] re = new int[nums.length];
//        Arrays.fill(re, -1);
//
//        Stack<Integer> stack = new Stack<>();
//
//        int max = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (!stack.empty() && nums[stack.peek()] < nums[i]) {
//                do {
//                    re[stack.pop()] = nums[i];
//                } while (!stack.empty() && nums[stack.peek()] < nums[i]);
//            }
//            stack.push(i);
//            if (nums[max] < nums[i])
//                max = i;
//        }
//
//        while (stack.size() > 1) {
//            if (nums[stack.peek()] != nums[max]) {
//                for (int i = 0; i < nums.length; i++) {
//                    if (nums[stack.peek()] < nums[i]){
//                        re[stack.pop()] = nums[i];
//                        break;
//                    }
//                }
//            } else
//                stack.pop();
//        }
//
//        return re;
//    }
//}
