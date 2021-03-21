//package com.fourteen2;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Day12_8 {
//    public static void main(String[] args) {
//        String s = "539834657215398346785398346991079669377161950407626991734534318677529701785098211336528511";
//        System.out.println(new Solution().splitIntoFibonacci(s));
//    }
//}
//
//
//class Solution {
//
//    public static final int MAX_NUM = (int) (Math.pow(2, 31) - 1);
//
//    public int[] hasSum(int index1, int length1, int index2, int length2, String s, int index) {
//        if ((length1 > 1 && s.charAt(index1) == '0') || length2 > 1 && s.charAt(index2) == '0' || length1>10||length2>10||Long.valueOf(s.substring(index1, index1 + length1))>MAX_NUM||Long.valueOf(s.substring(index2, index2 + length2))>MAX_NUM)
//            return null;
//        int i1 = Integer.valueOf(s.substring(index1, index1 + length1));
//        int i2 = Integer.valueOf(s.substring(index2, index2 + length2));
//        if (i1 > MAX_NUM || i2 > MAX_NUM)
//            return null;
//        if (s.indexOf(String.valueOf(i1 + i2),index2+length2) == index)
//            return new int[]{index, String.valueOf(i1 + i2).length()};
//        return null;
//    }
//
//    public boolean isFibon(String S, int index1, int index2, int length1, int length2, List<Integer> list) {
//        boolean b;
//        if (index2 + length2 == S.length())
//            b = true;
//        else {
//            int[] re = hasSum(index1, length1, index2, length2, S, index2 + length2);
//            if (re == null) {
//                b = false;
//            } else {
//                list.add(Integer.valueOf(S.substring(re[0], re[0] + re[1])));
//                b = isFibon(S, index2, re[0], length2, re[1], list);
//            }
//        }
//        return b;
//    }
//
//    public List<Integer> splitIntoFibonacci(String S) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 1; i < S.length()/2+1; i++) {
//            for (int j = 1; j <= S.length() - i; j++) {
//                if (i + j == S.length())
//                    break;
//                if(i>=10||Long.valueOf(S.substring(0, i))>MAX_NUM)
//                    return new ArrayList<>();
//                if(j>10||Long.valueOf(S.substring(i, j + i))>MAX_NUM)
//                    break;
//                list.add(Integer.valueOf(S.substring(0, i)));
//                list.add(Integer.valueOf(S.substring(i, j + i)));
//                if (isFibon(S, 0, i, i, j, list))
//                    return list;
//                else
//                    list.clear();
//            }
//        }
//        return new ArrayList<>();
//    }
//}
