package LeetCode150.LeetCode150_1;

public class Q_21_Reverse_Words_in_a_String_1 {
    public static void main(String[] args){
        String s1 = "  the sky   is blue  ";
        System.out.println("Original String  : \n" + s1);
        String str2 = reverseWords(s1);
        System.out.println("Reverse Words    : \n" + str2);
    }
    public static String reverseWords(String s){
        if (s==null || s.isEmpty()) {
            return "";
        }

        StringBuilder sb=new StringBuilder();
        int i=s.length() - 1;

        while (i>=0) {
         while (i>= 0 && s.charAt(i)==' ') {
                i--;
            }
            if (i<0) {
                break;
            }
            int j = i;
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            sb.append(s.substring(i + 1, j + 1)).append(" ");
        }
        return sb.toString().trim();
    }
}
    

