//package com.fourteen;
//
//import java.util.TreeMap;
//
//public class Day11_24 {
//    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        TreeNode level_1_1 = new TreeNode(2);
//        TreeNode level_1_2 = new TreeNode(3);
//        TreeNode level_2_1 = new TreeNode(4);
//        TreeNode level_2_2 = new TreeNode(5);
//        TreeNode level_2_3 = new TreeNode(6);
//        root.left = level_1_1;
//        root.right = level_1_2;
//        level_1_1.left = level_2_1;
//        level_1_1.right = level_2_2;
//        level_1_2.left = level_2_3;
////        TreeNode root =null;
//        System.out.println(new Solution().countNodes(root));
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
//    static int num=0;
//    public void test(TreeNode node, int num) {
//        Solution.num++;
//        if (node.left == null) {
//            return;
//        } else if (node.right == null) {
//            test(node.left, Solution.num);
//            return;
//        }
//        test(node.left, Solution.num);
//        test(node.right, Solution.num);
//        return;
//    }
//
//    public int countNodes(TreeNode root) {
//        num=0;
//        if (root != null)
//            test(root, Solution.num);
//        return Solution.num;
//    }
//}
