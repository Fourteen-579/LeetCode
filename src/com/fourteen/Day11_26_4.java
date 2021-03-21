//package com.fourteen;
//
//import java.util.ArrayList;
//import java.util.Stack;
//
//public class Day11_26_4 {
//    public static void main(String[] args) {
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
//    TreeNode(int x) {
//        val = x;
//    }
//}
//
//class BSTIterator {
//    ArrayList<Integer> list = new ArrayList<Integer>();
//    int nowIndex =-1;
//
//    public void midOrder(TreeNode node){
//        if(node == null){
//            return;
//        }else{
//            midOrder(node.left);
//            list.add(node.val);
//            midOrder(node.right);
//        }
//    }
//
//    public BSTIterator(TreeNode root) {
//        midOrder(root);
//    }
//
//    /**
//     * @return the next smallest number
//     */
//    public int next() {
//        nowIndex++;
//        return list.get(nowIndex);
//
//    }
//
//    /**
//     * @return whether we have a next smallest number
//     */
//    public boolean hasNext() {
//        if(list.size()<nowIndex+1)
//            return false;
//        else
//            return true;
//    }
//}
