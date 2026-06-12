package LeetCode150.LeetCode150_1;

import java.util.LinkedList;
import java.util.Queue;

public class Q_95_Snakes_and_Ladders {
    public static void main(String[] args) {
        int[][] board = {
            {-1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1},
            {-1, 35, -1, -1, 13, -1},
            {-1, -1, -1, -1, -1, -1},
            {-1, 15, -1, -1, -1, -1}
        };

        System.out.println("Minimum Moves: " + snakesAndLadders(board));
    }
    public static int snakesAndLadders(int[][] board){
        int n=board.length;
        int[] flattened=new int[n*n+1];
        boolean leftToRight=true;int index=1;
        for(int i=n-1;i>=0;i--){
            if(leftToRight){
                for(int j=0;j<n;j++){
                    flattened[index++]=board[i][j];
                }
            }else{
                for(int j=n-1;j>=0;j--){
                    flattened[index++]=board[i][j];
                }
            }
            leftToRight=!leftToRight;
        }
        Queue<Integer>queue=new LinkedList<>();
        boolean[] visited=new boolean[n*n+1];
        queue.offer(1);
        visited[1]=true; int moves=0;

        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                int curr=queue.poll();
                if(curr==n*n) return moves;

                for(int next=curr+1;next<=Math.min(curr+6, n*n); next++){
                    int dest=(flattened[next]==-1) ? next:flattened[next];
                    if(!visited[dest]){
                        visited[dest]=true;
                        queue.offer(dest);
                    }
                }
            }
            moves++;
        }
        return -1;
    }
}
