package LeetCode150.LeetCode150_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
        public static double[] calcEquation
        (List<List<String>> equations,double[] values,
        List<List<String>> queries ){
                Map<String,Map<String,Double>> graph=new HashMap<>();

           for(int i=0;i<equations.size();i++){
            String a=equations.get(i).get(0);
            String b=equations.get(i).get(1);
            double value=values[i];
            
            graph.putIfAbsent(a, new HashMap<>());
            graph.putIfAbsent(b, new HashMap<>());
            
            graph.get(a).put(b, value);
            graph.get(b).put(a, 1.0/value);
           }     
           double[] results=new double[queries.size()];
           for(int i=0;i<queries.size();i++){
            String start=queries.get(i).get(0);
            String end=queries.get(i).get(1);

            if(!graph.containsKey(start) || !graph.containsKey(end)){
                results[i]= -1.0;
            }else if(start.equals(end)){
                results[i]=1.0;
            }else{
                results[i]=dfs(start, end, graph, new HashSet<>(), 1.0);
            }
           }
           return results;
          }
           private static double dfs(String current,String target,
            Map<String,Map<String,Double>> graph,Set<String> visited,double product){
               
                if(current.equals(target)){  return product;    }
                visited.add(current);

               for (Map.Entry<String, Double>neighbor : graph.get(current).entrySet()) {
            String next=neighbor.getKey();
            if (!visited.contains(next)) {
                double result = dfs(next, target, graph, visited, product * neighbor.getValue());
                if (result != -1.0) {
                    return result;
                }
            }
        }
        visited.remove(current);
        return -1.0;   
            }
}
