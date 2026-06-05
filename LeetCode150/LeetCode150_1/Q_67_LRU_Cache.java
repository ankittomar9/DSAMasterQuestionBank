package LeetCode150.LeetCode150_1;

import java.util.HashMap;
import java.util.Map;

public class Q_67_LRU_Cache {
    public static void main(String[] args) {
        LRUCache lRUCache=new LRUCache(2);
        lRUCache.put(1,1);
        lRUCache.put(2,2);
        System.out.println("get(1) -> "+lRUCache.get(1));
          lRUCache.put(3,3);
             System.out.println("get(2) -> "+lRUCache.get(2));
               lRUCache.put(4,4);
               System.out.println("get(1) -> "+lRUCache.get(1));
               System.out.println("get(3) -> "+lRUCache.get(3));
               System.out.println("get(4) -> "+lRUCache.get(4));
    }   
    public static class LRUCache{
        public static class Node{
            int key;int value;
            Node prev;Node next;
            public Node(int key,int value){
                this.key=key;this.value=value;
            }
        }
        private final int capacity;
        private final Map<Integer,Node>map;
        private final Node head,tail;
        
        public LRUCache(int capacity){
            this.capacity=capacity;
            this.map=new HashMap<>();
            this.head=new Node(0,0);
            this.tail=new Node (0,0);
            head.next=tail;
            tail.prev=head;
        }
        public void addNode(Node node){
            node.prev=head;
            node.next=head.next;
            head.next.prev=node;
            head.next=node;
        }
        public void removeNode(Node node){
            Node prev=node.prev;
            Node next=node.next;
            prev.next=next;
            next.prev=prev;
        }
        public int get(int key){
            if(!map.containsKey(key)){ return -1;}
            Node node=map.get(key);
            removeNode(node);
            addNode(node);
            return node.value;
        }

        public void put(int key,int value){
            if(map.containsKey(key)){
                Node node=map.get(key);
                node.value=value;
                removeNode(node);
                addNode(node);
            }else{
                if(map.size()==capacity){
                    map.remove(tail.prev.key);
                    removeNode(tail.prev);
                }
            }
            Node newNode =new Node(key,value);
            map.put(key, newNode);
            addNode(newNode);
        }   
    }
}
