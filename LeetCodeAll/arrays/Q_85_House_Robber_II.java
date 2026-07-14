package LeetCodeAll.arrays;

import java.util.Arrays;

public class Q_85_House_Robber_II {
    public static void main(String[] args) {
          // Test 1
        int[] nums1 = {2, 3, 2};
        System.out.println("nums = " + Arrays.toString(nums1));
        System.out.println("Max Robbery: " + rob(nums1));

        // Test 2
        System.out.println();
        int[] nums2 = {1, 2, 3, 1};
        System.out.println("nums = " + Arrays.toString(nums2));
        System.out.println("Max Robbery: " + rob(nums2));

        // Test 3
        System.out.println();
        int[] nums3 = {1, 2, 3};
        System.out.println("nums = " + Arrays.toString(nums3));
        System.out.println("Max Robbery: " + rob(nums3));
    }
    public static int rob(int[] nums){
        int n=nums.length; 
        if(n==1){return nums[0];}
        if(n==2){return Math.max(nums[0], nums[1]);}

        int caseA=robLinear(nums,0,n-2);
        int caseB=robLinear(nums,1,n-1);
        return Math.max(caseA, caseB);
    }

    public static int robLinear(int[] nums,int start,int end){
        int prev2=0;
        int prev1=0;

        for(int i=start;i<=end;i++){
            int curr=Math.max(prev1, prev2+nums[i]);

            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }

}
