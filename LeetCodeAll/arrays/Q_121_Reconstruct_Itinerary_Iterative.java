package LeetCodeAll.arrays;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Q_121_Reconstruct_Itinerary_Iterative {
    public static void main(String[] args) {
       List<List<String>> tickets = Arrays.asList(
            Arrays.asList("JFK","SFO"), Arrays.asList("JFK","ATL"),
            Arrays.asList("SFO","ATL"), Arrays.asList("ATL","JFK"),
            Arrays.asList("ATL","SFO")
        );
        System.out.println("Result: " + findItinerary(tickets)); 
    }
    public static List<String> findItinerary(List<List<String>> tickets){
        Map<String,PriorityQueue<String>> graph=new HashMap<>();
        for(List<String> t :tickets){
            graph.computeIfAbsent(t.get(0),k-> new PriorityQueue<>()).add(t.get(1));
        }
        LinkedList<String> result= new LinkedList<>();
        Deque<String> stack=new ArrayDeque<>();
        stack.push("JFK");

        while(!stack.isEmpty()){
            String curr=stack.peek();
            PriorityQueue<String> dests=graph.get(curr);


            if(dests!=null && !dests.isEmpty()){
                stack.push(dests.poll());
            }else{
                result.addFirst(stack.pop());
            }
        }
        return result;
    } 
}
