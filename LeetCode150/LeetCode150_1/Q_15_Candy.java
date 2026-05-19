package LeetCode150.LeetCode150_1;

import java.util.Arrays;

public class Q_15_Candy {
    public static void main(String[] args) {
        int[] ratings = {1, 0, 2};
        // int[] ratings = {1, 2, 2};
        // int[] ratings = {1, 3, 2, 2, 1};

        System.out.println("Ratings : " + Arrays.toString(ratings));
        long minCandies = candy(ratings);
        System.out.println("Minimum Candies : " + minCandies);
    }
    public static long candy(int[] ratings){
        int n=ratings.length;
        if(n==0) return 0;

        int[] candies=new int[n];
        Arrays.fill(candies,1);

        for(int i=1;i<ratings.length;i++){
                if(ratings[i]>ratings[i-1]){
                    candies[i]=candies[i-1]+1;
                }
        }

        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                int moreCandies=candies[i+1]+1;
                    candies[i]=Math.max(candies[i],moreCandies);
            }
        }

        long total=0;
        for(int i=0;i<candies.length;i++){
            total=total+candies[i];
        }
        return total;
    }
}
