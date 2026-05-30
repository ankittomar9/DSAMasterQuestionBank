package LeetCode150.LeetCode150_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q_49_Merge_Intervals {
    public static void main(String[] args) {
         int[][] intervals1 = {{1,3},{2,6},{8,10},{15,18}};
            System.out.println("Input  : " + Arrays.deepToString(intervals1));
             System.out.println("Output : " + Arrays.deepToString(merge(intervals1)));

        int[][] intervals2 = {{1,4},{4,5}};
        System.out.println("\nInput  : " + Arrays.deepToString(intervals2));
        System.out.println("Output : " + Arrays.deepToString(merge(intervals2)));
    }
    public static int[][] merge(int[][] intervals){
        if(intervals ==null || intervals.length<=1){            return intervals;        }

        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return a[0]-b[0];
            }});

       List<int[]> result=new ArrayList<>();
       int[] current=intervals[0];
       
       for(int i=1;i<intervals.length;i++){
        int[] next=intervals[i];

        if(next[0]<=current[1]){
            current[1]=Math.max(current[1], next[1]);
        }else{
            result.add(current);
            current=next;
        }
       }
       result.add(current);
       int[][] merged=new int[result.size()][2];
       for(int i=0;i<result.size();i++){
        merged[i]=result.get(i);
       }
       return merged;
    }
}

