package LeetCode150.LeetCode150_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Q_122_IPO {
    public static void main(String[] args) {
         int k = 2;  int w = 0;  int[] profits = {1, 2, 3}; int[] capital = {0, 1, 1};

        System.out.println("k = " + k + ", w = " + w);
        System.out.println("profits = " + Arrays.toString(profits));
        System.out.println("capital = " + Arrays.toString(capital));
        System.out.println("Maximum Capital: " + findMaximizedCapital(k, w, profits, capital));
    }
        public static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
            int n=profits.length;
            int[][] projects=new int[n][2];

            for(int i=0;i<n;i++){
                projects[i][0]=capital[i];
                projects[i][1]=profits[i];
            }
            Arrays.sort(projects,(a,b)->a[0]-b[0]);
            PriorityQueue<Integer> profitHeap=new PriorityQueue<>(Collections.reverseOrder());
            int i=0;
            
            for(int j=0;j<k;j++){
                while(i<n&& projects[i][0] <=w){
                    profitHeap.offer(projects[i][1]);
                    i++;
                }
                if(profitHeap.isEmpty()){ break;}
                w=w+profitHeap.poll();
            }
            return w;

        }
}
