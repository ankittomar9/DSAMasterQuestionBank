package LeetCode150.LeetCode150_1;

public class Q_133_Factorial_Trailing_Zeroes {
    public static void main(String[] args) {
        int n1=5;int n2=25;int n3=0;

        System.out.println("Input :"+n1+ " \n Output:" +trailingZeroes(5));   // 1
        System.out.println("Input :"+n2+ " \n Output:" +trailingZeroes(25)); // 6
       System.out.println("Input :"+n3+ " \n Output:" +trailingZeroes(0));  // 0
    }
    public static int trailingZeroes(int n){
        int count=0;
        while(n>=5){
            n=n/5;
            count=count+n;
        }
        return count;
    }
}
