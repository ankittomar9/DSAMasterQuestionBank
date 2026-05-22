package LeetCode150.LeetCode150_1;

public class Q_23_Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static void main(String[] args) {
        String haystack1 = "sadbutsad";  System.out.println("Input haystack : " + haystack1);
        String needle1 = "sad";   System.out.println("Input needle   : " + needle1);
                System.out.println("Output  :\n " + strStr(haystack1, needle1));
        String haystack2 = "leetcode"; System.out.println("\nInput haystack : " + haystack2);
       String needle2 = "leeto"; System.out.println("Input needle   : " + needle2);
        System.out.println("Output : \n" + strStr(haystack2, needle2));
    }
    public static int strStr(String haystack,String needle){
        if(needle== null || needle.isEmpty()){
            return 0;
        }
        if (haystack==null || haystack.length()<needle.length()) {
            return -1;
        }
        int n=haystack.length()-needle.length();
        int m=needle.length();
        for(int i=0;i<=n;i++){
          if(haystack.substring(i,i+m).equals(needle)){
            return i;
          }
        }
        return -1;
    }
}
