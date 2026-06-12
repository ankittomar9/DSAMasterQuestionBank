package LeetCode150.LeetCode150_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q_92_Evaluate_Division {
    public static void main(String[] args) {
        List<List<String>> equations=Arrays.asList(
            Arrays.asList("a","b"),
            Arrays.asList("b","c") );
        double[] values={2.0,3.0};
        List<List<String>> queries=Arrays.asList(
             Arrays.asList("a","c"),
            Arrays.asList("b","a"),
             Arrays.asList("a","e"),
            Arrays.asList("a","a"),
            Arrays.asList("x","x"));
            
             System.out.println("Input Equations: " + equations);
        System.out.println("Values: " + Arrays.toString(values));
        System.out.println("Queries: " + queries);
        System.out.println("Results: " + Arrays.toString(calcEquation(equations, values, queries)));
        }
        public static double[] calcEquation(List<List<String>> equations,double[] values,
            List<List<String>> queries ){
                Map<String,Map<String,Double>> graph=new HashMap<>();

                

             }

}
