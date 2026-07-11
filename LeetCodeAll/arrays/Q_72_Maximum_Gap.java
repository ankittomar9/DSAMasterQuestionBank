package LeetCodeAll.arrays;

import java.util.Arrays;

public class Q_72_Maximum_Gap {
    public static void main(String[] args) {
        int[] nums1 = {3, 6, 9, 1};        System.out.println("nums = " + Arrays.toString(nums1));
        System.out.println("Maximum Gap: " + maximumGap(nums1));
         System.out.println();        int[] nums3 = {1, 1, 1, 1};        System.out.println("nums = " + Arrays.toString(nums3));
        System.out.println("Maximum Gap: " + maximumGap(nums3));        System.out.println();
        int[] nums5 = {100, 3, 2, 1, 4, 5, 6, 7};        System.out.println("nums = " + Arrays.toString(nums5));
        System.out.println("Maximum Gap: " + maximumGap(nums5));
    }
    public static int maximumGap(int[] nums){
        int n=nums.length;        if(n<2){return 0;}
        int globalMin=nums[0],globalMax=nums[0];
        for(int i=0;i<nums.length;i++){ globalMin=Math.min(globalMin, nums[i]); globalMax=Math.max(globalMax,nums[i]);
                }
                if(globalMin==globalMax) return 0;
                int newMax=(globalMax-globalMin)/(n-1);
                int bucketSize=Math.max(1, newMax);
    
           int numBuckets=(globalMax-globalMin)/bucketSize+1;
           
           int[] bucketMin=new int[numBuckets];           int[] bucketMax=new int[numBuckets];
           Arrays.fill(bucketMax, Integer.MIN_VALUE); Arrays.fill(bucketMin, Integer.MAX_VALUE);

           for(int i=0;i<nums.length;i++){
            int bucketIdx=(nums[i]-globalMin)/bucketSize;
             bucketMin[bucketIdx]=Math.min(bucketMin[bucketIdx], nums[i]);
            bucketMax[bucketIdx]=Math.max(bucketMax[bucketIdx], nums[i]);
           }

           int maxGap=0; int prevMax=globalMin;

           for(int i=0;i<numBuckets;i++){
            if(bucketMin[i] ==Integer.MAX_VALUE) continue;
            maxGap=Math.max(maxGap, bucketMin[i]-prevMax);
            prevMax=bucketMax[i];
           }
           return maxGap;
    }
}
