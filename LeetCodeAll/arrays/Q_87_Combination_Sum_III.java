package LeetCodeAll.arrays;

import java.util.ArrayList;
import java.util.List;

public class Q_87_Combination_Sum_III {
    public static void main(String[] args) {
          System.out.println("k=3, n=7  → " + combinationSum3(3, 7));
        // Test 2
        System.out.println("k=3, n=9  → " + combinationSum3(3, 9));
        // Test 3: impossible — min sum of 4 nums = 1+2+3+4=10 > 1
        System.out.println("k=4, n=1  → " + combinationSum3(4, 1));
        // Test 4: impossible — max sum of 2 nums = 8+9=17 < 18
        System.out.println("k=2, n=18 → " + combinationSum3(2, 18));
        // Test 5: all digits
        System.out.println("k=9, n=45 → " + combinationSum3(9, 45));
        // Test 6
        System.out.println("k=2, n=17 → " + combinationSum3(2, 17));
    }
     public static List<List<Integer>> combinationSum3(int k,int n){
        List<List<Integer>> result=new ArrayList<>();
       backtrack(1, k, n, new ArrayList<>(), result);
        return result;
    }
    public static void backtrack(int start,int k,int remain,List<Integer> current,
        List<List<Integer>> result){

    if (k == 0 && remain == 0) {
        result.add(new ArrayList<>(current));
        return;
    }
    if (k == 0 || remain <= 0) return;

    for (int digit = start; digit <= 9; digit++) {
        current.add(digit);
        backtrack(digit + 1, k - 1, remain - digit, current, result);
        current.remove(current.size() - 1);
    }
}
     }
