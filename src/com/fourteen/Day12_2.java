//package com.fourteen;
//
//import com.sun.deploy.util.ArrayUtil;
//
//import java.util.Arrays;
//
//public class Day12_2 {
//    public static void main(String[] args) {
//// [8,0,4,4,1,7,3,6,5,9,3,6,6,0,2,5,1,7,7,7,8,7,1,4,4,5,4,8,7,6,2,2,9,4,7,5,6,2,2,8,4,6,0,4,7,8,9,1,7,0]
////[6,9,8,1,1,5,7,3,1,3,3,4,9,2,8,0,6,9,3,3,7,8,3,4,2,4,7,4,5,7,7,2,5,6,3,6,7,0,3,5,3,2,8,1,6,6,1,0,8,4]
////50
//        int[] nums1 = {8,0,4,4,1,7,3,6,5,9,3,6,6,0,2,5,1,7,7,7,8,7,1,4,4,5,4,8,7,6,2,2,9,4,7,5,6,2,2,8,4,6,0,4,7,8,9,1,7,0};
//        int[] nums2 = {6,9,8,1,1,5,7,3,1,3,3,4,9,2,8,0,6,9,3,3,7,8,3,4,2,4,7,4,5,7,7,2,5,6,3,6,7,0,3,5,3,2,8,1,6,6,1,0,8,4};
//        int k =50;
//
//        System.out.println(Arrays.toString(new Solution().maxNumber(nums1, nums2, k)));
//    }
//}
//
//class Solution {
//
//    public int[] max(int[] nums, int first, int last) {
//        int result[] = new int[]{-1, -1};
//        if (first == last)
//            return result;
//        result[0] = nums[first];
//        result[1] = first;
//        for (int i = first + 1; i < last; i++) {
//            if (result[0] < nums[i]) {
//                result[0] = nums[i];
//                result[1] = i;
//            }
//        }
//
//        return result;
//    }
//
//    public void tool(int[] nums1, int[] nums2, int[] result, int point, int k, int count1, int count2, int last1, int last2) {
//
//        if (point == k) {
//            return;
//        }
//
//        int[] max1 = max(nums1, count1, last1);
//        int[] max2 = max(nums2, count2, last2);
//        if (max1[0] > max2[0]) {
//            if (nums1.length+nums2.length-k < max1[1] + count2 - point)
//                tool(nums1, nums2, result, point, k, count1, count2, max1[1], nums2.length);
//            else {
//                result[point] = max1[0];
//                tool(nums1, nums2, result, point + 1, k, max1[1] + 1, count2, nums1.length, nums2.length);
//            }
//        }
//        else if (max1[0] < max2[0]) {
//            if (nums1.length+nums2.length-k < (count1 + max2[1] - point))
//                tool(nums1, nums2, result, point, k, count1, count2, last1, max2[1]);
//            else {
//                result[point] = max2[0];
//                tool(nums1, nums2, result, point + 1, k, count1, max2[1] + 1, nums1.length, nums2.length);
//            }
//        }
//        else {
//            if (max1[1] - count1 > max2[1] - count2) {
//                if (nums1.length + nums2.length - k < (count1 + max2[1] - point))
//                    tool(nums1, nums2, result, point, k, count1, count2, last1, max2[1]);
//                else {
//                    result[point] = max2[0];
//                    tool(nums1, nums2, result, point + 1, k, count1, max2[1] + 1, nums1.length, nums2.length);
//                }
//            }
//            else if (max1[1] - count1 < max2[1] - count2) {
//                if (nums1.length+nums2.length-k < max1[1] + count2 - point)
//                    tool(nums1, nums2, result, point, k, count1, count2, max1[1], nums2.length);
//                else {
//                    result[point] = max1[0];
//                    tool(nums1, nums2, result, point + 1, k, max1[1] + 1, count2, nums1.length, nums2.length);
//                }
//            }
//            else {
//                int i = 0, j = 0;
//
//                if(max1[1]==nums1.length-1&&max2[1]==nums2.length-1) {
//                    for (i = count1, j = count2; i < max1[1] && j < max2[1]; i++, j++) {
//                        if (nums1[i] > nums2[j]) {
//                            if (nums1.length + nums2.length - k < (count1 + max2[1] - point))
//                                tool(nums1, nums2, result, point, k, count1, count2, last1, max2[1]);
//                            else {
//                                result[point] = max2[0];
//                                tool(nums1, nums2, result, point + 1, k, count1, max2[1] + 1, nums1.length, nums2.length);
//                            }
//                            break;
//                        } else if (nums1[i] < nums2[j]) {
//                            if (nums1.length + nums2.length - k < max1[1] + count2 - point)
//                                tool(nums1, nums2, result, point, k, count1, count2, max1[1], nums2.length);
//                            else {
//                                result[point] = max1[0];
//                                tool(nums1, nums2, result, point + 1, k, max1[1] + 1, count2, nums1.length, nums2.length);
//                            }
//                            break;
//                        }
//                    }
//                    if (i == max1[1]) {
//                        if (nums1.length + nums2.length - k < (count1 + max2[1] - point))
//                            tool(nums1, nums2, result, point, k, count1, count2, last1, max2[1]);
//                        else {
//                            result[point] = max2[0];
//                            tool(nums1, nums2, result, point + 1, k, count1, max2[1] + 1, nums1.length, nums2.length);
//                        }
//                    }
//                }
//                else {
//                    for (i = max1[1], j = max2[1]; i < nums1.length && j < nums2.length; i++, j++) {
//                        if (nums1[i] > nums2[j]) {
//                            if (nums1.length + nums2.length - k < max1[1] + count2 - point)
//                                tool(nums1, nums2, result, point, k, count1, count2, max1[1], nums2.length);
//                            else {
//                                result[point] = max1[0];
//                                tool(nums1, nums2, result, point + 1, k, max1[1] + 1, count2, nums1.length, nums2.length);
//                            }
//                            break;
//                        } else if (nums1[i] < nums2[j]) {
//                            if (nums1.length + nums2.length - k < (count1 + max2[1] - point))
//                                tool(nums1, nums2, result, point, k, count1, count2, last1, max2[1]);
//                            else {
//                                result[point] = max2[0];
//                                tool(nums1, nums2, result, point + 1, k, count1, max2[1] + 1, nums1.length, nums2.length);
//                            }
//                            break;
//                        }
//                    }
//                    if (i == nums1.length) {
//                        if (nums1.length + nums2.length - k < (count1 + max2[1] - point))
//                            tool(nums1, nums2, result, point, k, count1, count2, last1, max2[1]);
//                        else {
//                            result[point] = max2[0];
//                            tool(nums1, nums2, result, point + 1, k, count1, max2[1] + 1, nums1.length, nums2.length);
//                        }
//                    }else if(j == nums2.length){
//                        if (nums1.length + nums2.length - k < max1[1] + count2 - point)
//                            tool(nums1, nums2, result, point, k, count1, count2, max1[1], nums2.length);
//                        else {
//                            result[point] = max1[0];
//                            tool(nums1, nums2, result, point + 1, k, max1[1] + 1, count2, nums1.length, nums2.length);
//                        }
//                    }
//                }
//
//            }
//        }
//
//        return;
//    }
//
//    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
//        int[] result = new int[k];
//
//        if (k == 0)
//            return null;
//        int l1 = nums1.length;
//        int l2 = nums2.length;
//
//        tool(nums1, nums2, result, 0, k, 0, 0, l1, l2);
//
//        return result;
//    }
//}
