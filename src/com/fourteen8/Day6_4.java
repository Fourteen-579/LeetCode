//package com.fourteen8;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Day6_4 {
//}
//
//
//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode(int x) {
//        val = x;
//        next = null;
//    }
//}
//
//class Solution {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        List<ListNode> a = new ArrayList<>();
//        List<ListNode> b = new ArrayList<>();
//
//        while (headA != null || headB != null) {
//            if (headA != null) {
//                if (b.contains(headA))
//                    return headA;
//                a.add(headA);
//            }
//
//            if (headB != null) {
//                if (a.contains(headB))
//                    return headB;
//                b.add(headB);
//            }
//            headA = headA.next;
//            headB = headB.next;
//        }
//        return null;
//    }
//}
