package Leetcode;

public class MergeIntervals_LC {

    public static void main(String[] args) {

        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
        merge(arr);
    }

    public static int[][] merge(int[][] intervals) {

        int[][] merge = new int[intervals[0].length][intervals[1].length];

        merge[0] = intervals[0];
        int i = 1;
        while(i<intervals.length) {
            if(merge[i][i] <= intervals[i][i] && merge[i][i+1] >= intervals[i][i]) {
                merge[i][i] = intervals[0][0];
            }
        }

    }
}
