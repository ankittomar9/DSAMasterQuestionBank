package LeetCode150.LeetCode150_1;

public class Q_126_Reverse_Bits {
    public static void main(String[] args) {
        int n1=0b00000010100101000001111010011100;
          System.out.println("Input (binary):  " + 
          String.format("%32s", Integer.toBinaryString(n1)).replace(' ', '0'));
    
     int reversed = reverseBits(n1);
        System.out.println("Output (decimal): " + reversed);
        System.out.println("Output (binary):  " + 
        String.format("%32s", Integer.toBinaryString(reversed)).replace(' ', '0'));
       
        int n2=10;   System.out.println("Input (binary):  " + 
     String.format("%32s", Integer.toBinaryString(n2)).replace(' ', '0'));
    
     int reversed2 = reverseBits(n2);
        System.out.println("Output (decimal): " + reversed2);
        System.out.println("Output (binary):  " + 
        String.format("%32s", Integer.toBinaryString(reversed2)).replace(' ', '0'));
       
    }

    public static int reverseBits(int n){
        int result=0;
        for(int i=0;i<32;i++){
            result=(result<<1) | (n&1);
            n=n>>1;
        }
        return result;
    }
}
