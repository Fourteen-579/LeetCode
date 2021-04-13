//package com.fourteen6;
//
//import java.math.BigDecimal;
//import java.util.*;
//
//public class Day4_11 {
//    public static void main(String[] args) {
//        int n = 1690;
//        System.out.println(new Solution().nthUglyNumber(n));
//    }
//}
//
//
//class Solution {
//    public int nthUglyNumber(int n) {
//        if (n <= 6)
//            return n;
//        int p = 0;
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        while (p < list.size() && list.get(0) == 1) {
//            Integer integer = list.get(p++);
//
//            if (integer * 2 < 0)
//                break;
//            if (!list.contains(integer * 2)) {
//                list.add(integer * 2);
//
//            }
//            if (!list.contains(integer * 3)) {
//                list.add(integer * 3);
//
//            }
//            if (!list.contains(integer * 5)) {
//                list.add(integer * 5);
//
//            }
//            Collections.sort(list);
//        }
//        if (list.get(0) < 0)
//            list.remove(0);
//        return list.get(n - 1);
//    }
//}