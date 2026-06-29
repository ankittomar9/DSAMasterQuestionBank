package LeetCode150.LeetCode150_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_142_Triangle {
    public static void main(String[] args) {
         List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));

        System.out.println("Input Triangle:");
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }

        System.out.println("\nMinimum Path Sum: " + minimumTotal(triangle));
    }
    public static int minimumTotal(List<List<Integer>> triangle){
        int n=triangle.size();
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                int belowLeft=triangle.get(i+1).get(j);
                int belowRight=triangle.get(i+1).get(j+1);
                int minimum=Math.min(belowLeft, belowRight);
              triangle.get(i).set(j, triangle.get(i).get(j)+ minimum);  
            }
        }
        return triangle.get(0).get(0);
    }
}
