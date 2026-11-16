package companyBasedQuesRevision.c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_2_Prime_Sieve {
    public static void main(String args[]){
        int n=50;
        // Goal is to print prime numbers from 1 to 50
        sieveOfEras(n);

    }
    public static void sieveOfEras(int n){
        if(n<2){
            System.out.println(" NO primes Numbers are upto " +n); return;
        }

        boolean[] isPrime=new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=isPrime[1]=false;

        for(int p=2;p*p<=n;p++){
            if(isPrime[p]){
                for(int i=p*p;i<=n;i=i+p){
                    isPrime[i]=false;
                }
            }
        }
        List<Integer> primes=new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                primes.add(i);
            }
          
        }
          System.out.println("Primes upto to "+n+ " : \n"+primes);
    }
}
