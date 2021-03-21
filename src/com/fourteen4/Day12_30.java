//package com.fourteen4;
//
//import java.util.*;
//
//public class Day12_30 {
//    public static void main(String[] args) {
//        int[] s = {1,3};
//        System.out.println(new Solution().lastStoneWeight(s));
//    }
//}
//
//class Solution {
//    public int lastStoneWeight(int[] stones) {
//
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//
//                return o2-o1;
//            }
//        });
//
//
//
//        if (stones.length == 1)
//            return stones[0];
//        Arrays.sort(stones);
//        int length = stones.length;
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < length; i++) {
//            list.add(stones[i]);
//        }
//        for (int i = length - 1; i >= 1; i--) {
//            int temp = list.get(i) - list.get(i - 1);
//            list.remove(i);
//            list.remove(i-1);
//            if (temp != 0) {
//                if (list.isEmpty()) {
//                    list.add(temp);
//                } else {
//                    int j=0;
//                    while(j<list.size()&&list.get(j) < temp){
//                        j++;
//                    }list.add(j, temp);
//                }
//            }else i--;
//        }
//        return list.size() == 0 ? 0 : list.get(0);
//    }
//}