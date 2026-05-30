package LeetCode150.LeetCode150_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_50_Insert_Interval {
    public static void main(String[] args) {
     int[][] intervals1 = {{1,3},{6,9}};      int[] new1 = {2,5};
      System.out.println("Input Intervals   : \n" + Arrays.deepToString(intervals1));
        System.out.println("New Interval    : \n" + Arrays.toString(new1));
        System.out.println("Output          : \n" + Arrays.deepToString(insert(intervals1, new1)));

        int[][] intervals2 = {{1,2},{3,5},{6,7},{8,10},{12,16}};        int[] new2 = {4,8};
        System.out.println("\nInput Intervals : \n" + Arrays.deepToString(intervals2));
        System.out.println("New Interval    : \n" + Arrays.toString(new2));
        System.out.println("Output          : \n" + Arrays.deepToString(insert(intervals2, new2)));    
    }
    public static int[][] insert(int[][] intervals,int[] newInterval){
        List<int[]>result=new ArrayList<>();
        int i=0;int n=intervals.length;

        while(i<n && intervals[i][1] <newInterval[0]){
            result.add(intervals[i]);
            i++;
        }
         while(i<n && intervals[i][0] <= newInterval[1]){
           newInterval[0]=Math.min(newInterval[0], intervals[i][0]);
           newInterval[1]=Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval);

        while(i<n){
            result.add(intervals[i]);
            i++;
        }
        return result.toArray(new int[result.size()][]);
    }

}
