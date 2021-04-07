package com.fourteen6;

import java.util.Arrays;
import java.util.List;

public class Day4_7 {
    public static void main(String[] args) {
        int[] i = {2, 5, 6, 0, 0, 1, 2};
        int k = 2;
        System.out.println(new Solution().search(i, k));
    }
}


class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        return Arrays.binarySearch(nums, target) < 0 ? false : true;
    }
}