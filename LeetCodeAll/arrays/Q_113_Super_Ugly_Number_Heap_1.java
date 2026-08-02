package LeetCodeAll.arrays;

import java.util.Arrays;

public class Q_113_Super_Ugly_Number_Heap_1 {
     public static void main(String[] args) {
            int[] primes1 = {2, 7, 13, 19};
        System.out.println("n=12, primes=" + Arrays.toString(primes1));
        System.out.println("Result: " + nthSuperUglyNumber(12, primes1));
    }
    public static int nthSuperUglyNumber(int n,int[] primes){
      int k=primes.length;
        long[] ugly=new long[n];
        ugly[0]=1;

       int[] index=new int[k];
        for(int i=1;i<n;i++){
            long minVal=Long.MAX_VALUE;
            for(int j=0;j<k;j++){
            long candidate =ugly[index[j]];
                minVal=Math.min(minVal,candidate);    
            }
            ugly[i]=minVal;
        
            for(int j=0;j<k;j++){
                if (ugly[idx[j]] * primes[j] == minVal) {
                    idx[j]++;
            }
        }
       

      
        return (int) ugly[n-1];
    }
}
