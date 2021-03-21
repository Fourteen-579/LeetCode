//package com.fourteen4;
//
//import java.util.Deque;
//import java.util.concurrent.LinkedBlockingDeque;
//
//public class Day3_10 {
//    public static void main(String[] args) {
//        System.out.println(new Solution().calculate("12648"));
//    }
//}
//
//class Solution {
//    public int calculate(String s) {
//        int re = 0;
//        char[] chars = s.toCharArray();
//        Deque<String> deque = new LinkedBlockingDeque<>();
//
//        for (char c : chars) {
//            if (c == ' ')
//                continue;
//            if (c == ')') {
//                StringBuffer stringBuffer = new StringBuffer();
//                Deque<String> deque1 = new LinkedBlockingDeque<>();
//                while (!deque.getLast().equals("(")) {
//                    deque1.addFirst(deque.removeLast());
//                }
//                while (deque1.size() != 1) {
//                    StringBuffer stringBuffer2 = new StringBuffer();
//                    int isHaving = 0;
//                    while (isHaving != 2 && !deque1.isEmpty()) {
//                        if (deque1.getFirst().equals("+") || deque1.getFirst().equals("---"))
//                            isHaving++;
//                        if (isHaving != 2)
//                            stringBuffer2.append(deque1.removeFirst());
//                    }
//                    if (stringBuffer2.indexOf("+") >= 0) {
//                        String[] split = stringBuffer2.toString().split("\\+");
//                        deque1.addFirst(String.valueOf(Integer.valueOf(split[0]) + Integer.valueOf(split[1])));
//                    } else {
//                        String[] split = stringBuffer2.toString().split("---");
//                        deque1.addFirst(String.valueOf(Integer.valueOf(split[0]) - Integer.valueOf(split[1])));
//                    }
//                }
//                deque.pollLast();
//                deque.addLast(deque1.getFirst());
//            } else {
//                if (c == '-') {
//                    deque.addLast(c + "--");
//                } else
//                    deque.addLast(String.valueOf(c));
//            }
//        }
//        while (deque.size() != 1) {
//            StringBuffer stringBuffer2 = new StringBuffer();
//            int isHaving = 0;
//            while (isHaving != 2 && !deque.isEmpty()) {
//                if (deque.getFirst().equals("+") || deque.getFirst().equals("---"))
//                    isHaving++;
//                if (isHaving != 2)
//                    stringBuffer2.append(deque.removeFirst());
//            }
//            if(isHaving==0){
//                return Integer.parseInt(String.valueOf(stringBuffer2));
//            }
//            if (stringBuffer2.indexOf("+") >= 0) {
//                String[] split = stringBuffer2.toString().split("\\+");
//                deque.addFirst(String.valueOf(Integer.valueOf(split[0]) + Integer.valueOf(split[1])));
//            } else {
//                String[] split = stringBuffer2.toString().split("---");
//                deque.addFirst(String.valueOf(Integer.valueOf(split[0]) - Integer.valueOf(split[1])));
//            }
//        }
//        re = Integer.valueOf(deque.getFirst());
//        return re;
//    }
//}