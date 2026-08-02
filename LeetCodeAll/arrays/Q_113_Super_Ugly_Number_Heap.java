package LeetCodeAll.arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Q_113_Super_Ugly_Number_Heap {
    public static void main(String[] args) {
            int[] primes1 = {2, 7, 13, 19};
        System.out.println("n=12, primes=" + Arrays.toString(primes1));
        System.out.println("Result: " + nthSuperUglyNumber(12, primes1));
    }
    public static int nthSuperUglyNumber(int n,int[] primes){
        long[] ugly=new long[n];
        ugly[0]=1;

        PriorityQueue<long[]> heap=new PriorityQueue<>((a,b) -> Long.compare(a[0], b[0]));

        for(int j=0;j<primes.length;j++){
            heap.offer(new long[]{primes[j],j,0});
        }

        for(int i=1;i<n;i++){
            ugly[i]=heap.peek()[0];
            while(!heap.isEmpty() && heap.peek()[0] ==ugly[i]){
                long[] top=heap.poll();
                int primeIndex=(int)top[1];
                int uglyIndex=(int)top[2]+1;
                heap.offer(new long[]{ugly[uglyIndex] * primes[primeIndex], primeIndex, uglyIndex});
            }
            
        }
        return (int) ugly[n-1];
    }

}
