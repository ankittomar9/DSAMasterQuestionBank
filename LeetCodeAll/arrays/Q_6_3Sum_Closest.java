package LeetCodeAll.arrays;

import java.util.Arrays;

public class Q_6_3Sum_Closest {
    public static void main(String[] args) {
         int[] nums1 = {-1, 2, 1, -4};
        int target1 = 1;
        System.out.println("nums = " + Arrays.toString(nums1) + ", target = " + target1);
        System.out.println("Closest Sum: " + threeSumClosest(nums1, target1));

    }
    public static int threeSumClosest(int[] nums,int target){
        if(nums==null || nums.length==0){ return 0;}
    
        Arrays.sort(nums);
        int n=nums.length;
        int closestSum=nums[0]+nums[1]+nums[2];

        for(int i=0;i<n-2;i++){
            int leftPtr=i+1;
            int rightPtr=n-1;
        
            
            while(leftPtr<rightPtr){
                int sum=nums[i]+nums[leftPtr]+nums[rightPtr];
            
                if(Math.abs(sum-target) <Math.abs(closestSum-target)){
                    closestSum=sum;
                }

                if(sum==target){
                    return sum;
                }
                else if(sum<target){
                    leftPtr++;
                }else{
                    rightPtr--;
                }
            }
            
        }
            return closestSum;
    }


}
