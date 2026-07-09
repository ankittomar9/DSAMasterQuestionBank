package LeetCodeAll.arrays;

import java.util.ArrayList;
import java.util.List;

public class Q_25_N_Queens {
    public static void main(String[] args) {
        int n1 = 4;        System.out.println("n = " + n1);
        List<List<String>> result1 = solveNQueens(n1);        printSolutions(result1);
        System.out.println("Total Solutions: " + result1.size()); 

        System.out.println();        int n3 = 8;        System.out.println("n = " + n3);
        List<List<String>> result3 = solveNQueens(n3); System.out.println("Total Solutions: " + result3.size()); // 92 solutions
    }
    public static List<List<String>> solveQueens(int n){
        List<List<String>> result=new ArrayList<>();
        boolean[] cols=new boolean[n];
        boolean[] diag1=new boolean[2*n-1];
        boolean[] diag2=new boolean[2*n-1];
        int[] queensCol=new int[n];

        
        return result;
    }
    public static void backtrack(int row,int n,int[] queenCol,
        boolean[] cols,boolean[] diag1,boolean[] diag2,List<List<String>> result){

        }
}
