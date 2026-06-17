package LeetCode150.LeetCode150_1;

public class Q_105_N_Queens_II {
    public static void main(String[] args) {
          System.out.println(totalNQueens(4)); // 2
        System.out.println(totalNQueens(1)); // 1
    }
    public static int totalNQueens(int n){
        boolean[] col=new boolean[n];
        boolean[] diag=new boolean[2*n-1];
        boolean[] antiDiag=new boolean[2*n-1];
        
        return backtrack(0, n, col, diag, antiDiag); 
    }
    private static int backtrack(int row,int n,
        boolean[] col,boolean[] diag,boolean[] antiDiag){
            if(row==n){ return 1;}
        
        int count=0;

        for(int c=0;c<n;c++){
            int d1=row+c; 
            int d2=row-c+n-1;

            if(col[c] || diag[d1] || antiDiag[d2]){
                continue;
            }
            col[c]=true;
            diag[d1]=true;
            antiDiag[d2]=true;
            
            count=count+backtrack(row+1, n, col, diag, antiDiag);

            col[c]=false;
            diag[d1]=false;
            antiDiag[d2]=false;
        }
            return count;
        }

}
