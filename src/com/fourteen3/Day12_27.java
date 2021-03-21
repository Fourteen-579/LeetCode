//package com.fourteen3;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//
//public class Day12_27 {
//    public static void main(String[] args) throws IOException {
////        String s="ab";
////        String t="aa";
////        System.out.println(new Solution().isIsomorphic(s,t));
//
//
//    }
//}
//
//class Solution {
//    public boolean isIsomorphic(String s, String t) {
//
//        Map<Character, Character> map = new HashMap<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            char sc = s.charAt(i);
//            char tc = t.charAt(i);
//            if(!map.containsKey(sc)&&!map.containsValue(tc)){
//                map.put(sc,tc);
//            }
//            else if(map.containsKey(sc)&&map.get(sc)==tc){
//                continue;
//            }else
//                return false;
//        }
//
//        return true;
//    }
//}