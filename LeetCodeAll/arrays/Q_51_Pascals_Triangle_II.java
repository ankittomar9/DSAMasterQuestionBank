package LeetCodeAll.arrays;

import java.util.ArrayList;
import java.util.List;

public class Q_51_Pascals_Triangle_II {
    public static void main(String[] args) {
           System.out.println("rowIndex = 0 → " + getRow(0));
        // Test 2
        System.out.println("rowIndex = 3 → " + getRow(3));
        // Test 3
        System.out.println("rowIndex = 4 → " + getRow(4));
        // Test 4: max constraint
        System.out.println("rowIndex = 33 → " + getRow(33).size() + " elements");
    }

    public static List<Integer> getRow(int rowIndex){
        int[] dp=new int[rowIndex+1];
        dp[0]=1;
    
        for(int row=1;row<=rowIndex;row++){
            for(int j=row;j>=1;j--){
                dp[j]= dp[j]+dp[j-1];
            }

        }
        List<Integer> result =new ArrayList<>();
        for(int val=0;val<dp.length;val++){
            result.add(dp[val]);
        }
        return result;
    }
}
