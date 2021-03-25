package com.fourteen5;

import java.util.Deque;
import java.util.LinkedList;

public class Day3_25 {
    public static void main(String[] args) {
        int[] head = {1, 1, 1};
        ListNode h = new ListNode(head[0]);
        ListNode r = h;
        for (int i = 1; i < head.length; i++) {
            h.next = new ListNode(head[i]);
            h = h.next;
        }
//        ListNode listNode = new com.fourteen.Solution().deleteDuplicates(r);
//        while (listNode != null) {
//            System.out.print(listNode.val + "\t");
//            listNode = listNode.next;
//        }
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        boolean flag = false;
        while (head != null) {
            if (head.val == head.next.val) {
                if (head.next.next == null) {
                    return null;
                }
                head = head.next;
                flag = true;
            } else {
                if (flag)
                    head = head.next;
                break;
            }
        }


        return head;
    }
}

class Solution12 {
    public ListNode deleteDuplicates(ListNode head) {
        Deque<ListNode> deque = new LinkedList<>();

        while (head != null) {
            if (deque.isEmpty()) {
                deque.add(head);
                head = head.next;
                continue;
            } else if (deque.peekLast().val == head.val) {
                while (head != null && deque.peekLast().val == head.val) {
                    head = head.next;
                }
                deque.pollLast();
            }
            if (head == null)
                break;

            deque.add(head);
            head = head.next;
        }
        ListNode re = null;
        if (!deque.isEmpty()) {
            re = deque.pollFirst();
            re.next = null;
        }

        ListNode temp = re;
        while (!deque.isEmpty()) {
            temp.next = deque.pollFirst();

            temp = temp.next;
            temp.next = null;
        }

        return re;
    }
}