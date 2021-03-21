//package com.fourteen4;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class Day3_7 {
//    public static void main(String[] args) {
//        System.out.println(new Solution().partition("aab"));
//    }
//}
//
//class Solution {
//
//    public boolean isHui(String str) {
//        int head = 0;
//        int tail = str.length() - 1;
//        while (head < str.length() && tail >= 0 && head < tail) {
//            if (str.charAt(head) != str.charAt(tail))
//                return false;
//            head++;
//            tail--;
//        }
//        return true;
//    }
//
//    public void tool(StringBuffer nowStr, int subNum, int index, List<List<String>> listList) {
//        if (subNum == 0) {
//            String[] str = nowStr.toString().split(" ");
//            boolean isHuiStr = true;
//            for (String str1 : str) {
//                if (!isHui(str1)) {
//                    isHuiStr = false;
//                    break;
//                }
//            }
//            if (isHuiStr) {
//                List<String> list = new ArrayList<>();
//                for (String str1 : str) {
//                    list.add(str1);
//                }
//                listList.add(list);
//            }
//
//
//        } else {
//            for (int i = index; i < nowStr.length() - 1; i++) {
//                StringBuffer stringBuffer = new StringBuffer(nowStr);
//                tool(stringBuffer.insert(i + 1, ' '), subNum - 1, i + 2, listList);
//            }
//        }
//    }
//
//
//    public List<List<String>> partition(String s) {
//        List<List<String>> listList = new ArrayList<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            tool(new StringBuffer(s), i, 0, listList);
//        }
//        Collections.reverse(listList);
//        return listList;
//    }
//}
