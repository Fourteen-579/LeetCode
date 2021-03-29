//package com.fourteen5;
//
//import java.util.*;
//
//public class Day3_23 {
//    public static void main(String[] args) {
//        List<NestedInteger> nestedList = new ArrayList<>();
//
//    }
//}
//
//
//// This is the interface that allows for creating nested lists.
//// You should not implement it, or speculate about its implementation
//interface NestedInteger {
//
//    // @return true if this NestedInteger holds a single integer, rather than a nested list.
//    public boolean isInteger();
//
//    // @return the single integer that this NestedInteger holds, if it holds a single integer
//    // Return null if this NestedInteger holds a nested list
//    public Integer getInteger();
//
//    // @return the nested list that this NestedInteger holds, if it holds a nested list
//    // Return null if this NestedInteger holds a single integer
//    public List<NestedInteger> getList();
//}
//
//class NestedIterator implements Iterator<Integer> {
//
//    Deque<Integer> deque = new LinkedList<>();
//
//    public void createNes(List<NestedInteger> nestedList) {
//        for (NestedInteger nestedInteger : nestedList) {
//            if (nestedInteger.isInteger()) {
//                deque.add(nestedInteger.getInteger());
//            } else {
//                createNes(nestedInteger.getList());
//            }
//        }
//    }
//
//    public NestedIterator(List<NestedInteger> nestedList) {
//        createNes(nestedList);
//    }
//
//    @Override
//    public Integer next() {
//        return deque.poll();
//    }
//
//    @Override
//    public boolean hasNext() {
//        return !deque.isEmpty();
//    }
//}