//package com.fourteen;
//
//import java.util.ArrayList;
//
//public class Day11_18 {
//    public static void main(String[] args) {
////          gas  = [1,2,3,4,5]
////          cost = [3,4,5,1,2]
////        int[] gas = {1, 2, 3, 4, 5};
////        int[] cost = {3, 4, 5, 1, 2};
//
////        gas  = [2,3,4]
////cost = [3,4,3]
//        int[] gas = {2, 3, 4};
//        int[] cost = {3, 4, 3};
//
//
//        System.out.println(new Solution().canCompleteCircuit(gas, cost));
//    }
//}
//
//class Solution {
//
//    public int isFull(int having, int[] gas, int[] cost, int i, int isCircl) {
//        if (isCircl == gas.length) {
//            return 1;
//        }
//        if (i == gas.length) {
//            i = 0;
//        }
//        //如果当前剩余的汽油加上在i汽油站获取的汽油 > 去下一个汽油站需要消耗的汽油
//        if (having + gas[i] > cost[i]) {
//            return isFull(having + gas[i] - cost[i], gas, cost, ++i, ++isCircl);
//        } else {
//            return -1;
//        }
//    }
//
//
//    public int canCompleteCircuit(int[] gas, int[] cost) {
//
//        int sumGas = 0;
//        int sumCost = 0;
//        for (int i = 0; i < gas.length; i++) {
//            sumCost += cost[i];
//            sumGas += gas[i];
//        }
//        if (sumGas < sumCost)
//            return -1;
//        for (int i = 0; i < gas.length; i++) {
//            if (isFull(0, gas, cost, i, 1) == 1) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}
