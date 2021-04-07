//package com.fourteen5;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Day3_31 {
//    public static void main(String[] args) {
//        int[] nums = {4, 4, 4, 1, 4};
//        List<List<Integer>> lists = new Solution().subsetsWithDup(nums);
//        for (List<Integer> list : lists) {
//            System.out.println(Arrays.toString(list.toArray()));
//        }
//    }
//}
//
//class Solution {
//
//    public void tool(int index, int[] nums, List<Integer> list, List<List<Integer>> listList) {
//        if (index >= nums.length)
//            return;
//
//        for (int i = index; i < nums.length; i++) {
//            List<Integer> l1 = new ArrayList<>(list);
//            l1.add(nums[i]);
//            //如果在listList中不存在现在这个list则将其加入
//            if (!listList.contains(l1)) {
//                List<Integer> l2 = new ArrayList<>(l1);
//                listList.add(l2);
//            }
//            //再次调用tool
//            tool(i + 1, nums, l1, listList);
//        }
//    }
//
//    public List<List<Integer>> subsetsWithDup(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> lists = new ArrayList<>();
//        lists.add(new ArrayList<>());
//        for (int i = 0; i < nums.length; i++) {
//            tool(i, nums, new ArrayList<>(), lists);
//        }
//        return lists;
//    }
//}