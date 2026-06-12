package LeetCode150.LeetCode150_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q_91_Clone_Graph {
    public static void main(String[] args) {
      // Build graph: [[2,4],[1,3],[2,4],[1,3]]
        Node node1=new Node(1);        Node node2=new Node(2);
        Node node3=new Node(3);        Node node4=new Node(4);   

        node1.neighbors.add(node2);        node1.neighbors.add(node4);

        node2.neighbors.add(node1);        node2.neighbors.add(node3);

        node3.neighbors.add(node2);        node3.neighbors.add(node4);

        node4.neighbors.add(node1);        node4.neighbors.add(node3);

        System.out.println("Input Graph : [[2,4],[1,3],[2,4],[1,3]]");

        Node cloned = cloneGraph(node1);
        System.out.println("Graph cloned successfully.");
        System.out.println("Cloned Graph: [[2,4],[1,3],[2,4],[1,3]]");
    }
    public static Node cloneGraph(Node node){
        if(node ==null ) return null;
        Map<Node,Node>map=new HashMap<>();
        return dfs(node,map);
    }
    public static Node dfs(Node node,Map<Node,Node>map){
        if(map.containsKey(node)){ return map.get(node);}
        Node clone =new Node(node.val);
        map.put(node, clone);

       for (int i=0; i<node.neighbors.size(); i++) {
        Node neighbor=node.neighbors.get(i);
        clone.neighbors.add(dfs(neighbor, map));
    }
        return clone;
    }

    public static class Node{
        int val=0;public List<Node> neighbors;
        public Node(){
            int val=0; neighbors=new ArrayList<>();
        }
        public Node(int val){
            this.val=val; neighbors=new ArrayList<>();
        }
        public Node(int val,ArrayList<Node> neighbors){
            this.val=val; this.neighbors=neighbors;
        }
        
    }
}
