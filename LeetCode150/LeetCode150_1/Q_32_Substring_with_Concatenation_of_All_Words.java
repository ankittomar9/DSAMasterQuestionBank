package LeetCode150.LeetCode150_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q_32_Substring_with_Concatenation_of_All_Words {
    public static void main(String[] args) {
          String s = "barfoothefoobarman"; System.out.println("Input s     : " + s);
        String[] words = {"foo", "bar"};  System.out.println("Input words : " + Arrays.toString(words));
        System.out.println("Output      : " + findSubstring(s, words));
    }

    public static List<Integer> findSubstring(String s,String[] words){
        List<Integer> result=new ArrayList<>();
        if(s==null || words ==null || words.length==0){return result;}
        
        int wordLen=words[0].length(); int totalLength=wordLen*words.length;
        
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
            }else{
                map.put(word, 1);
            }
        }

        for(int i=0;i<=s.length()-totalLength;i++){
            Map<String,Integer> windowCount=new HashMap<>();
            boolean valid=true;

        for(int j=0;j<words.length;j++){
            int start=i+j * wordLen;
            int end =start +wordLen;
            String word =s.substring(start,end);
            
             if(!map.containsKey(word)){
                valid=false; break;
             }   

             if(windowCount.containsKey(word)){
                windowCount.put(word, windowCount.get(word)+1);
             }else{
                windowCount.put(word, 1);
             }
             if(windowCount.get(word)>map.get(word)){
                valid=false; break;
             }
         }
         if(valid && windowCount.equals(map)){
            result.add(i);
         }
        }
        return result;
    }
}

