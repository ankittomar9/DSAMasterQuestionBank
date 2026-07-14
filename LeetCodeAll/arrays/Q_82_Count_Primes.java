package LeetCodeAll.arrays;

import java.util.Arrays;

public class Q_82_Count_Primes {
    public static void main(String[] args) {
         System.out.println("n = 10  → Prime Count: " + countPrimes(10));

        // Test 2
        System.out.println("n = 20  → Prime Count: " + countPrimes(20));

        // Test 3: edge cases
        System.out.println("n = 0   → Prime Count: " + countPrimes(0));
        System.out.println("n = 1   → Prime Count: " + countPrimes(1));
        System.out.println("n = 2   → Prime Count: " + countPrimes(2));

        // Test 4: larger value
        System.out.println("n = 100 → Prime Count: " + countPrimes(100));
        // Primes < 100: 2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97 → 25
    }
    public static int countPrimes(int n){
        if(n<=2){return 0;}
        boolean[] isPrime=new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0]=false;
        isPrime[1]=false;

        for(int i=2;(long)i*i<n;i++){
            if(isPrime[i]){

                for(int j=i*i;j<n;j=j+i){
                    isPrime[j]=false;
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(isPrime[i]){
                count++;
            }
            
        }
        return count;
    }
}
