//package com.fourteen3;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class Day12_22 {
//    public static void main(String[] args) {
//        int[] val = new int[]{3, 9, 20, 0, 0, 15, 7};
//        TreeNode root = new TreeNode(1);
//        TreeNode node = new TreeNode(2);
//        TreeNode node1 = new TreeNode(3);
//        root.left = node;
//        root.right = node1;
//
//        TreeNode node2 = new TreeNode(4);
//
//        TreeNode node3 = new TreeNode(5);
//        node.left = node2;
//        node.right = node3;
//        TreeNode node4 = new TreeNode(6);
//        TreeNode node5 = new TreeNode(7);
//        node1.left = node4;
//        node1.right = node5;
//        TreeNode node6 = new TreeNode(8);
//        TreeNode node7 = new TreeNode(9);
//        node2.left = node6;
//        node2.right = node7;
//        TreeNode node8 = new TreeNode(10);
//        TreeNode node9 = new TreeNode(11);
//        node3.left = node8;
//        node3.right = node9;
//        TreeNode node10 = new TreeNode(12);
//        TreeNode node11 = new TreeNode(13);
//        node4.left = node10;
//        node4.right = node11;
//        TreeNode node12 = new TreeNode(14);
//        node5.left = node12;
//
//        System.out.println(new Solution().zigzagLevelOrder(root));
//    }
//}
//
//
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int x) {
//        val = x;
//    }
//}
//
//class Solution {
//
//    public void tool(int level, TreeNode node, List<List<Integer>> listBig) {
//        if (node == null)
//            return;
//
//        if ((node.left != null || node.right != null) && listBig.size() <= level)
//            listBig.add(new ArrayList<>());
//
//        if (node.left != null) {
//            listBig.get(level).add(node.left.val);
//            tool(level + 1, node.left, listBig);
//        }
//        if (node.right != null) {
//            listBig.get(level).add(node.right.val);
//            tool(level + 1, node.right, listBig);
//        }
//    }
//
//    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//
//
//        List<List<Integer>> listBig = new ArrayList<>();
//        if(root==null)
//            return listBig;
//        listBig.add(new ArrayList<>());
//        listBig.get(0).add(root.val);
//        tool(1, root, listBig);
//        for (int i = 1; i < listBig.size(); i += 2) {
//            Collections.reverse(listBig.get(i));
//        }
//        return listBig;
//    }
//}