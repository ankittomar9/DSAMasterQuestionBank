package LeetCodeAll.arrays;

import java.util.ArrayList;
import java.util.List;

public class Q_15_Sudoku_Solver {
    public static void main(String[] args) {
          char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println("Input Board:");        printBoard(board);
        solveSudoku(board); System.out.println("\nSolved Board:"); printBoard(board);
    }
     public static void solveSudoku(char[][] board) {
        solve(board);
    }
    public static boolean  solve(char[][] board){
        boolean[][] rows=new boolean[9][9];
        boolean[][] cols=new boolean[9][9];
        boolean[][] boxes=new boolean[9][9];

        List<int[]> emptyCells=new ArrayList<>();

        
    }
 public static boolean isValid(char[][] board, int row, int col, char digit) {
    
 }
}
