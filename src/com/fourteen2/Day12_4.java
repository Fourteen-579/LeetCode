//package com.fourteen2;
//
//import sun.awt.util.IdentityArrayList;
//
//import java.util.*;
//
//public class Day12_4 {
//    public static void main(String[] args) {
//        int[] nums = {4,5,6,6,7,8,9,10,10,11};
//        System.out.println(new Solution().isPossible(nums));
//    }
//}
//
//
//class Solution {
//    public boolean isPossible(int[] nums) {
//
//        if (nums[nums.length-1] - nums[0] < 2)
//            return false;
//
//        List<Stack<Integer>> list = new ArrayList<Stack<Integer>>();
//
//        Stack<Integer> stack = new Stack<Integer>();
//        list.add(stack);
//
//        int count = 0;              //已经创建的stack数量
//        int firstNotFull = 0;      //第一个未满的stack
//
//        //将数组中所有元素放入stack中
//        for (int i = 0; i < nums.length; i++) {
//            if (stack.empty() || stack.peek() == nums[i] - 1)
//                stack.push(nums[i]);
//            else if (stack.peek() == nums[i]) {
//                int j = count - 1;
//                Stack<Integer> s;
//                while (j >= 0&&j<list.size()) {
//                    s = list.get(j);
//                    if (s.peek() == nums[i] - 1) {
//                        s.push(nums[i]);
//                        break;
//                    }else if(s.peek()<nums[i]){
//                        stack = new Stack<>();
//                        stack.add(nums[i]);
//                        list.add(stack);
//                        count++;
//                        break;
//                    }
//                    j--;
//                }
//                if (j == -1) {
//                    stack = new Stack<>();
//                    stack.add(nums[i]);
//                    list.add(stack);
//                    count++;
//                }
//            }
//            else {
//                stack = new Stack<>();
//                stack.add(nums[i]);
//                list.add(stack);
//                count++;
//            }
//            while (firstNotFull<list.size()&&list.get(firstNotFull).size() >= 3) {
//                firstNotFull++;
//            }
//
//        }
//
//        return count < firstNotFull ? true : false;
//    }
//}