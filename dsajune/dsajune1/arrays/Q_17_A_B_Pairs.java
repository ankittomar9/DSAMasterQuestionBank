package dsajune.dsajune1.arrays;

public class Q_17_A_B_Pairs {
 public static void main(String args[]){
    String s1="dcabbaab";
    System.out.println("Original String : "+s1);
    pairHelper(s1);
 }   
 public static void pairHelper(String s1){
    if(s1==null || s1.length()==0){System.out.println("String is empty or null");return ;}

    long totalPairs=0;
    int aCount=0;

    for(int i=0;i<s1.length();i++){
        char currentChar=s1.charAt(i);

        if(currentChar =='a'){
            aCount++;
        }else if(currentChar =='b'){
            totalPairs=totalPairs+aCount;
        }
    }
    System.out.println("Total count of (a,b) pairs are : "+totalPairs);
 }
}
