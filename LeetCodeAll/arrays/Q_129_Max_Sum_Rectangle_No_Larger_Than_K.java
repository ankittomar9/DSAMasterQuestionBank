package LeetCodeAll.arrays;

import java.util.TreeSet;

public class Q_129_Max_Sum_Rectangle_No_Larger_Than_K {
    public static void main(String[] args) {
         int[][] m1 = {{1, 0, 1}, {0, -2, 3}};
        System.out.println("matrix=[[1,0,1],[0,-2,3]], k=2");
        System.out.println("Result: " + maxSumSubmatrix(m1, 2)); // 2

        // Test 2: single row
        System.out.println();
        int[][] m2 = {{2, 2, -1}};
        System.out.println("matrix=[[2,2,-1]], k=3");
        System.out.println("Result: " + maxSumSubmatrix(m2, 3)); // 3

        // Test 3: larger matrix
        System.out.println();
        int[][] m3 = {{5,-4,-3,4},{-3,-4,4,5},{5,1,5,-4}};
        System.out.println("matrix=[[5,-4,-3,4],[-3,-4,4,5],[5,1,5,-4]], k=8");
        System.out.println("Result: " + maxSumSubmatrix(m3, 8)); // 8

        // Test 4: negative k
        System.out.println();
        int[][] m4 = {{1, 1}, {1, 1}};
        System.out.println("matrix=[[1,1],[1,1]], k=0");
        System.out.println("Result: " + maxSumSubmatrix(m4, 0)); // 0? No — no submatri
    }

    public static int maxSumSubmatrix(int[][] matrix ,int k){
        int m=matrix.length , n=matrix[0].length;
        int maxSum=Integer.MIN_VALUE;

        for(int left=0; left<n;left++){
            int[] colSum=new int[m];

            for(int right=left;right<n;right++){
                for(int r=0;r<m;r++){
                    colSum[r] =colSum[r]+matrix[r][right];

                    TreeSet<Integer> set=new TreeSet<>();
                    set.add(0);
                    int curSum=0;

                    for(int val : colSum){
                        curSum=curSum+val;
                        Integer ceiling=set.ceiling(curSum-k);
                        if(ceiling !=null ) maxSum=Math.max(maxSum,curSum-ceiling);
                        set.add(curSum);
                    }
                }
            }
        }
        return maxSum;
    }

}
