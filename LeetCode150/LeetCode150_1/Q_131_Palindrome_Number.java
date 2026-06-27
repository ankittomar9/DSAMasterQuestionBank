package LeetCode150.LeetCode150_1;

public class Q_131_Palindrome_Number {
    public static void main(String[] args) {
         System.out.println(isPalindrome(121));   // true
        System.out.println(isPalindrome(-121));  // false
        System.out.println(isPalindrome(10));    // false
    }
    public static boolean isPalindrome(int x){
        if(x<0){return false;}
        long reversed=0; 
        int original=x;

        while(x!=0){
            int extract=x%10;
            reversed=reversed*10+extract;
            x=x/10;
        }   
        return reversed==original;
    }
}
