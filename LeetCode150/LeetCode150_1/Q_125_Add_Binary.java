package LeetCode150.LeetCode150_1;

public class Q_125_Add_Binary {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));     // "100"
        System.out.println(addBinary("1010", "1011")); // "10101"
    }
    public static String addBinary(String a ,String b){
        StringBuilder sb=new StringBuilder();
        int i=a.length()-1;int j=b.length()-1;
        int carry=0;


        while(i>=0 || j>=0 || carry>0){
            int sum=carry;
            if(i>=0){
                sum=sum+a.charAt(i)-'0';
                i--;
            }

            if(j>=0){
                sum=sum+b.charAt(j)-'0';
                j--;
            }
            int newSum=sum%2;
            sb.append(newSum);
            carry=sum/2;
        }
        return sb.reverse().toString();
    }
}
