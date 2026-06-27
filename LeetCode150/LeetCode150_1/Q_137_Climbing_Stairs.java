package LeetCode150.LeetCode150_1;

public class Q_137_Climbing_Stairs {
    public static void main(String[] args) {
        int n1=2; int n2=3;int n3=5;
         System.out.println("Input : "+n1 +"\n Output :"+climbStairs(n1)); // 2
        System.out.println("Input : "+n2 +"\n Output :"+climbStairs(n2)); // 2
         System.out.println("Input : "+n3 +"\n Output :"+climbStairs(n3)); // 2
    }
    public static int climbStairs(int n){
        if(n==1) return 1; if(n==2) return 2;
    
        int prev2=1;int prev1=2;

        for(int i=3;i<=n;i++){
            int current=prev1+prev2;
            prev2=prev1;
            prev1=current;
        }
        return prev1;
    }
}
