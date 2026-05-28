package LeetCode150.LeetCode150_1;

import java.util.HashSet;
import java.util.Set;

public class Q_45_Happy_Number {
    public static void main(String[] args) {
        int n1=19;        System.out.println("Input : "+n1);
        System.out.println("Output : "+isHappy(n1));
        
        int n2=2;
         System.out.println("Input : "+n2);
         System.out.println("Output : "+isHappy(n2));
    }
    public static boolean isHappy(int n){
        Set<Integer> seen=new HashSet<>();

        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            n=getNext(n);
        }
        return n==1;
    }
    private static int getNext(int n){
        int sum=0;
        while(n>0){
            int extract=n%10;
            sum=sum+extract*extract;
            n=n/10;
        }
        return sum;
    }

}
