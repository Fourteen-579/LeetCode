//package com.fourteen5;
//
//import jdk.internal.org.objectweb.asm.Handle;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Day3_24 {
//    public static void main(String[] args) {
//        int[] a = {};
//        System.out.println(new Solution().find132pattern(a));
//    }
//}
//
//
//class Solution {
//    public boolean find132pattern(int[] nums) {
//        if (nums.length < 3) {
//            return false;
//        }
//
//        List<int[]> listOne = new ArrayList<>();
//        List<int[]> listTwo = new ArrayList<>();
//        Map<Integer, Integer> map = new HashMap<>();
//        Map<int[], Integer> map2 = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//
//            if (!map.containsKey(nums[i]) && nums.length - i >= 3) {
//
//                int[] a = new int[3];
//                a[0] = nums[i];
//                listOne.add(a);
//                map.put(nums[i], 0);
//            }
//
//            for (int[] integers : listTwo) {
//                if (nums[i] > integers[0] && nums[i] < integers[1])
//                    return true;
//            }
//
//            int p = 0;
//            while (p < listOne.size()) {
//                if (nums[i] > listOne.get(p)[0] && nums[i] - listOne.get(p)[0] > 1) {
//                    listOne.get(p)[1] = nums[i];
//                    if (!map2.containsKey(listOne.get(p))) {
//                        map2.put(listOne.get(p), 0);
//                        listTwo.add(listOne.get(p));
//                    }
//                }
//                p++;
//            }
//
//
//        }
//
//        return false;
//    }
//}