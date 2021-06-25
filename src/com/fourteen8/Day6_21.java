//package com.fourteen8;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Day6_21 {
//    public static void main(String[] args) {
//        int turnedOn = 1;
//        List<String> list = new Solution().readBinaryWatch(turnedOn);
//        for (String s : list) {
//            System.out.println(s);
//        }
//    }
//}
//
//
//class Solution {
//    public List<String> readBinaryWatch(int turnedOn) {
//        List<String> list = new ArrayList<>();
//
//        Boolean[] select = new Boolean[10];
//        Arrays.fill(select,false);
//
//        tool(turnedOn, 0, 0, select, list);
//
//        return list;
//    }
//
//    public String toTime(Boolean[] select) {
//        StringBuilder re = new StringBuilder();
//        StringBuilder str1 = new StringBuilder();
//        for (int i = 0; i < 4; i++) {
//            if (select[i])
//                str1.append('1');
//            else
//                str1.append('0');
//
//        }
//        re.append(Integer.parseInt(str1.toString(), 2) + ":");
//        str1.delete(0, str1.length());
//        for (int i = 4; i < select.length; i++) {
//            if (select[i])
//                str1.append('1');
//            else
//                str1.append('0');
//        }
//        int i = Integer.parseInt(str1.toString(), 2);
//        if (i < 10) {
//            re.append('0');
//        }
//        return re.append(i).toString();
//    }
//
//    public void tool(int turnedOn, int isSelect, int index, Boolean[] select, List<String> list) {
//        if (turnedOn == isSelect) {
//            list.add(toTime(select));
//            return;
//        }
//        for (int i = index; i < select.length; i++) {
//            select[i] = true;
//
//            tool(turnedOn, isSelect + 1, index + 1, select, list);
//
//            select[i] = false;
//        }
//        return;
//    }
//}
