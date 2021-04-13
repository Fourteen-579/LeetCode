//package com.fourteen6;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Day4_13 {
//}
//
//
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode() {
//    }
//
//    TreeNode(int val) {
//        this.val = val;
//    }
//
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}
//
//class Solution {
//
//    public void tool(TreeNode node, List<Integer> list) {
//        if (node == null)
//            return;
//        tool(node.left, list);
//        list.add(node.val);
//        tool(node.right, list);
//    }
//
//    public int minDiffInBST(TreeNode root) {
//        int min = 0;
//        if (root.left != null)
//            min = root.val - root.left.val;
//        else
//            min = root.right.val - root.val;
//        List<Integer> list = new ArrayList<>();
//        tool(root, list);
//        for (int i = 0; i < list.size() - 1; i++) {
//            min = Math.min(min, list.get(i+1) - list.get(i));
//        }
//        return min;
//    }
//}