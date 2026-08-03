package LeetCodeAll.arrays;

import java.util.Arrays;

public class Q_113_Super_Ugly_Number_Heap_1 {
     public static void main(String[] args) {
           // Test 1
        int[] primes1 = {2, 7, 13, 19};
        System.out.println("n=12, primes=" + Arrays.toString(primes1));
        System.out.println("Result: " + nthSuperUglyNumber(12, primes1));

        // Test 2: classic ugly numbers
        System.out.println();
        int[] primes2 = {2, 3, 5};
        System.out.println("n=10, primes=" + Arrays.toString(primes2));
        System.out.println("Result: " + nthSuperUglyNumber(10, primes2));
        // Ugly sequence: 1,2,3,4,5,6,8,9,10,12 → 12
    }
    public static int nthSuperUglyNumber(int n,int[] primes){
      int k=primes.length;
        long[] ugly=new long[n];
        ugly[0]=1;

       int[] index=new int[k];
        for(int i=1;i<n;i++){
            long minVal=Long.MAX_VALUE;
            for(int j=0;j<k;j++){
            long candidate =ugly[index[j]] * primes[j];
                minVal=Math.min(minVal,candidate);    
            }
            ugly[i]=minVal;
        
            for(int j=0;j<k;j++){
                if (ugly[index[j]] * primes[j] == minVal) {
                    index[j]++;
            }
        }
    }
        return (int) ugly[n-1];
    }
}
