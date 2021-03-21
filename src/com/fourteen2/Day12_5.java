//package com.fourteen2;
//
//import java.util.*;
//
//public class Day12_5 {
//    public static void main(String[] args) {
////        ["A","A","A","B","B","B", "C","C","C", "D", "D", "E"]
////2
//        char[] tasks = {'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'};
//        int n = 2;
//        System.out.println(new Solution().leastInterval(tasks, n));
//    }
//}
//
////class Solution {
////    public int leastInterval(char[] tasks, int n) {
////        int time = 0;
////        if (n == 0)
////            return tasks.length;
////
////        //统计每个任务的数量
////        int[] task = new int[26];
////        for (int i = 0; i < tasks.length; i++) {
////            task[tasks[i] - 'A'] += 1;
////        }
////
////        Map<Character, Integer> map = new HashMap<>();
////
////        int notEndTask = tasks.length;
////        while (notEndTask > 0) {
////            //选择任务 每次选取数量最多的一个任务
////            int i = 0;
////            int[] temp = Arrays.copyOf(task, task.length);
////            int max = Arrays.stream(temp).max().getAsInt();
////            for (i = 0; i < task.length; i++) {
////                if (max == 0)
////                    break;
////                if (max == temp[i] && task[i] > 0 && (map.isEmpty() || (!map.isEmpty() && (!map.containsKey((char) (i + 'A')) || map.get((char) (i + 'A')) == 0)))) {
////                    map.put((char) (i + 'A'), n + 1);
////                    task[i]--;
////                    break;
////                } else if (max == temp[i] && !map.isEmpty() && map.get((char) (i + 'A')) > 0) {
////                    temp[i] = -1;
////                    max = Arrays.stream(temp).max().getAsInt();
////                    i=-1;
////                }
////            }
////
////            if (i != task.length && max != 0)
////                //执行任务
////                //如果当前没有任务需要执行则不进行这一步 如果当前有任务需要执行则执行
////                notEndTask--;
////
////
////
////            //时间过去 1.执行任务的时间+1 2.任务中需要冷却等待的时间-1
////            time++;
////            if (!map.isEmpty()) {
////                map.forEach((key, value) -> {
////                    if (value > 0)
////                        map.put(key, value - 1);
////                });
////            }
////
////        }
////        return time;
////    }
////}
//
//class Solution {
//    public int leastInterval(char[] tasks, int n) {
//        int count[] = new int[26];
//        for (int i = 0; i < tasks.length; i++) {
//            count[tasks[i] - 'A']++;
//        }
//
//        Arrays.sort(count);
//
//        int maxNums = 0;
//
//        for (int i = count.length - 1; i >= 0; i--) {
//            if (count[i] == count[25])
//                maxNums++;
//            else
//                break;
//        }
//
//        return Math.max(tasks.length,(count[25]-1)*(n+1)+maxNums);
//
//    }
//}