package LeetCode150.LeetCode150_1;

public class Q_38_Game_of_Life {
    public static void main(String[] args) {
          int[][] board={{0,1,0},{0,0,1},{1,1,1}};
           System.out.println("Input Board:");        printBoard(board);
        gameOfLife(board);
        System.out.println("\nAfter Game of Life:");
        printBoard(board);
    }
        public static void gameOfLife(int[][] board){
            if(board==null || board.length==0){return ;}
            int m=board.length;            int n=board[0].length;

            for(int i=0;i<m;i++){
                for(int j=0; j<n;j++){
                    int live=countLiveNeighbours(board,i,j);
                    if(board[i][j]==1){
                        if(live <2 || live>3){  board[i][j]=3;      }
                        } else{ if(live==3)  { board[i][j]=2;   }    }
                }
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(board[i][j]==2) { board[i][j]=1;}
                    else if(board[i][j]==3){ board[i][j]=0;}
                }
            } 
        } 
        public static int countLiveNeighbours(int[][] board ,int r ,int c){
              int m=board.length; int n=board[0].length;int live=0;
            for(int i=-1;i<=1;i++){
                for(int j=-1;j<=1;j++){
                    if(i==0 && j==0) continue;
                    int nr=r+i;
                    int nc=c+j;
                    if( nr>=0 && nr< m && nc>=0 && nc<n){
                        if(board[nr][nc]==1 || board[nr][nc]==3){ live++;} 
                    }
                }
            }
            return live;
        }
         public static void printBoard(int[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
