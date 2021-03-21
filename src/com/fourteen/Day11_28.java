//package com.fourteen;
//
//import java.util.Arrays;
//import java.util.Comparator;
//
//public class Day11_28 {
//    public static void main(String[] args) {
//        int[] nums = new int[]{1, 3, 2, 3, 1};
//        System.out.println(new Solution().reversePairs(nums));
//    }
//}
//
//class Solution {
//    public static int count = 0;
//
//    public void s(int[] nums, int head, int mid, int tail, int[] temp) {
//        int i = head, j = mid + 1, k = 0;
//
//        while (i <= mid) {
//            while (j <= tail && (long) nums[i] > (long) nums[j] * 2) {
//                count++;
//                j++;
//            }
//            j = mid + 1;
//            i++;
//        }
//        i = head;
//        j = mid + 1;
//        while (i <= mid && j <= tail) {
//
//            if (nums[i] <= nums[j]) {
//                temp[k++] = nums[i++];
//                if (i > mid) {
//                    while (j <= tail)
//                        temp[k++] = nums[j++];
//                }
//            } else if (nums[i] > nums[j]) {
//                temp[k++] = nums[j++];
//                if (j > tail) {
//                    while (i <= mid)
//                        temp[k++] = nums[i++];
//                }
//            }
//        }
//
//        for (k = 0, i = head; k < temp.length; i++, k++) {
//            nums[i] = temp[k];
//        }
//    }
//
//
//    public void tool(int[] nums, int head, int mid, int tail) {
//        if (head < tail) {
//            //把数组划分成两半
//            tool(nums, head, (head + mid) / 2, mid);
//            tool(nums, mid + 1, (mid + 1 + tail) / 2, tail);
//
//            //把两个数组合并成一个
//            int[] temp = new int[tail - head + 1];
//            int i = head, j = mid + 1, k = 0;
//
//            while (i <= mid) {
//                while (j <= tail && (long) nums[i] > (long) nums[j] * 2) {
//                    count++;
//                    j++;
//                }
//                j = mid + 1;
//                i++;
//            }
//            i = head;
//            j = mid + 1;
//            while (i <= mid && j <= tail) {
//
//                if (nums[i] <= nums[j]) {
//                    temp[k++] = nums[i++];
//                    if (i > mid) {
//                        while (j <= tail)
//                            temp[k++] = nums[j++];
//                    }
//                } else if (nums[i] > nums[j]) {
//                    temp[k++] = nums[j++];
//                    if (j > tail) {
//                        while (i <= mid)
//                            temp[k++] = nums[i++];
//                    }
//                }
//            }
//
//            for (k = 0, i = head; k < temp.length; i++, k++) {
//                nums[i] = temp[k];
//            }
//        }
//
//    }
//
//
//    public int reversePairs(int[] nums) {
//        if (nums.length == 0)
//            return 0;
//        count = 0;
//        tool(nums, 0, ((nums.length - 1) / 2), nums.length - 1);
//        return count;
//    }
//}
