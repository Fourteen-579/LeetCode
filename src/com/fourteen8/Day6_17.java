//package com.fourteen8;
//
//import sun.net.www.protocol.http.HttpURLConnection;
//
//public class Day6_17 {
//    public static void main(String[] args) {
//        System.out.println(new Solution().isNumber("44e016912630333"));
//    }
//}
//
//class Solution {
//
//    //判断是否仅有数字且符号位只有一位
//    public boolean isAllNum(String s) {
//        s = s.replace('-', '+');
//        try {
//            Long.valueOf(s);
//        } catch (Exception e) {
//            return false;
//        }
//        return true;
//    }
//
//    //仅含有一个字符e
//    public boolean isOnlye(String s) {
//        boolean b = false;
//        for (int i = 0; i < s.length(); i++) {
//            if ((s.charAt(i) <= 'z' && s.charAt(i) >= 'a') || (s.charAt(i) <= 'Z' && s.charAt(i) >= 'A'))
//                if (s.charAt(i) == 'e' && !b) {
//                    b = true;
//                } else {
//                    return false;
//                }
//            else {
//                continue;
//            }
//        }
//        return true;
//    }
//
//    public boolean isE(String s, String[] es) {
//        //如果s包含e但是根据e分割却没有后半部分或者被多次分割，则不符合规则
//        if (s.indexOf("e") >= 0 && es.length != 2)
//            return false;
//        for (String e : es) {
//            if (e.equals(""))
//                return false;
//        }
//        return true;
//    }
//
//    //判断是否为小数
//    public boolean isPoint(String s) {
//        s = s.replace('-', '+');
//        try {
//            Float.valueOf(s);
//        } catch (Exception e) {
//            return false;
//        }
//        return true;
//    }
//
//    public boolean isNumber(String s) {
//        boolean b;
//        s = s.toLowerCase();
//        if (isOnlye(s)) {
//            String[] es = s.split("e");
//
//            if (!isE(s, es)) return false;
//
//            //前半部分为小数或者整数
//            b = isPoint(es[0]);
//            if (es.length == 2)
//                //后半部分只能为整数
//                b = isAllNum(es[1]) == true ? b : false;
//
//        } else {
//            return false;
//        }
//
//        return b;
//    }
//}
