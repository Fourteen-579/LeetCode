//package com.fourteen6;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Day4_14 {
//}
//
//class Trie {
//
//    List<String> list;
//
//    /**
//     * Initialize your data structure here.
//     */
//    public Trie() {
//        list = new ArrayList<>();
//    }
//
//    /**
//     * Inserts a word into the trie.
//     */
//    public void insert(String word) {
//        list.add(word);
//    }
//
//    /**
//     * Returns if the word is in the trie.
//     */
//    public boolean search(String word) {
//        return list.contains(word);
//    }
//
//    /**
//     * Returns if there is any word in the trie that starts with the given prefix.
//     */
//    public boolean startsWith(String prefix) {
//        for (String s : list) {
//            if (s.startsWith(prefix))
//                return true;
//        }
//        return false;
//    }
//}