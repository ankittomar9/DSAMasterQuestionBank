package LeetCode150.LeetCode150_1;

import java.util.HashMap;
import java.util.Map;

public class Q_41_Word_Pattern {
    public static void main(String[] args) {
         String pattern1 = "abba";        String s1 = "dog cat cat dog";
        System.out.println("Input pattern : " + pattern1);
        System.out.println("Input s       : " + s1);
        System.out.println("Output        : " + wordPattern(pattern1, s1));


        String pattern2 = "abba";        String s2 = "dog cat cat fish";
        System.out.println("\nInput pattern : " + pattern2);
        System.out.println("Input s       : " + s2);
        System.out.println("Output        : " + wordPattern(pattern2, s2));
    }
    public static boolean wordPattern(String pattern,String s){
        if(pattern ==null || s==null || pattern.length()==0 || s.length()==0){ return false;}
        String[] words=s.split(" ");
        if(pattern.length() !=words.length){return false;}
        Map<Character,String> charToWord=new HashMap<>();
        Map<String,Character>wordToChar=new HashMap<>();


        for(int i=0; i<pattern.length();i++){
            char c=pattern.charAt(i);
            String word=words[i];
            
            if(charToWord.containsKey(c)){
                  if(!charToWord.get(c).equals(word)) { 
                    return false; 
                 }
                  
            }  else{charToWord.put(c, word); }       

            if(wordToChar.containsKey(word)){
                  if(wordToChar.get(word)!=c){ return false; }                
                      }
            else   
            {  wordToChar.put(word, c); }
        }
          return true;
    }
}
