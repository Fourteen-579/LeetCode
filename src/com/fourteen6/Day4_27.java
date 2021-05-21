//package com.fourteen6;
//
//public class Day4_27 {
//    public static void main(String[] args) {
//        TreeNode one = new TreeNode(1);
//        TreeNode six = new TreeNode(6);
//        TreeNode ten_three = new TreeNode(13);
//        TreeNode ten_eight = new TreeNode(18);
//        TreeNode three = new TreeNode(3, one, null);
//        TreeNode seven = new TreeNode(7, six, null);
//        TreeNode five = new TreeNode(5, three, seven);
//        TreeNode ten_five = new TreeNode(15, ten_three, ten_eight);
//        TreeNode ten = new TreeNode(10, five, ten_five);
//        System.out.println(new Solution().rangeSumBST(ten, 6, 10));
//
//        Object o = new Object();
//
//
//    }
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
//    public int tool(TreeNode root, Integer sum, int low, int high) {
//        if (root.val >= low && root.val <= high)
//            sum = sum + root.val;
//        if (root.val >= low && root.left!=null)
//            sum = tool(root.left, sum, low, high);
//        if (root.val <= high && root.right!=null)
//            sum = tool(root.right, sum, low, high);
//        return sum;
//    }
//
//    public int rangeSumBST(TreeNode root, int low, int high) {
//        Integer sum = new Integer(0);
//        sum = tool(root, sum, low, high);
//        return sum;
//    }
//}
