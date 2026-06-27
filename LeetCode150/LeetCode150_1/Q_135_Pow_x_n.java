package LeetCode150.LeetCode150_1;

public class Q_135_Pow_x_n {
    public static void main(String[] args) {
            double n1=2.00000; int x1=10 ;
         System.out.println("Input  N: "+n1+ "  &  X: "+x1+ " \n Output:"+myPow(n1, x1));   // 1024.0
           
               double n2=2.10000; int x2= 3 ;
         System.out.println("Input  N: "+n2+ "  &  X: "+x2+ " \n Output:"+myPow(n2, x2)); 

               double n3=2.00000; int x3=-2 ;
         System.out.println("Input  N: "+n3+ "  &  X: "+x3+ " \n Output:"+myPow(n3, x3)); 
            
    
    }
    public static double myPow(double x,int n){
        long N=n;
        if(N<0){
            x=1/x;
            N=-N;
        }

        double result=1.0;
        while(N>0){
            if(N%2==1){
                result=result*x;
            }
            x=x*x;
            N=N/2;
        }
        return result;
    }
}
