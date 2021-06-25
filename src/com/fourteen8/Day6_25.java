//package com.fourteen8;
//
//import java.util.*;
//
//public class Day6_25 {
//    public static void main(String[] args) {
//        String[] str = {"0201","0101","0102","1212","2002"};
//        String t = "0202";
//        System.out.println(new Solution().openLock(str,t));
//    }
//}
//
//
//class Solution {
//    public char addOne(char c) {
//        if (c == '9') return '0';
//        else return (char) (c + 1);
//    }
//
//    public char deleteOne(char c) {
//        if (c == '0') return '9';
//        else return (char) (c - 1);
//    }
//
//    public List<String> getList(String str) {
//        List<String> list = new ArrayList<>();
//
//        for (int i = 0; i < 4; i++) {
//            char[] chars = str.toCharArray();
//            chars[i] = addOne(chars[i]);
//            list.add(String.valueOf(chars));
//
//            chars[i] = deleteOne(chars[i]);
//            chars[i] = deleteOne(chars[i]);
//            list.add(String.valueOf(chars));
//        }
//        return list;
//    }
//
//    public int openLock(String[] deadends, String target) {
//        //如果目标为0000则不用移动即到达目标
//        if (target.equals("0000"))
//            return 0;
//        Set<String> dead = new HashSet<>();
//        for (String deadend : deadends) {
//            dead.add(deadend);
//        }
//        //如果死亡数字包含0000则无法移动
//        if (dead.contains("0000"))
//            return -1;
//
//        int step = 0;
//
//        Set<String> seen = new HashSet<>();
//        Queue<String> queue = new LinkedList<>();
//
//        seen.add("0000");
//        queue.offer("0000");
//
//        while (!queue.isEmpty()) {
//            ++step;
//
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                //遍历0000走一步可能出现的结果
//                for (String str : getList(queue.poll())) {
//                    if (!seen.contains(str) && !dead.contains(str)) {
//                        if (str.equals(target))
//                            return step;
//                        queue.add(str);
//                        seen.add(str);
//                    }
////                    queue.add(str);
////                    seen.add(str);
//                }
//            }
//
//        }
//
//        return -1;
//    }
//}
