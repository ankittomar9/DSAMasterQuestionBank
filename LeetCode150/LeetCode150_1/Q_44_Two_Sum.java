package LeetCode150.LeetCode150_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q_44_Two_Sum {
    public static void main(String[] args) {
         int[] nums1 = {2, 7, 11, 15};        int target1 = 9;
         System.out.println("Input  : " + Arrays.toString(nums1));
        System.out.println("Target : " + target1);
        System.out.println("Output : " + Arrays.toString(twoSum(nums1, target1)));

        int[] nums2 = {3, 2, 4};        int target2 = 6;
          System.out.println("\nInput  : " + Arrays.toString(nums2));
        System.out.println("Target : " + target2);
        System.out.println("Output : " + Arrays.toString(twoSum(nums2, target2)));
    }
    public static int[] twoSum(int[]nums ,int target){
        if(nums==null || nums.length<2){
            return new int[]{-1,-1};
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement =target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i], i);
        }
            return new int[]{-1,-1};
    }
}
