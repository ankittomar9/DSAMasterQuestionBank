package LeetCodeAll.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_94_Majority_Element_II {
    public static void main(String[] args) {
       int[] nums1 = {3, 2, 3};        System.out.println("nums = " + Arrays.toString(nums1));
        System.out.println("Majority Elements: " + majorityElement(nums1));
        // Test 2: single element
        System.out.println();   int[] nums2 = {1}; System.out.println("nums = " + Arrays.toString(nums2));
        System.out.println("Majority Elements: " + majorityElement(nums2));
        // Test 3: two majorities
        System.out.println();        int[] nums3 = {1, 1, 1, 3, 3, 2, 2, 2};
        System.out.println("nums = " + Arrays.toString(nums3));
        System.out.println("Majority Elements: " + majorityElement(nums3));
 
    }
    public static List<Integer> majorityElement(int[] nums){
        int n=nums.length;        int cand1=0,count1=0;         int cand2=0,count2=0;

        for(int i=0;i<nums.length;i++){
            if(count1>0 && nums[i] ==cand1){
                count1++;
            }else if(count2>0 && nums[i]==cand2){
                count2++;
            }else if(count1==0){
                cand1=nums[i];
                count1=1;
            }else if(count2==0){
                cand2=nums[i];
                count2=1;
            }else{
                count1--;
                count2--;
            }
        }

        count1=0; count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==cand1){
                count1++;
            }else if(nums[i]==cand2){
                count2++;
            }
        }
        List<Integer> result=new ArrayList<>();
        int threshold=n/3;
        if(count1>threshold){result.add(cand1);}
        if(count2>threshold){result.add(cand2);}
        return result;
    }
}
