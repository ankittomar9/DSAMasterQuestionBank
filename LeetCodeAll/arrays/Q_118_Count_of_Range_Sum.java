package LeetCodeAll.arrays;
import java.util.Arrays;
public class Q_118_Count_of_Range_Sum {
    public static void main(String[] args) {
          int[] nums1 = {-2, 5, -1};
        System.out.println("nums = " + Arrays.toString(nums1) + ", lower=-2, upper=2");
        System.out.println("Result: " + countRangeSum(nums1, -2, 2)); // 3

        int[] nums2 = {0};
        System.out.println("\nnums = " + Arrays.toString(nums2) + ", lower=0, upper=0");
        System.out.println("Result: " + countRangeSum(nums2, 0, 0)); // 1

        int[] nums3 = {0, 0};
        System.out.println("\nnums = " + Arrays.toString(nums3) + ", lower=0, upper=0");
        System.out.println("Result: " + countRangeSum(nums3, 0, 0)); // 3

        int[] nums4 = {-1, 1};
        System.out.println("\nnums = " + Arrays.toString(nums4) + ", lower=-1, upper=0");
        System.out.println("Result: " + countRangeSum(nums4, -1, 0)); // 1

        int[] nums5 = {Integer.MIN_VALUE, Integer.MAX_VALUE};
        System.out.println("\nnums = [MIN_VALUE, MAX_VALUE], lower=-1, upper=0");
        System.out.println("Result: " + countRangeSum(nums5, -1, 0)); // 1
    }

       static int lower, upper;

       public static int countRangeSum(int[] nums,int lower,int upper){
        lower=lower; upper=upper;
        long[] prefix=new long[nums.length+1];
        for(int i=0;i<nums.length;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
        return mergeSort(prefix,0,nums.length);
       }
       private static int mergeSort(long[] prefix,int left,int right){
        if(left>=right){return 0;}
        int mid=left+(right-left)/2;
        
        int count=mergeSort(prefix,left,mid)+ mergeSort(prefix,mid+1,right);
        
        int lo=mid+1;int hi=mid+1;
        for(int i=left;i<=mid;i++){
            while(lo<=right && prefix[lo] <prefix[i]+ lower) lo++;
            while(hi<=right && prefix[hi] <=prefix[i]+ upper) hi++;
            count=count+hi-lo;
        }
        merge(prefix,left,mid,right);
        return count;
    }
    private static void merge(long[] prefix,int left,int mid,int right){
        long[] temp=new long[right-left+1];
        int i=left,j=mid+1,k=0;

        while(i<=mid && j<=right){
            if(prefix[i] <=prefix[j]) temp[k++]=prefix[i++];
            else temp[k++]=prefix[j++];
        }
        while(i<=mid) temp[k++]=prefix[i++];
        while(j<=right) temp[k++]=prefix[j++];
        System.arraycopy(temp, 0, prefix, left, temp.length);
    }    
}
