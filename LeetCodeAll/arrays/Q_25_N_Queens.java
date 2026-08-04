package LeetCodeAll.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_25_N_Queens {
    public static void main(String[] args) {
          System.out.println("n = 4");
        printSolutions(solveNQueens(4));

        System.out.println("\nn = 1");
        printSolutions(solveNQueens(1));

        System.out.println("\nn = 8");
        System.out.println("Total Solutions: " + solveNQueens(8).size()); // 92
    }
    public static List<List<String>> solveNQueens(int n){
        List<List<String>> result=new ArrayList<>();
        boolean[] cols=new boolean[n];
        boolean[] diag1=new boolean[2*n-1];
        boolean[] diag2=new boolean[2*n-1];
        int[] queens=new int[n];

        backtrack(0, n, queens, cols, diag1, diag2, result);
        return result;
    }
    public static void backtrack(int row,int n,int[] queens,
        boolean[] cols,boolean[] diag1,boolean[] diag2,List<List<String>> result){

            if(row==n){
                result.add(buildBoard(queens,n));
            }
            for(int col=0;col<n;col++){
                int d1=row-col+n-1;
                int d2=row+col;
                if(cols[col] || diag1[d1] || diag2[d2]) continue;

                cols[col]=diag1[d1]=diag2[d2]=true;

                queens[row]=col;
                backtrack(row+1,n,queens,cols,diag1,diag2,result);
                cols[col]=diag1[d1]=diag2[d2]=false;
            }
        }

        public static List<String> buildBoard(int[] queens,int n){
            List<String> board=new ArrayList<>();
            for(int row=0;row<n;row++){
                char[] line=new char[n];
                Arrays.fill(line, '.');
                line[queens[row]]='Q';
                board.add(new String(line));
            }
            return board;
        }
        private static void printSolutions(List<List<String>> solutions){
        for (int s = 0; s < solutions.size(); s++) {
            System.out.println("Solution " + (s + 1) + ":");
            for (String row : solutions.get(s)) {
                System.out.println(row.replace("Q", "Q ").replace(".", ". "));
            }
            System.out.println();
        }
        }
    
    }
