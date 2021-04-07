//package com.fourteen6;
//
//import javax.script.ScriptException;
//
//public class Day4_1 {
//    public static void main(String[] args) throws ScriptException {
//        int N = 10;
//        System.out.println(new Solution().clumsy(N));
//    }
//}
//
//class Solution {
//    public int clumsy(int N) {
//        if(N<=2) return N;
//        if(N==3) return 6;
//        int sum=N*(N-1)/(N-2)+N-3;
//        N-=4;
//        while(N>=4){
//            sum+=(-N*(N-1)/(N-2)+N-3);
//            N-=4;
//        }
//        return sum-clumsy(N);
//    }
//}