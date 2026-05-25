package LeetCode150.LeetCode150_1;

import java.util.HashMap;
import java.util.Map;

public class Q_32_Substring_with_Concatenation_of_All_Words {
    public static void main(String[] args) {
        
    }

    public static List<Integer> findSubstring(String s,String[] words){
        List<Integer> result=new ArrayList<>();
        if(s==null || words ==null || words.length==0){return result;}
        
        int wordLen=words[0].length(); int totalLength=wordLen*words.length;
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<words.length;i++){
            String word=words[i];
            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
            }else{
                map.put(word, 1);
            }
        }

        

    }
}

