package LeetCode150.LeetCode150_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q_46_Contains_Duplicate_II {
    public static void main(String[] args) {
          int[] nums1={1,2,3,1}; int k1=3; System.out.println("Input  : "+Arrays.toString(nums1));
        System.out.println("k      : " + k1);
        System.out.println("Output : " + containsNearbyDuplicate(nums1, k1));

        int[] nums2={1,0,1,1}; int k2=1;  System.out.println("\nInput  : "+Arrays.toString(nums2));
        System.out.println("k      : " + k2);
        System.out.println("Output : " + containsNearbyDuplicate(nums2, k2));
    
      int[] nums3 = {1,2,3,1,2,3}; int k3=2; System.out.println("\nInput  : "+Arrays.toString(nums3));
        System.out.println("k      : " + k3);
        System.out.println("Output : " + containsNearbyDuplicate(nums3, k3));
    }
    public static boolean containsNearbyDuplicate(int[]  nums,int k){
        if(nums==null || nums.length<=1 || k ==0){
            return false;
        }
        Set<Integer> set =new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            if(set.size()>k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}
