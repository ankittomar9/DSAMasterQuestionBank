package LeetCode150.LeetCode150_1;

public class Q_25_Valid_Palindrome {
    public static void main(String[] args) {
           String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";

        System.out.println("Input : \n"+s1);
        System.out.println("Output : " + isPalindrome(s1));

               System.out.println("Input : \n"+s2);
        System.out.println("Output : " + isPalindrome(s2));
    }
    public static boolean isPalindrome(String s){
        if(s==null || s.isEmpty()){return true;}
        int left=0;int right=s.length()-1;

        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

             while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) !=
             Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
