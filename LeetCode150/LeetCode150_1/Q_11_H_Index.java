package LeetCode150.LeetCode150_1;

import java.util.Arrays;

public class Q_11_H_Index {
    public static void main(String[] args) {
       int[] citations={3,0,6,1,5};  System.out.println("Array: " + Arrays.toString(citations));
       int result=hIndexHelper(citations);
        System.out.println("H-Index    : " + result);

        int[] massiveCitation = {100}; 
        System.out.println("Array: " + Arrays.toString(massiveCitation));
        System.out.println("H-Index: " + hIndexHelper(massiveCitation));
    }
    public static int hIndexHelper(int[] citations){
         int n=citations.length;
        if(citations==null || citations.length==0){
            return 0;
        }
        if(n==0){return 0;}
       
        Arrays.sort(citations);

        for(int i=0;i<n;i++){
            int papersRemaining=n-i;
            if(citations[i]>=papersRemaining){
                return papersRemaining;
            }
        }
        return 0;
    }
}
