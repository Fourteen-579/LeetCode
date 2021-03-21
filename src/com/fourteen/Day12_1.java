//package com.fourteen;
//
//import java.util.Arrays;
//
//public class Day12_1 {
//    public static void main(String[] args) {
////[1,2,3,4,4,4,4,4,5,7,8,9]
////9
//        int nums[] = {2,2};
//        int target = 2;
//        System.out.println(Arrays.toString(new Solution().searchRange(nums, target)));
//    }
//}
//
//class Solution {
//    public int[] searchRange(int[] nums, int target) {
//        int point[] = new int[]{-1, -1};
//        if(nums.length==0||(nums.length==1&&nums[0]!=target))
//            return point;
//        if(nums.length==1&&nums[0]==target){
//            point[0]=0;
//            point[1]=0;
//            return point;
//        }
//        int left = 0, rigth = nums.length - 1;
//        int i = (left + rigth) / 2;
//        int c = nums[i];
//        while (true) {
//            if (c != target) {
//                if (c > target) {
//                    rigth = i;
//                    i = (left + rigth) / 2;
//                } else if (c < target) {
//                    left = i;
//                    i = (left + rigth) / 2;
//                }
//                c = nums[i];
//                if (left == (rigth - 1)||left==rigth) {
//                    if (target != nums[left] && target != nums[rigth])
//                        break;
//                    else if (target == nums[left]) {
//                        i = left;
//                        c = nums[i];
//                    } else if (target == nums[rigth]) {
//                        i = rigth;
//                        c = nums[i];
//                    }
//                }
//            } else {
//                point[0] = i;
//                point[1] = i;
//
//                while (point[0] != 0 && nums[point[0] - 1] == target) {
//                    point[0]--;
//                }
//                while (point[1] != (nums.length - 1) && nums[point[1] + 1] == target) {
//                    point[1]++;
//                }
//
//                break;
//            }
//        }
//
//
//        return point;
//    }
//}
