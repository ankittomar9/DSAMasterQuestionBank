package LeetCode150.LeetCode150_1;

public class Q_99_Design_Add_and_Search_Words_Data_Structure {
    public static void main(String[] args) {
        WordDictionary wd = new WordDictionary();
        wd.addWord("bad");
        wd.addWord("dad");
        wd.addWord("mad");

        System.out.println(wd.search("pad")); // false
        System.out.println(wd.search("bad")); // true
        System.out.println(wd.search(".ad")); // true
        System.out.println(wd.search("b..")); // true
    }
    public static class WordDictionary{
        private TrieNode root;
        public WordDictionary(){            root=new TrieNode();        }
        public void addWord(String word){
            TrieNode node=root;
            for(char c:word.toCharArray()){
                int index=c-'a';
                if(node.children[index]==null){
                    node.children[index]=new TrieNode();
                }
                node=node.children[index];
            }
            node.isEnd=true;
        }
        public boolean search(String word){
            return searchHelper(root,word,0);
        }
        private boolean searchHelper(TrieNode node,String word,int index){
            if(index==word.length()){ return node.isEnd;}
            char c=word.charAt(index);
            if(c=='.'){
                for(int i=0;i<26;i++){
                    if(node.children[i]!=null && searchHelper(node.children[i],word, index+1)){
                        return true;
                    }
                }
                return false;
            }else{
                int idx=c-'a';
                  if(node.children[idx]==null){
                        return false;
                    }
                    return  searchHelper(node.children[idx], word, index+1);
                }
                
            }
            private static class TrieNode{
                TrieNode[] children=new TrieNode[26];
                boolean isEnd=false;
            }
        }        
    }

