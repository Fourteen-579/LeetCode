//package com.fourteen;
//
//import java.util.Arrays;
//import java.util.Comparator;
//
//public class Day11_23 {
//    public static void main(String[] args) {
//        int[][] points = {{10, 16}, {2, 8}, {1, 6,}, {7, 12}};
////        int [][] points = {{1,2},{3,4},{5,6},{7,8}};
////        int [][]points = {{1,2}};
////        int [][]points ={{2,3},{2,3}};
////        int[][] points={{1,2},{2,3},{3,4},{4,5}};
////        int [][]points={{3,9},{7,12},{3,8},{6,8},{9,10},{2,9},{0,9},{3,9},{0,6},{2,8}};
////        int[][] points = {{9, 12}, {1, 10}, {4, 11}, {8, 12}, {3, 9}, {6, 9}, {6, 7}};
//        System.out.println(new Solution().findMinArrowShots(points));
//    }
//}
//
//class Solution {
//    public int findMinArrowShots(int[][] points) {
//        int nums = points.length;
//
//        Arrays.sort(points, new Comparator<int[]>() {
//
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if (o1[0] > o2[0])
//                    return 1;
//                else if (o1[0] < o2[0])
//                    return -1;
//                else if (o1[1] > o2[1])
//                    return 1;
//                else if (o1[1] < o2[1])
//                    return -1;
//                return 0;
//            }
//        });
//        int count = 0;
//        int j = 0;
//        int[] com = new int[2];
//
//        for (int i = 0; i < points.length - 1; i = j) {
//            j = i + 1;
//            com[0]=points[i][0];
//            com[1]=points[i][1];
//            while (j < points.length && !(com[1] < points[j][0])) {
//                int pow[]={com[0],com[1],points[j][0],points[j][1]};
//                Arrays.sort(pow);
//                com[0]=pow[1];
//                com[1]=pow[2];
//                count++;
//                j++;
//
//            }
//        }
//
//
//        return nums - count;
//    }
//}