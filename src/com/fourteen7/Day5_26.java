//package com.fourteen7;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Stack;
//
//public class Day5_26 {
//    public static void main(String[] args) {
//        String s = "";
//        String re = new Solution().reverseParentheses(s);
//        System.out.println(re);
//    }
//}
//
//class Solution {
//    public String reverseParentheses(String s) {
//
//        Stack<Character> stack = new Stack<>();
//        List<Character> list = new ArrayList<>();
//        char[] chars = s.toCharArray();
//        for (char c : chars) {
//            if (c == ')') {
//                char temp;
//                while ((temp = stack.pop()) != '(') {
//                    list.add(temp);
//                }
//                while (list.size() != 0) {
//                    stack.push(list.remove(0));
//                }
//            } else {
//                stack.push(c);
//            }
//        }
//
//        StringBuilder re = new StringBuilder();
//        while(!stack.isEmpty()){
//            re.append(stack.pop());
//        }
//
//        return re.reverse().toString();
//    }
//}
