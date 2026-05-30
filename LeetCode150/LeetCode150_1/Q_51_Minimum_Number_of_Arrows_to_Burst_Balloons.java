package LeetCode150.LeetCode150_1;

import java.util.Arrays;
import java.util.Comparator;

public class Q_51_Minimum_Number_of_Arrows_to_Burst_Balloons  {
    public static void main(String[] args) {
         int[][] points1={{10,16},{2,8},{1,6},{7,12}};
        int[][] points2={{1,2},{3,4},{5,6},{7,8}};

        System.out.println("Input  : " + Arrays.deepToString(points1));
        System.out.println("Output : " + findMinArrowShots(points1));

        System.out.println("\nInput  : " + Arrays.deepToString(points2));
        System.out.println("Output : " + findMinArrowShots(points2));
    }
    public static int findMinArrowShots(int[][] points){
        if(points==null || points.length==0){            return 0;        }
        Arrays.sort(points,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return Integer.compare(a[1], b[1]);
            } });
            
        int arrows=1;
        int currentEnd=points[0][1];
        
        for(int i=1;i<points.length;i++){
            int start=points[i][0];
            int end=points[i][1];

            if(start>currentEnd){
                arrows++;
                currentEnd=end;
            }else{

            }
        }
        return arrows;
    }
}


