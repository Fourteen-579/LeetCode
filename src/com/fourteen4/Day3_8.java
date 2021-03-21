//package com.fourteen4;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class Day3_8 {
//    public static void main(String[] args) {
//        System.out.println(new Solution().minCut("ff"));
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
//    public int tool(StringBuffer nowStr, int subNum, int index) {
//        int isHuiStr = 0;
//        if (subNum == 0) {
//            String[] str = nowStr.toString().split(" ");
//            boolean b = true;
//            for (String str1 : str) {
//                if (!isHui(str1)) {
//                    b = false;
//                    break;
//                }
//            }
//            if (b)
//                isHuiStr = 1;
//            else
//                isHuiStr = -1;
//        } else {
//            for (int i = index; i < nowStr.length() - 1; i++) {
//                StringBuffer stringBuffer = new StringBuffer(nowStr);
//                isHuiStr = tool(stringBuffer.insert(i + 1, ' '), subNum - 1, i + 2);
//                if (isHuiStr == 1)
//                    break;
//            }
//        }
//        return isHuiStr;
//    }
//
//
//    public int minCut(String s) {
//        if (s.length() <= 2)
//            return isHui(s) ? 0 : (s.length() == 0 ? 0 : s.length() - 1);
//        boolean b = false;
//        int i = 0;
//        for (i = 0; i < s.length(); i++) {
//            if (tool(new StringBuffer(s), i, 0) == 1) {
//                break;
//            }
//        }
//        return i;
//    }
//}