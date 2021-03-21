package com.fourteen;

import java.util.Arrays;
import java.util.Comparator;

public class Day11_16 {

    public static void main(String[] args) {
        int[][] people = {{2,4},{3,4}, {9,0},{0,6},{7,1},{6,0},{7,3},{2,5},{1,1},{8,0}};
        reconstructQueue(people);
    }

    public static int[][] reconstructQueue(int[][] people) {

        int news[][] = new int[people.length][2];
        for (int i = 0; i < news.length; i++)
            news[i][0] = -1;
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] < o2[0])
                    return -1;
                else if (o1[0] > o2[0])
                    return 1;
                else if (o1[1] > o2[1])
                    return -1;
                else if (o1[1] < o2[1])
                    return 1;
                return 0;
            }
        });


        for (int i = 0; i < people.length; i++) {
            int j = 0;
            int k = -1;
            while (people[i][1] != k) {
                if (news[j][0] == -1) {
                    k++;
                }
                j++;
            }
            news[j - 1] = people[i];
        }


        return news;
    }

}
