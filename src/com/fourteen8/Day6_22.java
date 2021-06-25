//package com.fourteen8;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Day6_22 {
//    public static void main(String[] args) {
//        String[] s =
//                new Solution().permutation(s);
//    }
//}
//
//
//class Solution {
//
//    public void tool(char[] s, int index, char[] temp, boolean[] isSelect, List<String> list) {
//        if (index >= s.length) {
//            String s1 = String.valueOf(temp);
//            list.add(s1);
//            return;
//        }
//
//        for (int i = 0; i < s.length; i++) {
//            //例如两个c，标记为c0和c1。这个条件就是要先用了c0，才能考虑用c1。否则会产生... c0... c1...和...c1...c0....两种重复的结果。
//            if (isSelect[i] || (i > 0 && !isSelect[i - 1] && s[i - 1] == s[i])) {
//                continue;
//            }
//            temp[index] = s[i];
//            isSelect[i] = true;
//
//            tool(s, index + 1, temp, isSelect, list);
//
//            temp[index] = '\u0000';
//            isSelect[i] = false;
//        }
//        return;
//    }
//
//
//    public String[] permutation(String s) {
//        char[] chars = s.toCharArray();
//        Arrays.sort(chars);
//        char[] temp = new char[chars.length];
//        List<String> list = new ArrayList<>();
//        boolean[] isSelect = new boolean[chars.length];
//        tool(chars, 0, temp, isSelect, list);
//
//
//        String[] re = new String[list.size()];
//        for (int i = 0; i < re.length; i++) {
//            re[i] = list.get(i);
//        }
//
//        return re;
//    }
//}
