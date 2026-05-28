package LeetCode150.LeetCode150_1;

public class Q_45_Happy_Number_1 {
    public static void main(String[] args) {
        int n1=19;        System.out.println("Input : "+n1);
        System.out.println("Output : "+isHappy(n1));
        
        int n2=2;
         System.out.println("Input : "+n2);
         System.out.println("Output : "+isHappy(n2));
    }
    public static boolean isHappy(int n){
       int slow=n;
        int fast=getNext(n);

      while (fast != 1 && slow != fast) {
            slow=getNext(slow);              
            fast=getNext(getNext(fast));    
        }
         return fast == 1;
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
