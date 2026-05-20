package LeetCode150.LeetCode150_1;

public class Q_19_Length_of_Last_Word {
    public static void main(String[] args) {
          String s1= "Hello World";
        String s2= "   fly me   to   the moon  ";

         System.out.println("Input String : \n"+s1);
        System.out.println("Output : " + lengthOfLastWord(s1));

        System.out.println("Input String : \n"+s2);
        System.out.println("Output : " + lengthOfLastWord(s2));
    }
    public static int lengthOfLastWord(String s){
        if(s==null || s.isEmpty()){return 0;        }

        int i=s.length()-1;
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        if(i<0){
            return 0;
        }
        int length=0;

           while(i>=0 && s.charAt(i)!=' '){
            length++;
            i--;
        }
        return length;
    }
}
