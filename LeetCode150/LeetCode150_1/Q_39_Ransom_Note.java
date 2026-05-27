package LeetCode150.LeetCode150_1;

public class Q_39_Ransom_Note {
    public static void main(String[] args) {
        
        String ransom1 = "aa";        String magazine1 = "aab";
         System.out.println("Input ransomNote : " + ransom1);
        System.out.println("Input magazine   : " + magazine1);
   System.out.println("Output           : " + canConstruct(ransom1, magazine1));

        String ransom2 = "aa";        String magazine2 = "ab";    
             System.out.println("\nInput ransomNote : " + ransom2);
        System.out.println("Input magazine   : " + magazine2);
        System.out.println("Output           : " + canConstruct(ransom2, magazine2));
    }
    public static boolean canConstruct(String ransomNote,String magazine){
        if(ransomNote==null || magazine==null ){ return false;}
        if(ransomNote.length() > magazine.length()){ return false;}
         int[] count = new int[26];

    for (int i = 0; i < magazine.length(); i++) {
        char currentChar = magazine.charAt(i);
        int index = currentChar - 'a';
        count[index] = count[index] + 1;
            }
    for (int i=0; i<ransomNote.length(); i++) {
        char currentChar=ransomNote.charAt(i);
        int index=currentChar - 'a';
        count[index]=count[index] - 1;

        if (count[index]<0) {
            return false; 
        }
    }
    return true;
        
    }
}
