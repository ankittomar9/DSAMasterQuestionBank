package LeetCodeAll.arrays;

import java.util.Arrays;

public class Q_101_H_Index_II {
    public static void main(String[] args) {
                // Test 1
        int[] c1 = {0, 1, 3, 5, 6};
        System.out.println("citations = " + Arrays.toString(c1));
        System.out.println("H-Index: " + hIndex(c1));

        // Test 2
        System.out.println();
        int[] c2 = {1, 2, 100};
        System.out.println("citations = " + Arrays.toString(c2));
        System.out.println("H-Index: " + hIndex(c2));

        // Test 3: all zeros
        System.out.println();
        int[] c3 = {0};
        System.out.println("citations = " + Arrays.toString(c3));
        System.out.println("H-Index: " + hIndex(c3));

        // Test 4: single high citation
        System.out.println();
        int[] c4 = {100};
        System.out.println("citations = " + Arrays.toString(c4));
        System.out.println("H-Index: " + hIndex(c4));

        // Test 5: all same
        System.out.println();
        int[] c5 = {5, 5, 5, 5, 5};
        System.out.println("citations = " + Arrays.toString(c5));
        System.out.println("H-Index: " + hIndex(c5));

    }
    public static int hIndex(int[] citations){
        int n=citations.length;
        int left=0; int right=n;

        while(left<right){
            int mid=left + (right-left)/2;

            if(citations[mid]>= n-mid){
                right=mid;
            }else{
                left=mid+1;
            }
        }

        return n-left;
    }
}
