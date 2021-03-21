//package com.fourteen;
//
//import java.util.HashMap;
//import java.util.Stack;
//
//public class Day12_1_2 {
//    public static void main(String[] args) {
//        String s = "[{}]";
//
//        System.out.println(new Solution().isValid2(s));
//    }
//}
//
//class Solution {
//    public boolean isValid(String s) {
//        if (s.length() % 2 != 0) {
//            return false;
//        }
//        Stack<Character> stack = new Stack<Character>();
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (c == '(' || c == '[' || c == '{') {
//                stack.push(c);
//            } else {
//                if (stack.empty())
//                    return false;
//                if (stack.peek() == '[') {
//                    if (c == ']')
//                        stack.pop();
//                    else
//                        return false;
//                } else if (stack.peek() == '(') {
//                    if (c == ')')
//                        stack.pop();
//                    else
//                        return false;
//                } else {
//                    if (c == '}')
//                        stack.pop();
//                    else
//                        return false;
//                }
//            }
//        }
//        if (stack.empty())
//            return true;
//        return false;
//    }
//
//    public boolean isValid2(String s) {
//        if (s.length() % 2 == 1)
//            return false;
//
//        HashMap<Character, Character> map = new HashMap<Character, Character>();
//        map.put(']', '[');
//        map.put(')', '(');
//        map.put('}', '{');
//
//        Stack<Character> stack = new Stack<Character>();
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if(map.containsKey(c)){
//                if(stack.empty()||stack.peek()!=map.get(c))
//                    return false;
//                stack.pop();
//            }else
//                stack.push(c);
//        }
//
//        return stack.empty();
//    }
//}