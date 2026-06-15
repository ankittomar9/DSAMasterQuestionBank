package LeetCode150.LeetCode150_1;

public class Q_98_Implement_Trie {
    public static void main(String[] args) {
        
    }
    public static class Trie{
        public TrieNode root;
        public Trie(){root=new TrieNode();}
    }
    public void insert(String word){
        TrieNode node=root;
        for(char c: word.toCharArray()){
            int index=c-'a';
            if(node.children[index]==null){
                node.children[index]=new TrieNode();
            }
            node=node.children[index];
        }
        node.isEnd=true;
    }
    public boolean search(String word){
        TrieNode node=root;
        for(char c:word.toCharArray()){
            int index=c-'a';
            if(node.children[index]==null){
                return false;
            }
            node =node.children[index];
        }
        return node.isEnd;
    }
    public boolean startsWith(String prefix){
             TrieNode node=root;
        for(char c:prefix.toCharArray()){
            int index=c-'a';
            if(node.children[index]==null){
                return false;
            }
            node =node.children[index];
        }
        return true;
    }
    public static class TrieNode{
        TrieNode[] children =new TrieNode[26];
        boolean isEnd;
    }
}
