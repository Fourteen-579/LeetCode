//package com.fourteen;
//
//public class Day11_26_2 {
//    public static void main(String[] args) {
//        TreeNode root1 = new TreeNode(3);
//        TreeNode root2 = new TreeNode(2);
//        root1.left = root2;
//        TreeNode root3 = new TreeNode(3);
//        root1.right = root3;
//        TreeNode root4 = new TreeNode(3);
//        root2.right = root4;
//        TreeNode root5 = new TreeNode(1);
//        root3.right = root5;
//        System.out.println(new Solution().rob(root1));
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
//    public int getSonVal(TreeNode node, boolean isCan) {
//        if (node == null)
//            return 0;
//        if (!isCan) {
//            //如果不能取当前节点
//            return getSonVal(node.left, true) + getSonVal(node.right, true);
//        } else {
//            //如果能去当前节点并取值
//            return Math.max(node.val + getSonVal(node.left, false) + getSonVal(node.right, false),
//                    getSonVal(node.left, true) + getSonVal(node.right, true));
//            //不能取当前节点不取值
//        }
//    }
//
//    public int rob(TreeNode root) {
//        float []f[]=new float[3][];
//        //如果选择头节点 则递归不包括头的子树
//        return getSonVal(root, true);
//        //如果不选择头节点  则递归包括头的子树
//    }
//}