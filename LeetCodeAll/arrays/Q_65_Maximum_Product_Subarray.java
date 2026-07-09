package LeetCodeAll.arrays;

import java.util.Arrays;

public class Q_65_Maximum_Product_Subarray {
    public static void main(String[] args) {
         // Test 1
        int[] nums1 = {2, 3, -2, 4};        System.out.println("nums = " + Arrays.toString(nums1));
        System.out.println("Max Product: " + maxProduct(nums1));
        // Test 2: zero in array
        System.out.println();        int[] nums2 = {-2, 0, -1};        System.out.println("nums = " + Arrays.toString(nums2));
        System.out.println("Max Product: " + maxProduct(nums2));

        // Test 3: two negatives flip min→max
        System.out.println();        int[] nums3 = {-2, 3, -4};
                System.out.println("nums = " + Arrays.toString(nums3));
        System.out.println("Max Product: " + maxProduct(nums3));
    }
    public static int maxProduct(int[] nums){
        int maxProduct=nums[0];int minProduct=nums[0]; int result=nums[0];

        for(int i=1;i<nums.length;i++){
            int current=nums[i];
            int prevMax=maxProduct;
            int prevMin=minProduct;
            
            int option1=current;
            int option2=prevMax*current;
            int option3=prevMin*current;

            maxProduct=Math.max(option1, Math.max(option2, option3));
             minProduct=Math.min(option1, Math.min(option2, option3));

              result = Math.max(result, maxProduct);
        }
        return result;
    }
}
