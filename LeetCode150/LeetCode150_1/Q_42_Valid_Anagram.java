package LeetCode150.LeetCode150_1;

public class Q_42_Valid_Anagram {
    public static void main(String[] args) {
         String s1 = "anagram";        String t1 = "nagaram";
          System.out.println("Input s : " + s1);        System.out.println("Input t : " + t1);
        System.out.println("Output  : " + isAnagram(s1, t1));
       
        String s2 = "rat";        String t2 = "car";
     System.out.println("\nInput s : " + s2);        System.out.println("Input t : " + t2);
        System.out.println("Output  : " + isAnagram(s2, t2));
    }
    public static boolean isAnagram(String s,String t){
        if(s==null || t==null ||s.length()!=t.length()){
            return false;
        }
        int[] count=new int[26];

        for(int i=0;i<s.length();i++){
            char currentChar=s.charAt(i);
            int index=currentChar-'a';
            count[index]=count[index]+1;
        }

        for(int i=0;i<t.length();i++){
            char currentChar=t.charAt(i);
            int index=currentChar-'a';
            count[index]=count[index]-1;
        }

        for(int i=0;i<26;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
}

