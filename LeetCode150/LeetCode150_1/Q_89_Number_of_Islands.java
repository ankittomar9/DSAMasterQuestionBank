package LeetCode150.LeetCode150_1;
public class Q_89_Number_of_Islands {
    public static void main(String[] args) {
           char[][] grid = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        };
         System.out.println("Input Grid:");
        printGrid(grid);
        System.out.println("\nNumber of Islands: " + numIslands(grid));
         System.out.println("\nNumber of Islands After Sunken: " );
          printGrid(grid);
    }
    public static int numIslands(char[][] grid){
        if(grid ==null || grid.length==0){return 0;}
        int count=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }
    public static void dfs(char[][] grid,int i,int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]=='0'){
            return ;
        }
        grid[i][j]='0';

        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
    public static void printGrid(char[][] grid){
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[0].length;col++){
                System.out.print(grid[row][col]+ " ");
            }
            System.out.println();
        }
    }
}
