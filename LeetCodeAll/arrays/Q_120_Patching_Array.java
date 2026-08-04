package LeetCodeAll.arrays;

import java.util.Arrays;

public class Q_120_Patching_Array {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        System.out.println("nums=" + Arrays.toString(nums1) + ", n=6");
        System.out.println("Patches: " + minPatches(nums1, 6)); // 1

        // Test 2
        System.out.println();
        int[] nums2 = {1, 5, 10};
        System.out.println("nums=" + Arrays.toString(nums2) + ", n=20");
        System.out.println("Patches: " + minPatches(nums2, 20)); // 2

        // Test 3: already complete
        System.out.println();
        int[] nums3 = {1, 2, 2};
        System.out.println("nums=" + Arrays.toString(nums3) + ", n=5");
        System.out.println("Patches: " + minPatches(nums3, 5)); // 0

        // Test 4: empty array
        System.out.println();
        int[] nums4 = {};
        System.out.println("nums=[], n=7");
        System.out.println("Patches: " + minPatches(nums4, 7)); // 3 (add 1,2,4) 
    }
    public static int minPatches(int[] nums,int n){
        long miss=1; int patches=0;
        int i=0;
        while(miss<=n){
            if(i<nums.length && nums[i]<=miss){
                miss=miss+nums[i];
                i++;
            }else{
                miss=miss+miss;
            patches++;
            }
        }
        return patches;
    }
}
