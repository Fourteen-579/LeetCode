//package com.fourteen4;
//
//import java.util.Stack;
//
//public class Day3_9 {
//    public static void main(String[] args) {
//        System.out.println(new Solution().removeDuplicates("abbaca"));
//    }
//}
//
//class Solution {
//    public String removeDuplicates(String S) {
//        StringBuffer re = new StringBuffer();
//        Stack<Character> stack = new Stack<>();
//        for (Character c : S.toCharArray()) {
//            if (stack.empty() || stack.peek() != c)
//                stack.push(c);
//            else {
//                stack.pop();
//            }
//        }
//        while(!stack.empty()){
//            re.append(stack.pop());
//        }
//        re = re.reverse();
//
//        return re.toString();
//    }
//}
