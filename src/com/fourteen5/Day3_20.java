//package com.fourteen5;
//
//import java.util.Stack;
//
//public class Day3_20 {
//    public static void main(String[] args) {
//        String []s = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
//        System.out.println(new Solution().evalRPN(s));
//    }
//}
//
//class Solution {
//    public int evalRPN(String[] tokens) {
//        int re = 0;
//
//        Stack<Integer> stack = new Stack<>();
//
//        int a = 0,b = 0;
//        for (String s : tokens) {
//            if(s.equals("+")){
//                b = stack.pop();
//                a = stack.pop();
//                stack.push(a+b);
//            }else if(s.equals("-")){
//                b = stack.pop();
//                a = stack.pop();
//                stack.push(a-b);
//            }else if(s.equals("*")){
//                b = stack.pop();
//                a = stack.pop();
//                stack.push(a*b);
//            }else if(s.equals("/")){
//                b = stack.pop();
//                a = stack.pop();
//                stack.push(a/b);
//            }else{
//                stack.push(Integer.valueOf(s));
//            }
//        }
//        re = stack.pop();
//        return re;
//    }
//}