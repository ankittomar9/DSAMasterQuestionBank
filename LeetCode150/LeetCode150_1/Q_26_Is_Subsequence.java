package LeetCode150.LeetCode150_1;

public class Q_26_Is_Subsequence {
    public static void main(String[] args) {
        String s1="abc";      String t1 = "ahbgdc";
        System.out.println("Original String  S : "+s1);
         System.out.println("Original String  T : "+t1);  
        System.out.println("SubSequence is "+isSubSequence(s1, t1));
        String s2 = "axc";        String t2 = "ahbgdc";
          System.out.println("Original String  S : "+s2);
         System.out.println("Original String  T : "+t2);
          System.out.print("SubSequence is "+isSubSequence(s2, t2));
    }
    public static boolean isSubSequence(String s,String t){
        if(s==null || s.isEmpty()){return true;}
        if(t==null || t.length()<s.length()){return false;}

        int i=0;

        for(int j=0;j<t.length();j++){
            if(t.charAt(j)==s.charAt(i)){
                i++;
            }
            if(i==s.length()){
                return true;
            }
        }
        return i==s.length();
    }
}
