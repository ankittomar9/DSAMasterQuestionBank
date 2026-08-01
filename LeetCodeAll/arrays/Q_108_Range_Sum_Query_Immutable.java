package LeetCodeAll.arrays;

public class Q_108_Range_Sum_Query_Immutable {
    public static void main(String[] args) {
         int[] nums1 = {-2, 0, 3, -5, 2, -1};
        NumArray obj1 = new NumArray(nums1);

        System.out.println("nums = [-2, 0, 3, -5, 2, -1]");
        System.out.println("sumRange(0, 2) → " + obj1.sumRange(0, 2));  // 1
        System.out.println("sumRange(2, 5) → " + obj1.sumRange(2, 5));  // -1
        System.out.println("sumRange(0, 5) → " + obj1.sumRange(0, 5));  // -3
    }

    public static class NumArray{
        private int[] prefix;

        public NumArray(int[] nums){
            int n=nums.length;

            prefix=new int[n+1];
            prefix[0]=0;

            for(int i=1;i<=n;i++){
                prefix[i]=prefix[i-1]+nums[i-1];
            }
        }
        public int sumRange(int left,int right){
            return prefix[right+1]-prefix[left];
        }
    }
}
