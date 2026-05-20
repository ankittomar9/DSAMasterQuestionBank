package LeetCode150.LeetCode150_1;

public class Q_17_Roman_to_Integer {
    public static void main(String[] args) {
          String s = "MCMXCIV";
        // String s = "III";
        // String s = "LVIII";
        // String s = "IX";
        System.out.println("Roman : " + s);
        int num = romanToInt(s);
        System.out.println("Integer : " + num);
    }
     private static int valueOf(char c) {
        switch (c) {
            case 'I': return 1;   case 'V': return 5;  case 'X': return 10;  case 'L': return 50;
         case 'C': return 100; case 'D': return 500; case 'M': return 1000;  default:  return 0;}
        }
    public static int romanToInt(String s){
        if(s==null || s.length()==0){return 0;}

        int n=s.length();
        int result=0;

        for(int i=0;i<n;i++){
            int current=valueOf(s.charAt(i));

            if(i+1 < n  && current < valueOf(s.charAt(i+1))){
                result=result-current;
            }else{
                result=result+current;
            }
            
        }
        return result;
    }
}
