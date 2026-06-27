package LeetCode150.LeetCode150_1;

import java.util.Arrays;

public class Q_132_Plus_One {
    public static void main(String[] args) {
         int[] digits1 = {1, 2, 3};
        System.out.println("Input: " + Arrays.toString(digits1));
        System.out.println("Output: " + Arrays.toString(plusOne(digits1)));

        int[] digits2 = {9};
        System.out.println("\nInput: " + Arrays.toString(digits2));
        System.out.println("Output: " + Arrays.toString(plusOne(digits2)));
    }
public static int[] plusOne(int[] digits){
    int n=digits.length;

    for(int i=n-1;i>=0;i--){
        if(digits[i]<9){
            digits[i]++;
            return digits;
        }
        digits[i]=0;
    }

    int[] result =new int[n+1];
    result[0]=1;
    return result;
}

}
