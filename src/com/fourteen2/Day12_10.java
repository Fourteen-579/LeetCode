//package com.fourteen2;
//
//public class Day12_10 {
//    public static void main(String[] args) {
//        int[] bills = {5, 5, 10, 20};
//        System.out.println(new Solution().lemonadeChange(bills));
//    }
//}
//
//class Solution {
//    public boolean lemonadeChange(int[] bills) {
//        if (bills.length == 0)
//            return true;
//        if (bills[0] == 10 || bills[0] == 20)
//            return false;
//        int five = 1;
//        int ten = 0;
//        for (int i = 1; i < bills.length; i++) {
//            if (bills[i] == 5)
//                five++;
//            else if (bills[i] == 10) {
//                ten++;
//                five--;
//            } else {
//                if (ten > 0) {
//                    ten--;
//                } else {
//                    five -= 2;
//                }
//                five--;
//            }
//            if (five < 0 || ten < 0)
//                return false;
//        }
//        return true;
//    }
//}
