package LeetCodeAll.arrays;

public class Q_110_Range_Sum_Query_Mutable {
    public static void main(String[] args) {
           // Test 1: basic
        int[] nums1 = {1, 3, 5};
        NumArray obj1 = new NumArray(nums1);

        System.out.println("nums = [1, 3, 5]");
        System.out.println("sumRange(0, 2) → " + obj1.sumRange(0, 2)); // 9
        obj1.update(1, 2);
        System.out.println("update(1, 2)   → nums = [1, 2, 5]");
        System.out.println("sumRange(0, 2) → " + obj1.sumRange(0, 2)); // 8

        // Test 2: larger array
        System.out.println();
        int[] nums2 = {1, 3, 5, 7, 9, 11};
        NumArray obj2 = new NumArray(nums2);

        System.out.println("nums = [1, 3, 5, 7, 9, 11]");
        System.out.println("sumRange(0, 5) → " + obj2.sumRange(0, 5)); // 36
        System.out.println("sumRange(2, 4) → " + obj2.sumRange(2, 4)); // 21
        obj2.update(3, 0);
        System.out.println("update(3, 0)   → nums = [1, 3, 5, 0, 9, 11]");
        System.out.println("sumRange(0, 5) → " + obj2.sumRange(0, 5)); // 29
        System.out.println("sumRange(2, 4) → " + obj2.sumRange(2, 4)); // 14
    }

    public static  class NumArray{
        private int[] nums;        private int[] bit;        private int n;
        
        public NumArray(int[] nums){
            this.n=nums.length;            this.nums=new int[n];          this.bit=new int[n+1];

            for(int i=0;i<n;i++){
                this.nums[i]=nums[i];
                bitAdd(i+1,nums[i]);
            }
        }

        public void update(int index,int val){
            int delta=val-nums[index];
            nums[index]=val;
            bitAdd(index+1,delta);
        }

         public int sumRange(int left, int right) {
            return prefixSum(right+1) - prefixSum(left);
        }

        public void bitAdd(int index,int delta){
            while(index<=n){
                bit[index]=bit[index]+delta;
                int lowBit=index & -index;
                index=index+lowBit;
            }
        }
        private int prefixSum(int index){
            int sum=0;
            while(index>0){
                sum=sum+bit[index];
                int lowBit=index &-index;
                index-=lowBit;
            }
            return sum;
        }
        
    }
}
