package LeetCode150.LeetCode150_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_24_Text_Justification {
    public static void main(String[] args) {
          String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;

        System.out.println("Input Words : " + Arrays.toString(words));
        System.out.println("Max Width   : " + maxWidth);
        System.out.println("Justified Text:");

        List<String> result = fullJustify(words, maxWidth);

        // Traditional loop instead of for-each
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
    public static List<String> fullJustify(String[] words,int maxWidth){
        List<String>ans=new ArrayList<>();
            int n=words.length;            int index=0;
            
            while(index<n){
                int start=index; int lineLen=0;int count=0;

                while(index<n){
                    int extraSpace;
                    if(count>0){extraSpace=1;}
                    else{ extraSpace=0;}

                    if(lineLen+ words[index].length() + extraSpace>maxWidth){  break;       }

                    lineLen =lineLen +words[index].length()+extraSpace;
                    count++;
                    index++;
                }
                StringBuilder sb=new StringBuilder();
                int numWords=count;

                if(index==n || numWords==1){
                    for(int i=start;i<start+numWords;i++){
                        if(i>start){
                            sb.append(" ");
                        }
                        sb.append(words[i]);
                    }
                    while(sb.length() < maxWidth){
                        sb.append(" ");
                    }
                }else{
                    int totalSpace=maxWidth-(lineLen-(numWords-1));
                    int spacePergap=totalSpace/(numWords-1);
                    int extraSpaces=totalSpace%(numWords-1);
                
                    for(int i=start;i<start+numWords;i++){
                        sb.append(words[i]);
                        if(i <start +numWords-1){
                            int spaces=spacePergap;
                            if(extraSpaces >0){
                                spaces=spaces+1;
                                extraSpaces--;
                            }
                            for(int j=0;j<spaces;j++){
                                sb.append(" ");
                            }
                        }
                    }
                }
                ans.add(sb.toString());
            }
            return ans;
        }   
}
