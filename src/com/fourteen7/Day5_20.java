//package com.fourteen7;
//
//import java.util.*;
//import java.util.function.BiConsumer;
//
//public class Day5_20 {
//    public static void main(String[] args) {
//        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
//        int k = 2;
//        List<String> list = new Solution().topKFrequent(words, k);
//        for (String s : list) {
//            System.out.print(s + "\t");
//        }
//    }
//}
//
//class Solution {
//
//    public List<String> topKFrequent(String[] words, int k) {
//        if (words.length == 0)
//            return new ArrayList<>();
//        Arrays.sort(words, Comparator.naturalOrder());
//        List<String> list = new ArrayList<>();
//
//        List<Integer> integers = new ArrayList<>();
//
//        boolean flag = false;
//        String pre = words[0];
//        int nums = 0;
//        for (String word : words) {
//            if (pre.equals(word)) {
//                nums++;
//            } else {
//                list.add(pre);
//                integers.add(new Integer(nums));
//                pre = word;
//                nums = 1;
//            }
//        }
//        list.add(pre);
//        integers.add(new Integer(nums));
//
//        list.sort((o1, o2) -> {
//            int i = list.indexOf(o1);
//            int i1 = list.indexOf(o2);
//            if (integers.get(i) == integers.get(i1)) {
//                return o2.compareTo(o1);
//            } else {
//                return integers.get(i1) - integers.get(i);
//            }
//        });
//
//        integers.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i) + "\t" + integers.get(i));
//        }
//
//        return null;
//    }
//}