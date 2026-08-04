package LeetCodeAll.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_114_Count_Smaller_Numbers_After_Self_1 {
    public static void main(String[] args) {
        int[] nums1 = {5, 2, 6, 1};
        System.out.println("nums = " + Arrays.toString(nums1));
        System.out.println("Result: " + countSmaller(nums1));

        int[] nums2 = {-1, -1};
        System.out.println("\nnums = " + Arrays.toString(nums2));
        System.out.println("Result: " + countSmaller(nums2));

        int[] nums3 = {5, 4, 3, 2, 1};
        System.out.println("\nnums = " + Arrays.toString(nums3));
        System.out.println("Result: " + countSmaller(nums3));

        int[] nums4 = {1, 2, 3, 4, 5};
        System.out.println("\nnums = " + Arrays.toString(nums4));
        System.out.println("Result: " + countSmaller(nums4)); 
    }

    static int[] counts;
    public static List<Integer> countSmaller(int[] nums) {
        int n = nums.length;        counts = new int[n];
        // Wrap values with their original indices
        Pair[] pairs = new Pair[n];
        for (int i=0; i<n; i++) {
            pairs[i] = new Pair(nums[i], i);
        }
        mergeSort(pairs, 0, n - 1);
        List<Integer>result = new ArrayList<>(n);
        for (int c : counts) {
            result.add(c);
        }
        return result;
    }

    private static void mergeSort(Pair[] arr, int left, int right) {
        if (left >= right) return;
        int mid = left+(right-left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(Pair[] arr, int left, int mid, int right) {
        List<Pair> temp = new ArrayList<>();
        int i = left, j = mid + 1;        int rightCount = 0;

        while (i <= mid && j <= right) {
            if (arr[j].value < arr[i].value) {                temp.add(arr[j++]);                rightCount++;
            } else {                counts[arr[i].index] += rightCount;                temp.add(arr[i++]);
            }
        }
        while (i<=mid) {
            counts[arr[i].index] += rightCount;
            temp.add(arr[i++]);
        }
        while (j <= right) {    
                    temp.add(arr[j++]);        }

        for (int k = 0; k < temp.size(); k++) {            arr[left + k] = temp.get(k);   
         }    
        }
    static class Pair {        int value;        int index;        Pair(int v, int i) {
            value = v;  index = i;        }    }}
