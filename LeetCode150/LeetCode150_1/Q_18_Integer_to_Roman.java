package LeetCode150.LeetCode150_1;

public class Q_18_Integer_to_Roman {
    public static void main(String[] args) {
        int num = 1994;
        // int num = 58;            // int num = 3999;

        System.out.println("Integer : " + num);
        String roman = intToRoman(num);
        System.out.println("Roman   : " + roman);
            int num2=58;
          System.out.println("Integer : " + num2);
        String roman2 = intToRoman(num2);
        System.out.println("Roman   : " + roman2);

    }
    public static String intToRoman(int num){
        if(num<0){return "-1";}
        if(num==0){return "0";}
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbols={"M", "CM", "D", "CD", "C", "XC",
         "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<values.length;i++){
            while(num >= values[i]){
                sb.append(symbols[i]);
                num=num-values[i];
            }
        }
        return sb.toString();
    }
}
