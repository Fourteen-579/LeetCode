//package com.fourteen5;
//
//public class Day3_18 {
//    public static void main(String[] args) {
//        int[] heads = {1};
//        int left = 1, right = 1;
//        ListNode head = new ListNode();
//        ListNode.create(heads, head);
//
//        ListNode re = new Solution().reverseBetween(head, left, right);
//        while (re != null) {
//            System.out.print(re.val + "\t");
//            re = re.next;
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
//
//    public static void create(int[] array, ListNode head) {
//        ListNode temp = head;
//        for (int i = 0; i < array.length; i++) {
//            temp.val = array[i];
//            if (i < array.length - 1) {
//                temp.next = new ListNode(array[i]);
//                temp = temp.next;
//            }
//        }
//    }
//}
//
//class Solution {
//    public ListNode reverseBetween(ListNode head, int left, int right) {
//
//        ListNode re = head;
//        int center = (right + left) / 2;
//        ListNode[] array = new ListNode[(right - left) / 2 + 1];
//        int point = 0;
//        int j = 0, i = 0;
//        while (point++ != right) {
//            if (point < left) {
//            } else if (point <= center) {
//                if (point == center) {
//                    if ((right - left) % 2 != 0) {
//                        array[i++] = re;
//                    }
//                } else {
//                    array[i++] = re;
//                }
//                j = i - 1;
//            } else if (point <= right) {
//                int temp = array[j].val;
//                array[j].val = re.val;
//                re.val = temp;
//                j--;
//            }
//            re = re.next;
//        }
//        return head;
//    }
//}
//
//
//
//
//
//
//
