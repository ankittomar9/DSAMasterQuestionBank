package LeetCode150.LeetCode150_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_48_Summary_Ranges {
    public static void main(String[] args) {
        int[] nums={0,1,2,4,5,7};System.out.println("Input: "+Arrays.toString(nums));
        System.out.println("Output : "+summaryRanges(nums));
        
        
        int[] nums2={0,1,2,4,5,7};System.out.println("\nInput: "+Arrays.toString(nums2));
        System.out.println("Output : "+summaryRanges(nums2));
    }
    public static List<String> summaryRanges(int[] nums){
        List<String> result =new ArrayList<>();
        if(nums==null || nums.length==0){return result;}

        int start=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]+1){
                addRange(result,start,nums[i-1]);
                start=nums[i];
            }
        }
        addRange(result,start,nums[nums.length-1]);
        return result;
    }
    public static void addRange(List<String> result,int start,int end){
        if(start==end){
            result.add(String.valueOf(start));
        }else{
            result.add(start+ "->"+end);
        }
    }
}
