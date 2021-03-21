//package com.fourteen3;
//
//import java.util.Deque;
//import java.util.LinkedList;
//import java.util.Scanner;
//import java.util.Stack;
//
//public class Day12_20 {
//    public static void main(String[] args) {
//        String s ="bcaceuibcewuicgweuibccbeubcesuilavwewuevepwuwgveabc";
//        System.out.println(new Solution().removeDuplicateLetters(s));
//    }
//}
//
//class Solution {
//    public String removeDuplicateLetters(String s) {
//        StringBuilder result = new StringBuilder();
//
//        Deque<Character> deque = new LinkedList<>();
//        int[] isHaving = new int[26];
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if ((deque.isEmpty() || c > deque.peekLast()) && isHaving[c - 'a'] == 0) {
//                deque.add(c);
//                isHaving[c - 'a'] = 1;
//            } else if (isHaving[c - 'a'] == 0&&c < deque.peekLast()) {
//                while (!deque.isEmpty()&&c<deque.peekLast()&&s.indexOf(deque.peekLast(),i) != -1) {
//                    isHaving[deque.pollLast() - 'a'] = 0;
//                }
//                deque.add(c);
//                isHaving[c - 'a'] = 1;
//            }
//        }
//
//        while(!deque.isEmpty()){
//            result.append(deque.pollFirst());
//        }
//
//        return result.toString();
//    }
//}