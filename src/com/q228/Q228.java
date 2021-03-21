//package com.q228;
//
//import java.util.LinkedList;
//import java.util.List;
//
//public class Q228 {
//    public static void main(String[] args) {
//        new Solution().summaryRanges(new int[]{
//                0,1,2,4,5,7
//        });
//    }
//}
//
//class Solution {
//    public List<String> summaryRanges(int[] nums) {
//        List<String> list = new LinkedList<>();
//        if(nums.length == 0){
//            return list;
//        }
//
//        boolean mark = false;
//        StringBuffer string = new StringBuffer();
//        string.append(nums[0]);
//
//        for(int i = 1; i<nums.length; i++){
//            if(nums[i] == nums[i-1] + 1){
//                //构成顺序，则继续
//                mark = true;
//            }else{
//                //发生断层
//                if(mark){
//                    //如果之前构成了顺序，则需要添加首末
//                    string.append("->" + nums[i-1]);
//                }
//                list.add(string.toString());
//                string = new StringBuffer();
//                string.append(nums[i]);
//                mark = false;
//            }
//        }
//
//        //结束后，如果mark为true，表示末尾也被包含，需要加入
//        if(mark){
//            //如果之前构成了顺序，则需要添加首末
//            string.append("->" + nums[nums.length - 1]);
//        }
//        list.add(string.toString());
//
//        return list;
//    }
//}
