//package com.fourteen5;
//
//public class Day3_27 {
//    public static void main(String[] args) {
//        int[] head = {};
//        ListNode h = new ListNode(head[0]);
//        ListNode r = h;
//        for (int i = 1; i < head.length; i++) {
//            h.next = new ListNode(head[i]);
//            h = h.next;
//        }
//        ListNode listNode = new Solution().rotateRight(r, 4);
//        while (listNode != null) {
//            System.out.print(listNode.val + "\t");
//            listNode = listNode.next;
//        }
//    }
//}
//
//
//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode() {
//    }
//
//    ListNode(int val) {
//        this.val = val;
//    }
//
//    ListNode(int val, ListNode next) {
//        this.val = val;
//        this.next = next;
//    }
//}
//
//class Solution {
//    public ListNode rotateRight(ListNode head, int k) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//        ListNode nhead = head;
//        int length = 1;
//        while (nhead.next != null) {
//            nhead = nhead.next;
//            length++;
//        }
//        ListNode tail = nhead;
//        nhead.next = head;
//        k = length - k % length;
//        while (k-- > 0) {
//            tail.next = head;
//            tail = tail.next;
//            head = head.next;
//            tail.next = null;
//        }
//
//
//        return head;
//    }
//}