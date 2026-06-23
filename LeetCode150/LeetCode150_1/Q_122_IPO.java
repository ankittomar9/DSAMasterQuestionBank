package LeetCode150.LeetCode150_1;

import java.util.Arrays;

public class Q_122_IPO {
    public static void main(String[] args) {
         int k = 2;
        int w = 0;
        int[] profits = {1, 2, 3};
        int[] capital = {0, 1, 1};

        System.out.println("k = " + k + ", w = " + w);
        System.out.println("profits = " + Arrays.toString(profits));
        System.out.println("capital = " + Arrays.toString(capital));
        System.out.println("Maximum Capital: " + findMaximizedCapital(k, w, profits, capital));
    }
}
