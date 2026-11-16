package companyBasedQuesRevision.c1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_2_Prime_Sieve {
    public static void main(String args[]){
        int n=50;
        primeSieveHelper(n);
    }
    public static void primeSieveHelper(int n){
        if(n<2){System.out.println("number less than 2 are not primes"); return;}
        
        boolean isPrime[]=new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0]=isPrime[1]=false;

        for(int p=2;p*p<=n;p++){
            if(isPrime[p]){
                for(int i=p*p;i<=n;i=i+p){
                    isPrime[i]=false;
                }
            }
        }
        List<Integer> isPrimeList=new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                isPrimeList.add(i);
            }
        }
        System.out.println("Prime Numbers between [ "+" 1 ," + n+" ] are \n" +isPrimeList);
    
    
    
    }
}
