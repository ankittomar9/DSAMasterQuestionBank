package LeetCode150.LeetCode150_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Q_97_Word_Ladder {
    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");

        System.out.println("beginWord : " + beginWord);        System.out.println("endWord   : " + endWord);
        System.out.println("wordList  : " + wordList);
        System.out.println("Shortest Ladder Length: " + ladderLength(beginWord, endWord, wordList)); 
    }
    public static int ladderLength(String beginWord,String endWord,List<String>wordList){
        Set<String> wordSet=new HashSet<>(wordList);
        
        if(!wordSet.contains(endWord)) return 0;
        Queue<String> queue=new LinkedList<>();
        Set<String> visited =new HashSet<>();

        queue.offer(beginWord);visited.add(beginWord);
        int level=1;

        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                String current =queue.poll();
                if(current.equals(endWord)){
                    return level;
                }

                char[] wordArray=current.toCharArray();
                for(int j=0;j<current.length();j++){
                    char original=wordArray[j];
                    for(char c='a' ;c<='z';c++){
                        wordArray[j]=c;
                        String nextWord=new String(wordArray);
                        if(wordSet.contains(nextWord) && !visited.contains(nextWord)){
                            visited.add(nextWord);
                            queue.offer(nextWord);
                        }
                    }
                    wordArray[j]=original;
                }
            }
            level++;
        }
        return 0;
    }
}
