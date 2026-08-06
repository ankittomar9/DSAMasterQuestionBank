package LeetCodeAll.arrays;
import java.util.Arrays;
public class Q_117_Wiggle_Sort_II {
    public static void main(String[] args) {
         int[] nums1 = {1, 5, 1, 1, 6, 4};
        System.out.print("Before: " + Arrays.toString(nums1));
        wiggleSort(nums1);
        System.out.println("\n → After: " + Arrays.toString(nums1));

        int[] nums2 = {1, 3, 2, 2, 3, 1};
        System.out.print("Before: " + Arrays.toString(nums2));
        wiggleSort(nums2);
        System.out.println(" \n→ After: " + Arrays.toString(nums2));

        int[] nums3 = {4, 5, 5, 6};
        System.out.print("Before: " + Arrays.toString(nums3));
        wiggleSort(nums3);
        System.out.println("\n → After: " + Arrays.toString(nums3));

        int[] nums4 = {1, 1, 2, 1, 2, 2, 1};
        System.out.print("Before: " + Arrays.toString(nums4));
        wiggleSort(nums4);
        System.out.println("\n → After: " + Arrays.toString(nums4));
   
    }

  public static void wiggleSort(int[] nums){
    int n=nums.length;int median=findkthSmallest(nums,0,n-1,n/2);
    int left=0; int right=n-1,cur=0;
    while(cur<=right){
        int vi=virtualIndex(cur,n);
        if(nums[vi]>median){
            swap(nums,virtualIndex(left++,n),vi);
            cur++;
        }else if(nums[vi]<median){
              swap(nums,virtualIndex(right--,n),vi);
        }else{
            cur++;
        }
    }
  }
  private static int virtualIndex(int i,int n){
    return (2*i+1) % (n|1);
  }
  private static int findkthSmallest(int[] nums,int lo,int hi,int k){
    while(lo<hi){
        int pivotIndex=partition(nums,lo,hi);
        if(pivotIndex ==k) return nums[k];
        else if(pivotIndex <k) lo=pivotIndex+1;
        else hi=pivotIndex-1;
    }
    return nums[lo];
  }
  private static int partition(int[] nums, int lo,int hi){
    int pivot=nums[hi] , i=lo;
    for(int j=lo;j<hi;j++){
        if(nums[j] <=pivot){
            swap(nums,i++,j);
        }
    }
    swap(nums,i,hi); return i;
  }
  private static void swap(int[] nums,int i,int j){
    int temp=nums[i];
    nums[i]=nums[j];
    nums[j]=temp;
  }


}
