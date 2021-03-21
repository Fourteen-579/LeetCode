package com.fourteen;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Day12_2_2 {
    public static void main(String[] args) {
        String num = "111111111111";
        int k = 8;
        System.out.println(new Solution().removeKdigits(num, k));
    }
}

class Solution {

    public String removeKdigits(String num, int k) {
        StringBuilder result = new StringBuilder();
        if (k == num.length())
            return "0";
        Stack<Character> stack = new Stack<Character>();
        int r = 0;
        int length = num.length();
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            if (stack.empty())
                stack.push(c);
            else {
                if (stack.peek() <= c) {
                    if (stack.size() == length - k) {
                        r++;
                        if (c < stack.peek())
                            stack.pop();
                        else
                            continue;
                    }
                } else {
                    int r2 = 0;
                    while (!stack.empty() && c < stack.peek()) {
                        if (r2 + r >= k) break;
                        stack.pop();
                        r2++;
                    }
                    r = r + r2;
                }
                stack.push(c);
            }
        }

        boolean isZero = false;
        for (int i = 0; i < stack.size(); i++) {
            if (stack.get(i) == '0' && !isZero)
                continue;
            else if (stack.get(i) != '0' && !isZero)
                isZero = true;
            result.append(stack.get(i));
        }
        if (!isZero)
            result.append('0');
        return result.toString();

    }
}