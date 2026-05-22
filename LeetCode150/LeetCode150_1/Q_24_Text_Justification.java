package LeetCode150.LeetCode150_1;

import java.util.ArrayList;

public class Q_24_Text_Justification {
    public static void main(String[] args) {
        
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

                    if(lineLen+ words[index].length()+extraSpace>maxWidth){
                        break;
                    }
                    lineLen =lineLen +words[index].length()+extraSpace;
                    count++;index++;
                }
            }
        }   
}
