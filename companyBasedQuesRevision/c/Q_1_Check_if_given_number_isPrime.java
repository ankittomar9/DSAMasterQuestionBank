package companyBasedQuesRevision.c;

public class Q_1_Check_if_given_number_isPrime {
    public static void main(String args[]){
       int n1=19;
       int n2=8;
        
       isPrimeHelper(n1);
       
       System.out.println(" Is Number is  Prime "+isPrimeHelper(n1));
       System.out.println("Is Number is  Prime "+isPrimeHelper(n2));
    }
    public static boolean isPrimeHelper(int n){
        if(n==1 || n==2 || n==3 ){return true;}
        if(n<=0){return false;}

        int i=3;
        while(i<n){
            if(n%i==0){
                return false;
                
            }
            i++;
        }
        return true;
    }
}
