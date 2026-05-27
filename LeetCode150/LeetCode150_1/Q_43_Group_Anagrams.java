package LeetCode150.LeetCode150_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q_43_Group_Anagrams {
    public static void main(String[] args) {
         String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("Input  : " + Arrays.toString(strs1));
        System.out.println("Output : " + groupAnagrams(strs1));

           String[] strs2 = {"a"};
        System.out.println("\nInput  : " + Arrays.toString(strs2));
        System.out.println("Output : " + groupAnagrams(strs2));
    }
    public static List<List<String>> groupAnagrams(String[] strs){
        if(strs==null || strs.length==0){ return new ArrayList<>();}
        Map<String ,List<String>>map=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String str=strs[i];

            char[] chars=str.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars);
            
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
