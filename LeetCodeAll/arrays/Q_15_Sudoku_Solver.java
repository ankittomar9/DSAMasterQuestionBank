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
      
        boolean[][] rows=new boolean[9][9];
        boolean[][] cols=new boolean[9][9];
        boolean[][] boxes=new boolean[9][9];
        List<int[]> emptyCells=new ArrayList<>();

        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                if(board[r][c] !='.'){
                    int d=board[r][c]-'1';
                    int box=(r/3)*3+ (c/3);
                    rows[r][d]=cols[c][d]=boxes[box][d]=true;
                }else{
                    emptyCells.add(new int[]{r,c});
                }
            }
        }
    backtrack(board, emptyCells, 0, rows, cols, boxes) ;
    }
      private static boolean backtrack(char[][] board, List<int[]> emptyCells, int index,
                                     boolean[][] rows, boolean[][] cols, boolean[][] boxes) {
            if (index == emptyCells.size()) return true;
                        
            int r=emptyCells.get(index)[0];
            int c=emptyCells.get(index)[1];
            int box=(r/3)*3+ (c/3); 
            
            for(int d=0;d<9;d++){
                if(!rows[r][d] && !cols[c][d] && !boxes[box][d]){
                    board[r][c]=(char)('1'+d);
                    rows[r][d]=cols[c][d]=boxes[box][d]=true;

                    if(backtrack(board, emptyCells, index+1, rows, cols, boxes)){
                        return true;
                    }
                    board[r][c]='.';
                    rows[r][d]=cols[c][d]=boxes[box][d]=false;
                }
            }
            return false;
    }
   private static void printBoard(char[][] board) {
        for (int r = 0; r < 9; r++) {
            if (r == 3 || r == 6) System.out.println("------+-------+------");
            for (int c = 0; c < 9; c++) {
                if (c == 3 || c == 6) System.out.print("| ");
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
    }
}
