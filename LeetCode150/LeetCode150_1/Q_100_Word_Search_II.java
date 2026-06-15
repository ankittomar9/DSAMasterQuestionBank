package LeetCode150.LeetCode150_1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Q_100_Word_Search_II {
    public static void main(String[] args) {
         char[][] board = {
            {'o','a','a','n'},
            {'e','t','a','e'},
            {'i','h','k','r'},
            {'i','f','l','v'}
        };
        String[] words = {"oath","pea","eat","rain"};

        System.out.println("Input Board:");
        for (char[] row : board) {
            for (char c : row) System.out.print(c + " ");
            System.out.println();
        }
        System.out.println("\nWords: " + Arrays.toString(words));
        System.out.println("Found Words: " + findWords(board, words));
    }
    public static List<String> findWords(char[][] board,String[] words){
        List<String> result=new ArrayList<>();
        TrieNode root=buildTrie(words);

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                dfs(board,i,j,root,result);
            }
        }
        return result;
    }
    private static TrieNode buildTrie(String[] words){
        TrieNode root=new TrieNode();
        for(String word: words){
            TrieNode node =root;
            
            for(char c:word.toCharArray()){
                int idx=c-'a';
                if(node.children[idx]==null){
                    node.children[idx]=new TrieNode();
                }
                node=node.children[idx];
            }
            node.word=word;
        }   
        return root;
    }
    private static void dfs(char[][] board,int i,int j,TrieNode node,List<String> result){
        char c=board[i][j];
        if(c=='#'){ return ;}
        int idx=c-'a';
        if(node.children[idx]==null) return;
        
        node =node.children[idx];
        if(node.word!=null){
            result.add(node.word);
            node.word=null;
        }
        board[i][j]='#';
        if(i>0) dfs(board, i-1, j, node, result);
        if(i<board.length-1) dfs(board, i+1, j, node, result);
        if(j>0) dfs(board, i, j-1, node, result);
        if(j<board[0].length-1) dfs(board, i, j+1, node, result);
        board[i][j]=c;            
        }
        private static class TrieNode{
            TrieNode[] children =new TrieNode[26];
            String word;
        }

}
