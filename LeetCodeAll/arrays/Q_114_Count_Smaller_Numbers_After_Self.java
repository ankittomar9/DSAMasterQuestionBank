package LeetCodeAll.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_114_Count_Smaller_Numbers_After_Self {
    public static void main(String[] args) {
          // Test 1
        int[] nums1 = {5, 2, 6, 1};
        System.out.println("nums = " + Arrays.toString(nums1));
        System.out.println("Result: " + countSmaller(nums1));

        // Test 2: all same
        System.out.println();
        int[] nums2 = {-1, -1};
        System.out.println("nums = " + Arrays.toString(nums2));
        System.out.println("Result: " + countSmaller(nums2));

        // Test 3: sorted descending
        System.out.println();
        int[] nums3 = {5, 4, 3, 2, 1};
        System.out.println("nums = " + Arrays.toString(nums3));
        System.out.println("Result: " + countSmaller(nums3));
        // Expected: [4, 3, 2, 1, 0]

        // Test 4: sorted ascending
        System.out.println();
        int[] nums4 = {1, 2, 3, 4, 5};
        System.out.println("nums = " + Arrays.toString(nums4));
        System.out.println("Result: " + countSmaller(nums4));
    }
    static int[] counts;
    public static List<Integer> countSmaller(int[] nums){
        int n=nums.length; 
        counts=new int[n];
        
        int[][] items=new int[n][2];
        for(int i=0;i<n;i++){
            items[i][0]=nums[i];
            items[i][1]=i;
        }
        mergeSort(items,0,n-1);
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<counts.length;i++){
            result.add(counts[i]);
        }
        return result;
    }
    private static  void mergeSort( int[][] items,int left,int right){
        if(left>=right){return ;}
        int mid=left+(right-left)/2;
        mergeSort(items,left,mid);
        mergeSort(items,mid+1,right);
        merge(items,left,mid,right);
    } 
    public static void merge(int[][] items,int left,int mid,int right){
        int[][] temp=new int[right-left+1][2];
      
        int i=left;        int j=mid+1;        int k=0;         int rightPlaced=0;

        while(i<=mid && j<=right){
            if(items[j][0]< items[i][0]){
                temp[k++]=items[j++];
                rightPlaced++;
            }else{
                counts[items[i][1]]=counts[items[i][1]]+rightPlaced;
                temp[k++]=items[i++];
            }

            while(j<=right){
                temp[k++]=items[j++];
            }

            for(int t=0;t<temp.length;t++){
                items[left+t]=temp[t];
            }
        }
    }


}



