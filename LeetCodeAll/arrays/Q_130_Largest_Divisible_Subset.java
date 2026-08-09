package LeetCodeAll.arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Q_130_Largest_Divisible_Subset {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        System.out.println("nums=" + Arrays.toString(nums1));
        System.out.println("Result: " + largestDivisibleSubset(nums1));
        // [1, 2] or [1, 3]

        // Test 2: perfect chain
        System.out.println();
        int[] nums2 = {1, 2, 4, 8};
        System.out.println("nums=" + Arrays.toString(nums2));
        System.out.println("Result: " + largestDivisibleSubset(nums2));
        // [1, 2, 4, 8]

        // Test 3: multiple valid chains
        System.out.println();
        int[] nums3 = {1, 2, 3, 4, 6, 12};
        System.out.println("nums=" + Arrays.toString(nums3));
        System.out.println("Result: " + largestDivisibleSubset(nums3));
        // [1, 2, 4, 12] or [1, 2, 6, 12] or [1, 3, 6, 12] — all length 4

        // Test 4: single element
        System.out.println();
        int[] nums4 = {7};
        System.out.println("nums=" + Arrays.toString(nums4));
        System.out.println("Result: " + largestDivisibleSubset(nums4));
        // [7]

        // Test 5: all primes (no element divides another)
        System.out.println();
        int[] nums5 = {2, 3, 5, 7};
        System.out.println("nums=" + Arrays.toString(nums5));
        System.out.println("Result: " + largestDivisibleSubset(nums5)); 
    }

    public static List<Integer> largestDivisibleSubset(int[] nums){
        Arrays.sort(nums); int n=nums.length;

        int[] dp=new int[n]; int[] parent=new int[n];
        Arrays.fill(dp, 1); Arrays.fill(parent, -1);
        int maxLen=1, maxIndex=0;
            for(int i=1;i<n;i++){
                for(int j=1;j<i;j++){
                    if(nums[i] % nums[j] ==0 && dp[j] +1 >dp[i]){
                        dp[i]=dp[j]+1;
                        parent[i]=j;
                    }
                }
                if(dp[i] >maxLen){
                    maxLen=dp[i];
                    maxIndex=i;
                }
            }
            List<Integer> result=new ArrayList<>();
            for(int index=maxIndex; index!=-1;index=parent[index]){
                result.add(nums[index]);
            }
            Collections.reverse(result);
            return result;
    }
}
