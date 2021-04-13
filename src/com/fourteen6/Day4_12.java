//package com.fourteen6;
//
//import java.util.*;
//
//public class Day4_12 {
//    public static void main(String[] args) {
//        int[] nums = {3,30,34,5,9};
//        System.out.println(new Solution().largestNumber(nums));
//    }
//}
//
//class Solution {
//
//    public boolean sortArray(String o1, String o2) {
//        int point = 0;
//        while (point < Math.min(o1.length(), o2.length()))
//            if (o1.charAt(point) > o2.charAt(point))
//                return false;
//            else if (o1.charAt(point) < o2.charAt(point))
//                return true;
//            else
//                point++;
//        if (o1.length() < o2.length()) {
//            return sortArray(o1, o2.substring(point));
//        } else if (o1.length() > o2.length()) {
//            return sortArray(o1.substring(point), o2);
//        }
//        return true;
//    }
//
//    public String largestNumber(int[] nums) {
//        if (nums.length == 1)
//            return String.valueOf(nums[0]);
//        StringBuilder str = new StringBuilder();
//        Integer[] array = Arrays.stream(nums).boxed().toArray(Integer[]::new);
//        List<String> list = new ArrayList<>();
//        for (int i = 0; i < array.length; i++) {
//            list.add(array[i].toString());
//        }
//        Collections.sort(list, (o1, o2) -> {
//            if (o1.equals(o2))
//                return 0;
//            return sortArray(o1, o2) ? 1 : -1;
//        });
//        boolean having = false;
//        for (int i = 0; i < list.size(); i++) {
//            if (!having && list.get(i).equals("0") && i != list.size() - 1)
//                continue;
//            str.append(list.get(i));
//            having = true;
//        }
//        return str.toString();
//    }
//}