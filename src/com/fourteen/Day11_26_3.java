//package com.fourteen;
//
//import java.util.*;
//
//public class Day11_26_3 {
//    public static void main(String[] args) {
//        int nums[] = {6,6,7,8,10, 3};
//        System.out.println(new Solution().twoSum(nums, 9));
//    }
//}
//
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i = 0; i < nums.length; i++){
//            if(map.containsKey(nums[i])){
//                return new int[]{map.get(nums[i]), i};
//            }
//            map.put(target - nums[i], i);
//        }
//        return null;
//    }
//}
