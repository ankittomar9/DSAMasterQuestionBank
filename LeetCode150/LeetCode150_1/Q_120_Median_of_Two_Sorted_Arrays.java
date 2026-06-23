package LeetCode150.LeetCode150_1;

public class Q_120_Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
         int[] nums1 = {1, 3};        int[] nums2 = {2};
        System.out.println("nums1 = [1, 3], nums2 = [2]");
        System.out.println("Median = " + findMedianSortedArrays(nums1, nums2));

        int[] nums3 = {1, 2};        int[] nums4 = {3, 4};
        System.out.println("\nnums1 = [1, 2], nums2 = [3, 4]");
        System.out.println("Median = " + findMedianSortedArrays(nums3, nums4));
    }
    public static double findMedianSortedArrays(int[] nums1,int[] nums2){
        if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }
        int m=nums1.length;int n=nums2.length;
        int left=0;int right=m;

        while(left<=right){
            int cut1=(left+right)/2;
            int cut2=(m+n+1)/2 -cut1;

            int left1;
            if(cut1==0){left1=Integer.MIN_VALUE;}else{left1=nums1[cut1-1];}

            int right1;
              if(cut1==m){right1=Integer.MAX_VALUE;}else{right1=nums1[cut1];}

            int left2;
               if(cut2==0){left2=Integer.MIN_VALUE;}else{left2=nums2[cut2-1];}

                  int right2;
              if(cut2==n){right2=Integer.MAX_VALUE;}else{right2=nums2[cut2];}

              if(left1 <=right2 && left2 <=right1){
                if((m+n)%2==0){
                    double result=(Math.max(left1, left2)+ Math.min(right1,right2))/2.0;
                    return  result;
                }else{
                    return Math.max(left1, left2);
                }
              }else if(left1>right2){
                right=cut1-1;
              }else{
                left=cut1+1;
              }
        }
        throw new IllegalArgumentException("Input Array not Sorted");

    }
}


