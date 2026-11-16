package companyBasedQuesRevision.c;

public class Q_3_ArmsStrongNumber {
    public static void main(String args[]){
        int n1=153;        armstrongHelper(n1);
        int n2=1634;        armstrongHelper(n2); // this is giving false case number is armstrong
        
        int n3=1234;        armstrongHelper(n3);
    }
    public static void armstrongHelper(int n){
        if(n<0){ System.out.println("Number is not armstrong");return ;}
        
        if(n==0){System.out.println("Number is not armstrong") ; return;}
        
        int originalNumber=n;
        int countOfDigits=countDigits(n);
        double sum=0;
        while(n>0){
            int lastDigit=n%10;
            sum=sum+Math.pow(lastDigit, countOfDigits);
            n=n/10;
        }
        if(sum==originalNumber){
        System.out.println("Number is Armstrong ");
        }else{
            System.out.println("Number is  not Armstrong ");
        }
    }
    public static int countDigits(int n){{
        if(n==0){return 1;}
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }}
}
