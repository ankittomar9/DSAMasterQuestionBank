package LeetCode150.LeetCode150_1;

public class Q_107_Word_Search {
    public static void main(String[] args) {
         char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word = "ABCCED";
        System.out.println("Input Board:");
        for (char[] row : board) {
            for (char c : row) System.out.print(c + " ");
            System.out.println();
        }
        System.out.println("\nWord: " + word);
        System.out.println("Exists: " + exist(board, word));
    }
    public static boolean exist(char[][] board, String word){
        if(board==null || board.length==0){
            return false;        }

            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    if(board[i][j]==word.charAt(0) && dfs(board, word, i, j, 0))
                        return true;
                    }
            }
            return false;
        }
        private static boolean dfs(char[][] board,String word,int i,int j,int index){
            if(index ==word.length()){ return true;}

            if(i<0 || i>= board.length || j<0 || j>=board[0].length || 
                board[i][j] !=word.charAt(index)){
                    return false;
                }
            char temp=board[i][j];
            board[i][j] ='#';

            boolean found=dfs(board, word, i+1, j, index+1)||
                          dfs(board, word, i-1, j, index+1)||
                          dfs(board, word, i, j+1, index+1)||
                          dfs(board, word, i, j-1, index+1);
        
                board[i][j]=temp;
                return found;
           }
}
