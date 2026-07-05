package LeetCodeAll.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_7_4Sum {
    public static void main(String[] args) {
         int[] nums1 = {1, 0, -1, 0, -2, 2};
        int target1 = 0;
        System.out.println("nums = " + Arrays.toString(nums1) + ", target = " + target1);
        System.out.println("Output: " + fourSum(nums1, target1));
    }
    public static List<List<Integer>> fourSum(int[] nums,int target){
        List<List<Integer>> result=new ArrayList<>();
        if(nums==null || nums.length<4){return result;}
    
        Arrays.sort(nums);
        int n=nums.length;

        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;}
                  
                for(int j=i+1;j<n-2;j++){
                     int leftPtr=j+1;
                    int rightPtr=n-1;
                 while(leftPtr<rightPtr){
                    long sum=(long)nums[i]+nums[j]+nums[leftPtr]+nums[rightPtr];

                    if(sum==target){
                        result.add(Arrays.asList(nums[i],nums[j],nums[leftPtr],nums[rightPtr]));
                    
                    while(leftPtr<rightPtr &&nums[rightPtr]==nums[leftPtr+1]) {
                        leftPtr++; }
                 
                        
                    while(leftPtr<rightPtr &&nums[rightPtr]==nums[leftPtr-1]) {
                        leftPtr--; 
                    }
                            leftPtr++;
                            rightPtr--;
                    else if(sum<target){
                        leftPtr++;
                    }
                    else{
                        rightPtr--;
                    }
                    
                }
            }
    }
     return result;
} 
}
