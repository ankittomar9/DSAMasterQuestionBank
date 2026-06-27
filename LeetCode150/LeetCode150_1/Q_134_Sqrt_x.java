package LeetCode150.LeetCode150_1;

public class Q_134_Sqrt_x {
    public static void main(String[] args) {
        int n1=8; int n2=4;int n3=0;int n4=2147395599;
               System.out.println("Input :"+n1+ " \n Output:"+mySqrt(8));   // 2
        System.out.println("Input :"+n2+ " \n Output:"+mySqrt(4));   // 2
        System.out.println("Input :"+n3+ " \n Output:"+mySqrt(0));   // 0
        System.out.println("Input :"+n4+ " \n Output:"+mySqrt(2147395599)); // 46339
    }
    public static int mySqrt(int x){
        if(x==0 || x==1){return x;}

        long left=1; long right=x;

        while(left<=right){
            long mid=left+(right-left)/2;
            long square=mid*mid;

            if(square ==x){
                return (int)mid;
            }
            else if(square<x){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return (int) right;
    }
}
