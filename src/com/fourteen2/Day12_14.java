//package com.fourteen2;
//
//import java.util.*;
//
//public class Day12_14 {
//    public static void main(String[] args) {
//        String[] s = {"eat", "tea", "tan", "ate", "nat", "bat"};
//        System.out.println(new Solution().groupAnagrams(s));
//    }
//}
//
//class Solution {
//    public List<List<String>> groupAnagrams(String[] strs) {
//
//        List<List<String>> listAll = new ArrayList<>();
//
//        Map<String,Integer> map = new HashMap();
//
//        for(int i=0;i<strs.length;i++){
//            char[] temp = strs[i].toCharArray();
//            Arrays.sort(temp);
//            String s = String.valueOf(temp);
//            if(!map.containsKey(s)){
//                map.put(s,listAll.size());
//                listAll.add(new ArrayList<>());
//            }
//            listAll.get(map.get(s)).add(strs[i]);
//        }
//
//        return listAll;
//    }
//}