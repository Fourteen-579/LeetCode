//package com.fourteen3;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Day12_16 {
//    public static void main(String[] args) {
//        String s = "dog cat cat fish";
//        String p = "abba";
//        System.out.println(new Solution().wordPattern(p, s));
//    }
//}
//
//class Solution {
//    public boolean wordPattern(String pattern, String s) {
//
//        String[] word = s.split(" ");
//        if (word.length != pattern.length())
//            return false;
//        Map<Character, String> map = new HashMap<>();
//        for (int i = 0; i < pattern.length(); i++) {
//            if (map.containsKey(pattern.charAt(i))) {
//                if (!map.get(pattern.charAt(i)).equals(word[i]))
//                    return false;
//            } else if(!map.containsValue(word[i])){
//                map.put(pattern.charAt(i), word[i]);
//            }else{
//                return false;
//            }
//        }
//        return true;
//    }
//}
