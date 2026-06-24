package LeetCode150.LeetCode150_1;

public class Q_127_Number_of_1_Bits {
    public static void main(String[] args) {
         int n = 0b00000000000000000000000000001011; // 11 in decimal
        System.out.println("Input (binary): " +
            String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0'));
        System.out.println("Number of 1 Bits: " + hammingWeight(n));
    }
}
