package LeetCode150.LeetCode150_1;

public class Q_34_Valid_Sudoku {
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

        System.out.println("Is Valid Sudoku : " + isValidSudoku(board));    
    }
    public static boolean isValidSudoku(char[][] board){
        boolean[][] rows=new boolean[9][9];
        boolean[][] columns=new boolean[9][9];
        boolean[][] boxes=new boolean[9][9];

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                  int num=board[i][j]-'1';
            }
          



        }


    }
}
